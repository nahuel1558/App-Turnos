package com.turnos.infrastructure.web;

import com.turnos.application.commands.usuarios.RegistroUsuarioCommand;
import com.turnos.application.queries.usuarios.ListaUsuarioResponse;
import com.turnos.application.queries.usuarios.PerfilUsuarioResponse;
import com.turnos.application.services.command.UsuarioCommandService;
import com.turnos.application.services.queries.UsuarioQueryService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioCommandService commandService;
    private final UsuarioQueryService queryService;

    public UsuarioController(UsuarioCommandService commandService, UsuarioQueryService queryService) {
        this.commandService = commandService;
        this.queryService = queryService;
    }

    @PostMapping("/registro")
    public ResponseEntity<UUID> registrarUsuario(
            @Valid @RequestBody RegistroUsuarioCommand command) {
        return ResponseEntity.ok(commandService.handle(command));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PerfilUsuarioResponse> obtenerPerfil(
            @PathVariable UUID id) {
        return ResponseEntity.ok(queryService.getUserProfile(id));
    }

    @GetMapping
    public ResponseEntity<List<ListaUsuarioResponse>> listarUsuariosPorTenant(
            @RequestParam Long tenantId,
            @AuthenticationPrincipal UUID currentUserId) {
        return ResponseEntity.ok(queryService.listUsersByTenant(tenantId));
    }
}

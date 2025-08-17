package com.turnos.application.services.queries;

import com.turnos.application.mappers.UsuarioMapper;
import com.turnos.application.queries.usuarios.ListaUsuarioResponse;
import com.turnos.application.queries.usuarios.PerfilUsuarioResponse;
import com.turnos.infrastructure.persistence.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UsuarioQueryService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    public PerfilUsuarioResponse getUserProfile(UUID userId) {
        return usuarioRepository.findById(userId)
                .map(usuarioMapper::toProfileResponse)
                .orElseThrow(() -> new UserNotFoundException(userId));
    }

    public List<ListaUsuarioResponse> listUsersByTenant(Long tenantId) {
        return usuarioRepository.findByTenantId(tenantId).stream()
                .map(usuarioMapper::toListResponse)
                .toList();
    }
}
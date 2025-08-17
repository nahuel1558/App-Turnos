package com.turnos.application.services.command;

import com.turnos.application.commands.usuarios.ActualizarUsuarioCommand;
import com.turnos.application.commands.usuarios.RegistroUsuarioCommand;
import com.turnos.domain.exceptions.usuario.EmailAlreadyExistsException;
import com.turnos.domain.exceptions.usuario.UsuarioNotFoundException;
import com.turnos.domain.models.core.Usuario;
import com.turnos.infrastructure.persistence.TenantRepository;
import com.turnos.infrastructure.persistence.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsuarioCommandService {
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final TenantRepository tenantRepository;
    private final ApplicationEventPublisher eventPublisher;

    @Transactional
    public UUID handle(RegistroUsuarioCommand command){
        if(usuarioRepository.existsByEmail(command.getEmail())){
            throw new EmailAlreadyExistsException(command.email());
        }

        Usuario usuario = Usuario.builder()
                .nombreApellido(command.nombreApellido())
                .email(command.email())
                .passwordHash(passwordEncoder.encode(command.password()))
                .celular(command.celular())
                .preferenciaNotificacion(command.preferenciaNotificacion())
                .build();

        usuario = usuarioRepository.save(usuario);
        eventPublisher.publishEvent(new UserRegisteredEvent(usuario.getId()));
        return usuario.getId();
    }

    @Transactional
    public void updateUser(UUID userId, ActualizarUsuarioCommand command) {
        Usuario usuario = usuarioRepository.findById(userId)
                .orElseThrow(() -> new UsuarioNotFoundException(userId));

        usuario.setNombreApellido(command.nombreApellido());
        usuario.setCelular(command.celular());
        usuario.setPreferenciaNotificacionEnum(command.preferenciaNotificacionEnum());
    }
    }

}

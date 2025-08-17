package com.turnos.domain.exceptions.usuario;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNotFoundException extends RuntimeException {
    public UsuarioNotFoundException(UUID userId) {
        super("Usuario con ID " + userId + " no encontrado");
    }
}

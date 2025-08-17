package com.turnos.application.queries.usuarios;

import com.turnos.domain.models.core.PreferenciaNotificacionEnum;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.UUID;

@Value
@Builder
@Jacksonized
public class PerfilUsuarioResponse {
    UUID usuarioId;
    String nombreApellido;
    String email;
    String password;
    String celular;
    PreferenciaNotificacionEnum preferenciaNotificacionEnum;
}

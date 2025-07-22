package com.turnos.dtos.response;

import com.turnos.models.core.PreferenciaNotificacionEnum;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.UUID;

@Value
@Builder
@Jacksonized
public class UsuarioResponse {
    UUID usuarioId;
    String nombreApellido;
    String email;
    String celular;
    PreferenciaNotificacionEnum preferenciaNotificacionEnum;
}

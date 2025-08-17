package com.turnos.dtos.request;

import com.turnos.domain.models.core.PreferenciaNotificacionEnum;
import lombok.Data;

@Data
public class UsuarioRegistroRequest {
    private String nombreApellido;
    private String password;
    private String email;
    private String celular;
    private PreferenciaNotificacionEnum preferenciaNotificacionEnum;
    private Long tenantId;
}

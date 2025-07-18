package com.turnos.dtos.request;

import com.turnos.models.core.PreferenciaMensajes;
import lombok.Data;

@Data
public class UsuarioRegistroRequest {
    private String nombreApellido;
    private String password;
    private String email;
    private String celular;
    private PreferenciaMensajes preferenciaMensajes;
    private Long tenantId;
}

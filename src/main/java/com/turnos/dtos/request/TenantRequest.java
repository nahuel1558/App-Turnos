package com.turnos.dtos.request;

import lombok.Data;

@Data
public class TenantRequest {
    private String nombre;
    private String dominio;
    private String rubro;
    private String ubicacion;
    private ConfiguracionTenantRequest configuracion;
}

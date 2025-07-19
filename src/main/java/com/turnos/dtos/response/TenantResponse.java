package com.turnos.dtos.response;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class TenantResponse {
     Long tenantId;
     String nombre;
     String dominio;
     String ubicacion;
     String rubro;
     ConfiguracionTenantResponse configuracionTenantResponse;
}

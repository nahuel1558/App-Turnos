package com.turnos.dtos.response;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;
import java.time.Duration;

@Value
@Builder
@Jacksonized
public class ServicioResponse {
    Long servicioId;
    String nombre;
    String descripcion;
    Duration duracion;
    BigDecimal precio;
    Boolean requiereSeña;
    String porcentajeSeña;
    BigDecimal montoSeña;
    Boolean servicioActivo;
    Long tenantId;
}

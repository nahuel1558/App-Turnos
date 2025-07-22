package com.turnos.dtos.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.Duration;

@Data
public class ServicioRequest {
    private String nombre;
    private String descripcion;
    private Duration duracion;
    private BigDecimal precio;
    private Boolean requiereSeña;
    private String porcentajeSeña;
    private BigDecimal montoSeña;
    private Boolean servicioActivo;
    private Long tenantId;
}

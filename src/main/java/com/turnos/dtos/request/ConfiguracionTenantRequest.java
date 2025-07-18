package com.turnos.dtos.request;

import lombok.Data;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Set;

@Data
public class ConfiguracionTenantRequest {
    private String estiloCSS;
    private String zonaHoraria;
    private LocalTime horaApertura;
    private LocalTime horaCierre;
    private Set<DayOfWeek> diasLaborales;
    private Integer antelacionMinimareserva;
    private Integer antelacionMaximaReserva;
}

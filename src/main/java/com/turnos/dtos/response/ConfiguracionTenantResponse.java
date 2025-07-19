package com.turnos.dtos.response;

import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Set;

@Value
@Builder
@Jacksonized
public class ConfiguracionTenantResponse {
    Long configuracionId;
    String estiloCSS;
    String zonaHoraria;
    LocalTime horaApertura;
    LocalTime horaCierre;
    Set<DayOfWeek> diasLaborales;
    Integer antelacionMinimaReserva;
    Integer antelacionMaximaReserva;
}

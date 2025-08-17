package com.turnos.dtos.response;


import com.turnos.domain.models.turnos.EstadoTurnoEnum;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDateTime;
import java.util.List;

@Value
@Builder
@Jacksonized
public class TurnoResponse {
    Long turnoId;
    LocalDateTime fechaHoraInicio;
    LocalDateTime fechaHoraFin;
    UsuarioResponse cliente;
    String comentario;
    UsuarioResponse empleado;
    ServicioResponse servicioResponse;
    EstadoTurnoEnum estadoTurnoEnum;
    List<PagoResponse> pagoResponseList;
}

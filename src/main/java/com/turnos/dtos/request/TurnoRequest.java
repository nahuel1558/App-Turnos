package com.turnos.dtos.request;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class TurnoRequest {
    private LocalDateTime fechaHoraInicio;
    private String comentario;
    private Long servicioId;
    private UUID empleadoId;
    private UUID clienteId;
    private PagoRequest pagoRequest;

}

package com.turnos.dtos.request;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ServicioEmpleadoRequest {
    private Long servicioId;
    private List<UUID> empleadosIds;

}

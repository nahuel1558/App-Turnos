package com.turnos.domain.models.servicio_empleado;

import com.turnos.domain.models.core.Usuario;
import com.turnos.domain.models.servicios.Servicio;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table (name = "servicio_empleado")
@Builder @NoArgsConstructor @AllArgsConstructor
public class ServicioEmpleado {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "empelado_id")
    private Usuario empleado;

    @ManyToOne
    @JoinColumn (name = "servicio_id")
    private Servicio servicio;

    private LocalDateTime fechaAsignacion;
    private Boolean activo;
}

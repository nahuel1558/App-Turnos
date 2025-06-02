package com.turnos.models.turnos;

import com.turnos.models.empleados.Empleado;
import com.turnos.models.servicios.Servicio;
import com.turnos.models.clientes.Cliente;
import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaHora;
    private EstadoTurno estado;

    @ManyToOne
    private Empleado empleado;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Servicio servicio;
}

package com.turnos.models.servicio_empleado;

import com.turnos.models.core.Usuario;
import com.turnos.models.servicios.Servicio;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table (name = "servicio_empleado")
@Builder @NoArgsConstructor @AllArgsConstructor
public class ServicioEmpleado {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(name = "usuario_empelado")
    private Usuario empleado;

    @Column (name = "servicio")
    private Servicio servicio;
}

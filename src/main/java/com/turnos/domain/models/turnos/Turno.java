package com.turnos.domain.models.turnos;

import com.turnos.domain.models.core.Usuario;
import com.turnos.domain.models.pagos.Pago;
import com.turnos.domain.models.servicios.Servicio;
import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table (name = "turno")
@Builder @NoArgsConstructor @AllArgsConstructor
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_hora_inicio")
    private LocalDateTime fechaHoraInicio;

    @Column (name = "fecha_hora_inicio")
    private LocalDateTime fechaHoraFin;

    @Column(name = "comentario")
    private String comentario;

    @ManyToOne
    @JoinColumn (name = "cliente_id")
    private Usuario cliente;

    @ManyToOne
    @JoinColumn (name = "empleado_id")
    private Usuario empleado;

    @ManyToOne
    @JoinColumn (name = "servicio")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "estado")
    private EstadoTurnoEnum estado;

    @ManyToMany
    @JoinColumn(name = "pagos_id")
    private List<Pago> pagos;
}

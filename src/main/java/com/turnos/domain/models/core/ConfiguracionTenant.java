package com.turnos.domain.models.core;

import lombok.*;
import jakarta.persistence.*;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Table (name = "configuracion_tenant")
@Builder @NoArgsConstructor @AllArgsConstructor
public class ConfiguracionTenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "estilo_css")
    private String estiloCSS;

    @Column (name = "zona_horaria")
    private String zonaHoraria;

    @Column (name = "hora_apertura")
    private LocalTime horaApertura;

    @Column (name = "hora_cierre")
    private LocalTime horaCierre;

    @Column (name = "dias_laborales")
    private Set<DayOfWeek> diasLaborales;

    @Column (name = "antelacion_minima_reserva")
    private Integer antelacionMinimaReserva;

    @Column (name = "antelacion_maxima_reserva")
    private Integer antelacionMaximaReserva;
}

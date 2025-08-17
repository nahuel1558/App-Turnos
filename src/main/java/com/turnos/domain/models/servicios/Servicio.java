package com.turnos.domain.models.servicios;

import com.turnos.domain.models.core.Tenant;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Duration;

@Entity
@Table (name = "servicio")
@Builder @NoArgsConstructor @AllArgsConstructor
public class Servicio {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "duracion")
    private Duration duracion;

    @Column (name = "precio")
    private BigDecimal precio;

    @Column(name = "descripcion")
    private String descripcion;

    @Column (name = "requiere_seña")
    private Boolean requiereSeña;

    @Column (name = "porcentaje_seña")
    private String porcentajeSeña;

    @Column (name = "monto_minimo_seña")
    private BigDecimal montoMinimoSeña;

    @Column (name = "servicio_activo")
    private Boolean servicioActivo;

    @ManyToOne
    @JoinColumn (name = "tenant_id")
    private Tenant tenant;
}

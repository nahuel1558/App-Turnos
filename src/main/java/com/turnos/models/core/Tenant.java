package com.turnos.models.core;

import lombok.*;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table (name = "tenant")
@Builder @NoArgsConstructor @AllArgsConstructor
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "dominio")
    private String dominio;
    @Column (name = "rubro")
    private String rubro;
    @Column (name = "ubicacion")
    private String ubicacion;

    @ManyToOne
    @JoinColumn (name = "configuracion_tenant_id")
    private ConfiguracionTenant configuracion;
}

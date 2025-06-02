package com.turnos.models.core;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Getter @Setter @NoArgsConstructor
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String dominio;
    private String negocio;
    private String direccion;

    @ManyToOne
    private ConfigTenant configTenant;
}

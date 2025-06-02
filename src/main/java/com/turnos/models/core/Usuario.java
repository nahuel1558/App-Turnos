package com.turnos.models.core;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Getter @Setter @NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String emial;
    private Long celular;

    @ManyToOne
    private PreferenciaMensajes preferenciaMensajes;

}

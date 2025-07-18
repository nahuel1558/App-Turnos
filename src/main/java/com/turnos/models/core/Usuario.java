package com.turnos.models.core;

import lombok.*;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table (name = "usuario")
@Builder @NoArgsConstructor @AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column (name = "nombre_apellido")
    private String nombreApellido;

    @Column (nullable = false, length = 100, name = "password")
    private String password;

    @Column (name = "email")
    private String email;

    @Column (name = "celular")
    private String celular;

    @ManyToOne
    @JoinColumn(name = "prefencia_mensajes")
    private PreferenciaMensajes preferenciaMensajes;

}

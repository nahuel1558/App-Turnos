package com.turnos.models.empleados;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.turnos.models.core.Usuario;
import com.turnos.models.servicios.Servicio;
import lombok.*;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Getter @Setter @NoArgsConstructor
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fotoURL;
    private Boolean activo;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<HorarioTrabajo> horarios;

    @ManyToMany
    @JoinTable(
            name = "empleado_servicio",
            joinColumns = @JoinColumn(name = "id_empleado"),
            inverseJoinColumns = @JoinColumn(name = "id_servicio")
    )
    private ArrayList<Servicio> servicios;
}

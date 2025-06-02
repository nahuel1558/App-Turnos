package com.turnos.models.clientes;

import com.turnos.models.core.Usuario;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Getter @Setter @NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;
}

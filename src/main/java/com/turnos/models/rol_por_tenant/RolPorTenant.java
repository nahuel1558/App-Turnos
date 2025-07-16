package com.turnos.models.rol_por_tenant;

import com.turnos.models.core.Tenant;
import com.turnos.models.core.Usuario;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "rol_por_tenant")
@Builder @NoArgsConstructor @AllArgsConstructor
public class RolPorTenant {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @ManyToOne
    @JoinColumn (name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn (name = "tenant_id")
    private Tenant tenant;

    @Column(name = "rol")
    private TipoRolEnum tipoRol;
}

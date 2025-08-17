package com.turnos.domain.models.rol_por_tenant;

import com.turnos.domain.models.core.Tenant;
import com.turnos.domain.models.core.Usuario;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "rol_por_tenant")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RolPorTenant {

    @ManyToOne
    @JoinColumn (name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn (name = "tenant_id")
    private Tenant tenant;

    @Column(name = "rol")
    private TipoRolEnum tipoRolEnum;

}

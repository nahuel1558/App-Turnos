package com.turnos.domain.models.core;

import com.turnos.domain.models.rol_por_tenant.RolPorTenant;
import com.turnos.domain.models.rol_por_tenant.TipoRolEnum;
import lombok.*;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table (name = "usuarios")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @UuidGenerator
    private UUID id;

    @Column (nullable = false, name = "nombre_apellido")
    private String nombreApellido;

    @Column (nullable = false, length = 100, name = "password")
    private String password;

    @Column (nullable = false, name = "email")
    private String email;

    @Column (name = "celular")
    private String celular;

    @Enumerated(EnumType.STRING)
    private PreferenciaNotificacionEnum preferenciaNotificacionEnum;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private Set<RolPorTenant> roles = new HashSet<>();


    public void agregarRol(Tenant tenant, TipoRolEnum tipoRolEnum){
        RolPorTenant rolPorTenant = new RolPorTenant(this, tenant, tipoRolEnum);
        roles.add(rolPorTenant);
    }

    public boolean tieneRolEnTenant(Tenant tenant, TipoRolEnum tipoRolEnum){
        return roles.stream()
                .anyMatch(r -> r.getTenant().equals(tenant) &&
                        r.getTipoRolEnum() == tipoRolEnum);
    }
}

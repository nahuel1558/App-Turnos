package com.turnos.infrastructure.persistence;

import com.turnos.domain.models.core.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    Optional<Usuario> findByEmail(String email);
    boolean existsByEmail(String email);

    @Query("SELECT u FROM Usuario u JOIN u.roles r WHERE r.tenant.id = :tenantId")
    List<Usuario> findByTenantId(Long tenantId);
}

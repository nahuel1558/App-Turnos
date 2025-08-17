package com.turnos.infrastructure.persistence;

import com.turnos.domain.models.core.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
}

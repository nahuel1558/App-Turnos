package com.turnos.infrastructure.persistence;

import com.turnos.domain.models.pagos.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoRepository extends JpaRepository<Pago, Long> {
}

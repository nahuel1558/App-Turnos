package com.turnos.infrastructure.persistence;

import com.turnos.domain.models.turnos.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnoRepository extends JpaRepository<Turno, Long> {
}

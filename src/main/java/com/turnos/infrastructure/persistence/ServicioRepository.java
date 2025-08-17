package com.turnos.infrastructure.persistence;

import com.turnos.domain.models.servicios.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicioRepository extends JpaRepository<Servicio, Long> {
}

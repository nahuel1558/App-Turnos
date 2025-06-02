package com.turnos.models.pagos;

import lombok.*;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor
public class PagoSeña {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Float monto;
    private LocalDate fecha;
    private TipoPago tipoPago;
    private EstadoPago estadoPago;
}

package com.turnos.models.pagos;

import lombok.*;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "pago")
@Builder @NoArgsConstructor @AllArgsConstructor
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "monto")
    private BigDecimal monto;
    @Column (name = "fecha_hora")
    private LocalDateTime fecha;
    @Column (name = "tipo_pago")
    private TipoPagoEnum tipoPago;
    @Column (name = "estado_pago")
    private EstadoPagoEnum estadoPago;
}

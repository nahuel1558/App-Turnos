package com.turnos.dtos.request;

import com.turnos.models.pagos.TipoPagoEnum;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PagoRequest {
    private BigDecimal monto;
    private TipoPagoEnum tipoPago;
    private Boolean seña;
}

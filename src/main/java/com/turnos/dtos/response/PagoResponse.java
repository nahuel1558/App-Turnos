package com.turnos.dtos.response;

import com.turnos.domain.models.pagos.EstadoPagoEnum;
import com.turnos.domain.models.pagos.TipoPagoEnum;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Value
@Builder
@Jacksonized
public class PagoResponse {
    Long pagoId;
    BigDecimal monto;
    TipoPagoEnum tipoPagoEnum;
    LocalDateTime fecha;
    EstadoPagoEnum estadoPagoEnum;
}

package com.minicore.MiniCoreComision.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ComisionDto {
    private String vendedor;
    private BigDecimal totalVendido;
    private String reglaAplicada;
    private BigDecimal comisionCalculada;
}

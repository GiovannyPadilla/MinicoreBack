package com.minicore.MiniCoreComision.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class RangoFechasDto {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
}
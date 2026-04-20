package com.minicore.MiniCoreComision.service;


import com.minicore.MiniCoreComision.dto.ComisionDto;

import java.time.LocalDate;
import java.util.List;

public interface ComisionService {
    List<ComisionDto> calcularComisiones(LocalDate fechaInicio, LocalDate fechaFin);
}

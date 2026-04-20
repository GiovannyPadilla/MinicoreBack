package com.minicore.MiniCoreComision.controller;

import com.minicore.MiniCoreComision.dto.ComisionDto;
import com.minicore.MiniCoreComision.dto.RangoFechasDto;
import com.minicore.MiniCoreComision.service.ComisionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/core")
@RequiredArgsConstructor
public class ComisionController {

    private final ComisionService comisionService;

    @PostMapping("/calcular")
    public ResponseEntity<List<ComisionDto>> calcular(@RequestBody RangoFechasDto request) {
        List<ComisionDto> resultado = comisionService.calcularComisiones(
                request.getFechaInicio(),
                request.getFechaFin()
        );
        return ResponseEntity.ok(resultado);
    }
}

package com.minicore.MiniCoreComision.repository;

import com.minicore.MiniCoreComision.model.Regla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReglaRepository extends JpaRepository<Regla, Long> {

    List<Regla> findAllByOrderByMontoMinimoVentaDesc();
}

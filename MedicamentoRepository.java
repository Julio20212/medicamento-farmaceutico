package com.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {

}

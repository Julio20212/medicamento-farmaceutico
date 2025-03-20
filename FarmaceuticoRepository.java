package com.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.entity.Farmaceutico;

public interface FarmaceuticoRepository extends JpaRepository<Farmaceutico, Long> {

}

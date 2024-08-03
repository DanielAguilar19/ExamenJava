package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelos.prestamos;

public interface prestamoRepository extends JpaRepository<prestamos, Integer>{
    
}

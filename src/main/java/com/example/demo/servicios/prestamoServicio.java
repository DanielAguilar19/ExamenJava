package com.example.demo.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelos.cliente;
import com.example.demo.modelos.prestamos;
import com.example.demo.repositorios.clienteRepository;
import com.example.demo.repositorios.prestamoRepository;

@Service
public class prestamoServicio {
    @Autowired
    private prestamoRepository prestaRepo;
    @Autowired
    private clienteRepository clienteRepo;

    public prestamos crearPrestamos(String dni, prestamos nvoPrestamo){
        if (this.prestaRepo.existsById(nvoPrestamo.getCodigoPrestamo())) {
            return null;
        }

/*         if (this.prestaRepo.findById(nvoPrestamo.getCodigoPrestamo().)) {
            
        } */
        return this.prestaRepo.save(nvoPrestamo);
    }

    public prestamos consultarPrestamo(int codigoPrestamo){
        if (this.prestaRepo.existsById(codigoPrestamo)) {
/*             return this.prestaRepo.findById(codigoPrestamo);
 */        }
            return null;
    }
}

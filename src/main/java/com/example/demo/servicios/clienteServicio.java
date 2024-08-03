package com.example.demo.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelos.cliente;
import com.example.demo.modelos.prestamos;
import com.example.demo.repositorios.clienteRepository;
import com.example.demo.repositorios.prestamoRepository;

@Service
public class clienteServicio {

    @Autowired
    private clienteRepository clienteRepo;
    @Autowired
    private prestamoRepository prestaRepo;

    public cliente crearCliente (cliente nvoCliente){
        if (this.clienteRepo.existsById(nvoCliente.getDni())) {
            return null;
        }
        
        List<prestamos> prestamos = nvoCliente.getPrestamo();
        if (prestamos != null) {
            if (prestamos.size() <= 2) {
                for (prestamos prestamoActual : prestamos) {
                    double cuota = (prestamoActual.getMonto() * 0.09) / (1- (Math.pow(1+((0.09)/12), prestamoActual.getPlazo())));
                    prestamoActual.setCuota(cuota);
                    prestamoActual.setCliente(nvoCliente);
                    this.prestaRepo.save(prestamoActual);
                }
            }
        }

        return this.clienteRepo.save(nvoCliente);
        
    }
}

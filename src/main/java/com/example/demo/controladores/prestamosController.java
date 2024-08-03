package com.example.demo.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelos.prestamos;
import com.example.demo.servicios.prestamoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/prestamos")
public class prestamosController {

@Autowired
private prestamoServicio prestaServ;

/*     @GetMapping("obtener/prestamo/{codigoPrestamo}")
    public String getMethodName(@PathVariable(name="codigoprestamo") int codigoPrestamo) {
        return this.prestaServ.consultarPrestamo(codigoPrestamo);
    } */
    
    @PostMapping("creat/nuevo/{dni}")
    public prestamos crearNuevoPrestamo(@PathVariable(name="dni") String dni,        
                                        @RequestBody prestamos nvoPrestamos) {
        return this.prestaServ.crearPrestamos(dni, nvoPrestamos);

    }
    
}

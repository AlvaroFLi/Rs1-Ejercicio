package com.Rs1ejercicio.Rs1ejercicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controlador {

    @Autowired
    Servicio servicio;

    @PostMapping("/persona")
    public Persona postPersona(@RequestBody Persona persona){
        String nombre = persona.getNombre();
        String ciudad = persona.getPoblacion();
        int edad = persona.getEdad();
        Persona nueva = servicio.crearPersona(nombre,ciudad,edad);
        servicio.addPersona(persona);
        return servicio.devolverPersona();
    }

    @PutMapping("/persona/{id}")
    public Persona modPersona(@PathVariable("id") int id,@RequestBody Persona persona ){
        servicio.modPersona(id ,persona);
        return  servicio.devolverPersona();
    }

    @DeleteMapping("/persona/{id}")
    public String delPersona(@PathVariable("id") int id){
       return servicio.rmPersona(id);
    }

    @GetMapping("/persona/{id}")
    public Persona buscar(@PathVariable("id") int id ){
        return servicio.consultarPersona(id);
    }

    @GetMapping("/persona/nombre/{nombre}")
    public Persona buscar(@PathVariable("nombre") String nombre ){
        return servicio.consultarPersona(nombre);
    }


}

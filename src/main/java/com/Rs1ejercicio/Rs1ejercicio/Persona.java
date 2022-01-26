package com.Rs1ejercicio.Rs1ejercicio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Persona {
    String nombre;
    String poblacion;
    int edad;
}

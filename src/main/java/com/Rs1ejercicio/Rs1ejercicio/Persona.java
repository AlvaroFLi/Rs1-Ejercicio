package com.Rs1ejercicio.Rs1ejercicio;

import lombok.*;
import org.springframework.stereotype.Service;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    String nombre;
    String poblacion;
    int edad;
}

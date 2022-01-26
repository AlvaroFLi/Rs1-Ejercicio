package com.Rs1ejercicio.Rs1ejercicio;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Servicio {

    Persona p = new Persona();

    List<Persona> ListaPersona = new ArrayList<>();

    public Persona crearPersona(String nombre, String ciudad, int edad){
        p.setEdad(edad);
        p.setNombre(nombre);
        p.setPoblacion(ciudad);
        return p;
    }

    public Persona devolverPersona(){
        return  p;
    }

    public Persona addPersona(Persona persona){
        ListaPersona.add(persona);
        return persona;
    }

    public Persona modPersona(int id, Persona personaRecibida){
        if(personaRecibida.getEdad() != 0){
            ListaPersona.get(id).setEdad(personaRecibida.getEdad());
        }
        if(personaRecibida.getNombre() != null){
            ListaPersona.get(id).setNombre(personaRecibida.getNombre());
        }
        if(personaRecibida.getPoblacion() != null){
            ListaPersona.get(id).setPoblacion(personaRecibida.getPoblacion());
        }
        return ListaPersona.get(id);
    }

    public String rmPersona(int id){
        Persona pBorrada = ListaPersona.get(id);
         ListaPersona.remove(id);
        if(!ListaPersona.contains(pBorrada)){
            return "Persona Borrada: " + pBorrada.toString();
        }else {
            return "error";
        }
    }

    public Persona consultarPersona(String nombre){
        //buscar por nombre
        Persona personaBuscada = null;
        System.out.println("entra");
            for (int i = 0; i <= ListaPersona.size() - 1; i++) {
                if (ListaPersona.get(i).getNombre().equals(nombre)) {
                    personaBuscada =  ListaPersona.get(i);
                    break;
                }
            }
        return personaBuscada;
    }

    //buscar por posicion
    public Persona consultarPersona(int id){
            return ListaPersona.get(id);
    }


}

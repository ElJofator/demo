package com.example.demo;

import java.util.ArrayList;

public class Personas{

    private ArrayList<Persona> personas;

	public Personas(){
        this.personas = new ArrayList<Persona>();
    }

    public boolean agregarPersona(Persona persona){
        return personas.add(persona);
    }

    public void removerPersona(int id){
        personas.remove(id);
    }

    public void editarNombre(int id, String nombre){
        personas.get(id).setNombre(nombre);
    }

    public void editarApellidos(int id, String apellidos){
        personas.get(id).setApellidos(apellidos);
    }

    public void editarEdad(int id, int edad){
        personas.get(id).setEdad(edad);
    }

    public Persona getPersona(int id){
        return personas.get(id);
    }
}
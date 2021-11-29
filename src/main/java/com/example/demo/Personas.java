package com.example.demo;

import java.util.ArrayList;

public class Personas{

    private ArrayList<Persona> personas;

	public Personas(){
        this.personas = new ArrayList<Persona>();
        Persona p1 = new Persona(1,"Joseph","Basto",20);
        Persona p2 = new Persona(2,"Fabián","Cuadros",20);
        this.personas.add(p1);
        this.personas.add(p2);
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

    public String listarPersonas(){
        String info ="";
        for(Persona i : personas)
        {
            info = info + i.getNombre() + " " + i.getApellidos() + " " + i.getEdad() + " | ";
        }
        return info;
    }
}
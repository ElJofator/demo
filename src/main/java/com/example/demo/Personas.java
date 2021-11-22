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

    
}
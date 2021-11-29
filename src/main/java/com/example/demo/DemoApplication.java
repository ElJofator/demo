package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
              
@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
    	SpringApplication.run(DemoApplication.class, args);
	}
    
	@GetMapping("/agregar")
	public String agregar(@RequestParam(value = "id") int id,
	@RequestParam(value = "nombre") String nombre,
	@RequestParam(value = "apellido") String apellido,
	@RequestParam(value = "edad") int edad) {
		Personas personas = new Personas();
		Persona p = new Persona(id, nombre, apellido, edad);
		personas.agregarPersona(p);
		return String.format(personas.listarPersonas());
	}

	@GetMapping("/eliminar")
	public String eliminar(@RequestParam(value = "id") int id) {
		Personas personas = new Personas();
		personas.removerPersona(id);
		return String.format(personas.listarPersonas());
	}

	@GetMapping("/editar")
	public String editar(@RequestParam(value = "id") int id,
	@RequestParam(value = "nombre") String nombre,
	@RequestParam(value = "apellido") String apellido,
	@RequestParam(value = "edad") int edad) {
		Personas personas = new Personas();
		personas.editarNombre(id, nombre);
		personas.editarApellidos(id, apellido);
		personas.editarEdad(id, edad);
		return String.format(personas.listarPersonas());
	}

	@GetMapping("/buscar")
	public String buscar(@RequestParam(value = "id") int id) {
		Personas personas = new Personas();
		Persona p = personas.getPersona(id);
		return String.format(p.getId()+p.getNombre()+p.getApellidos()+p.getEdad());
	}

	@GetMapping("/listar")
	public String listar() {
		Personas personas = new Personas();
		return String.format(personas.listarPersonas());
	}
}
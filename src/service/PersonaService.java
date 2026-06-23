package service;

import model.Persona;
import java.util.ArrayList;

public class PersonaService {
    private ArrayList<Persona> personas;

    public PersonaService(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public void listarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("No existen registros cargados.");
        } else {
            for (Persona persona : personas) {
                System.out.println(persona);
            }
        }
    }

    public Persona buscarPorRut(String rut) {
        for (Persona persona : personas) {
            if (persona.getRut().equalsIgnoreCase(rut)) {
                return persona;
            }
        }
        return null;
    }

    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;

        for (Persona persona : personas) {
            if (persona.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println(persona);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron personas con ese nombre.");
        }
    }
}
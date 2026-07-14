package model;

public class Guia extends Persona {
    private String especialidad;

    public Guia(String rut, String nombre, String correo, String especialidad) {
        super(rut, nombre, correo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String mostrarResumen() {
        return "=== GUÍA TURÍSTICO ===\n"
                + "RUT: " + getRut() + "\n"
                + "Nombre: " + getNombre() + "\n"
                + "Correo: " + getCorreo() + "\n"
                + "Especialidad: " + especialidad;
    }

    @Override
    public String toString() {
        return "[Guía] " + super.toString()
                + " | Especialidad: " + especialidad;
    }
}
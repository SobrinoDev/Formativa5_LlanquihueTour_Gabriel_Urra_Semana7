package model;

public abstract class Persona implements Registrable {
    private String rut;
    private String nombre;
    private String correo;

    public Persona(String rut, String nombre, String correo) {
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "RUT: " + rut
                + " | Nombre: " + nombre
                + " | Correo: " + correo;
    }

    @Override
    public abstract String mostrarResumen();
}
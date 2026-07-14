package model;

public class Operador extends Persona {
    private String servicio;

    public Operador(String rut, String nombre, String correo, String servicio) {
        super(rut, nombre, correo);
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public String mostrarResumen() {
        return "=== OPERADOR TURÍSTICO ===\n"
                + "RUT: " + getRut() + "\n"
                + "Nombre: " + getNombre() + "\n"
                + "Correo: " + getCorreo() + "\n"
                + "Servicio: " + servicio;
    }

    @Override
    public String toString() {
        return "[Operador] " + super.toString()
                + " | Servicio: " + servicio;
    }
}
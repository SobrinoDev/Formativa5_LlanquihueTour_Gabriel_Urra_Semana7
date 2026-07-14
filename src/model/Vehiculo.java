package model;

public class Vehiculo implements Registrable {
    private String patente;
    private String marca;
    private String modelo;
    private int capacidadPasajeros;

    public Vehiculo(
            String patente,
            String marca,
            String modelo,
            int capacidadPasajeros
    ) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String mostrarResumen() {
        return "=== VEHÍCULO ===\n"
                + "Patente: " + patente + "\n"
                + "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Capacidad: " + capacidadPasajeros + " pasajeros";
    }

    @Override
    public String toString() {
        return "[Vehículo] Patente: " + patente
                + " | Marca: " + marca
                + " | Modelo: " + modelo
                + " | Capacidad: " + capacidadPasajeros;
    }
}
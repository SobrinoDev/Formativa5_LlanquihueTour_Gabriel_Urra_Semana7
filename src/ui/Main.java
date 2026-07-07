package ui;

import data.GestorServicios;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== LLANQUIHUE TOUR ===");
        System.out.println("Servicios turísticos disponibles:\n");

        GestorServicios gestorServicios = new GestorServicios();

        gestorServicios.cargarServicios();
        gestorServicios.mostrarServicios();
    }
}
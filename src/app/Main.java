package app;

import model.Persona;
import service.PersonaService;
import util.ArchivoUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Persona> personas = ArchivoUtil.cargarPersonas("resources/personas.csv");
        PersonaService servicio = new PersonaService(personas);
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        do {
            try {
                System.out.println("\n=== LLANQUIHUE TOUR ===");
                System.out.println("1. Listar personas");
                System.out.println("2. Buscar por RUT");
                System.out.println("3. Buscar por nombre");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        servicio.listarPersonas();
                        break;

                    case 2:
                        System.out.print("Ingrese RUT: ");
                        String rut = scanner.nextLine();
                        Persona encontrada = servicio.buscarPorRut(rut);

                        if (encontrada != null) {
                            System.out.println(encontrada);
                        } else {
                            System.out.println("No se encontró una persona con ese RUT.");
                        }
                        break;

                    case 3:
                        System.out.print("Ingrese nombre: ");
                        String nombre = scanner.nextLine();
                        servicio.buscarPorNombre(nombre);
                        break;

                    case 4:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número válido.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
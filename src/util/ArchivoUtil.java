package util;

import model.Guia;
import model.Operador;
import model.Persona;
import model.Proveedor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoUtil {

    public static ArrayList<Persona> cargarPersonas(String rutaArchivo) {
        ArrayList<Persona> personas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int numeroLinea = 1;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");

                if (datos.length == 5) {
                    String tipo = datos[0].trim();
                    String rut = datos[1].trim();
                    String nombre = datos[2].trim();
                    String correo = datos[3].trim();
                    String detalle = datos[4].trim();

                    if (rut.isEmpty() || nombre.isEmpty() || correo.isEmpty()) {
                        System.out.println("Línea " + numeroLinea + ": datos obligatorios vacíos.");
                    } else {
                        switch (tipo.toUpperCase()) {
                            case "GUIA":
                                personas.add(new Guia(rut, nombre, correo, detalle));
                                break;
                            case "OPERADOR":
                                personas.add(new Operador(rut, nombre, correo, detalle));
                                break;
                            case "PROVEEDOR":
                                personas.add(new Proveedor(rut, nombre, correo, detalle));
                                break;
                            default:
                                System.out.println("Línea " + numeroLinea + ": tipo no reconocido.");
                        }
                    }
                } else {
                    System.out.println("Línea " + numeroLinea + ": formato incorrecto.");
                }

                numeroLinea++;
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + rutaArchivo);
        }

        return personas;
    }
}

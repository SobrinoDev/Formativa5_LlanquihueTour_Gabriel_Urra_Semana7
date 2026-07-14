package util;

import model.ColaboradorExterno;
import model.Guia;
import model.Operador;
import model.Proveedor;
import model.Registrable;
import model.Vehiculo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoUtil {

    public static ArrayList<Registrable> cargarEntidades(String rutaArchivo) {
        ArrayList<Registrable> entidades = new ArrayList<>();

        try (BufferedReader lector =
                     new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            int numeroLinea = 1;

            while ((linea = lector.readLine()) != null) {

                if (linea.trim().isEmpty()) {
                    numeroLinea++;
                    continue;
                }

                String[] datos = linea.split(";");

                try {
                    Registrable entidad = crearEntidad(datos);

                    if (entidad != null) {
                        entidades.add(entidad);
                    } else {
                        System.out.println(
                                "Registro inválido en la línea " + numeroLinea
                        );
                    }

                } catch (NumberFormatException e) {
                    System.out.println(
                            "Error numérico en la línea " + numeroLinea
                    );
                }

                numeroLinea++;
            }

        } catch (IOException e) {
            System.out.println(
                    "No fue posible leer el archivo: " + rutaArchivo
            );
        }

        return entidades;
    }

    private static Registrable crearEntidad(String[] datos) {
        if (datos.length < 5) {
            return null;
        }

        String tipo = datos[0].trim().toUpperCase();

        switch (tipo) {
            case "GUIA":
                return new Guia(
                        datos[1].trim(),
                        datos[2].trim(),
                        datos[3].trim(),
                        datos[4].trim()
                );

            case "OPERADOR":
                return new Operador(
                        datos[1].trim(),
                        datos[2].trim(),
                        datos[3].trim(),
                        datos[4].trim()
                );

            case "PROVEEDOR":
                return new Proveedor(
                        datos[1].trim(),
                        datos[2].trim(),
                        datos[3].trim(),
                        datos[4].trim()
                );

            case "VEHICULO":
                int capacidad = Integer.parseInt(datos[4].trim());

                return new Vehiculo(
                        datos[1].trim(),
                        datos[2].trim(),
                        datos[3].trim(),
                        capacidad
                );

            case "COLABORADOR":
                if (datos.length != 6) {
                    return null;
                }

                return new ColaboradorExterno(
                        datos[1].trim(),
                        datos[2].trim(),
                        datos[3].trim(),
                        datos[4].trim(),
                        datos[5].trim()
                );

            default:
                System.out.println("Tipo no reconocido: " + tipo);
                return null;
        }
    }

    public static boolean guardarEntidad(
            String rutaArchivo,
            Registrable entidad
    ) {
        String linea = convertirEntidadALinea(entidad);

        if (linea == null) {
            System.out.println(
                    "El tipo de entidad no se puede guardar."
            );
            return false;
        }

        try (BufferedWriter escritor =
                     new BufferedWriter(new FileWriter(rutaArchivo, true))) {

            escritor.write(linea);
            escritor.newLine();

            return true;

        } catch (IOException e) {
            System.out.println(
                    "Error al guardar en el archivo: " + rutaArchivo
            );
            return false;
        }
    }

    private static String convertirEntidadALinea(Registrable entidad) {

        if (entidad instanceof Guia) {
            Guia guia = (Guia) entidad;

            return "GUIA;"
                    + guia.getRut() + ";"
                    + guia.getNombre() + ";"
                    + guia.getCorreo() + ";"
                    + guia.getEspecialidad();
        }

        if (entidad instanceof Operador) {
            Operador operador = (Operador) entidad;

            return "OPERADOR;"
                    + operador.getRut() + ";"
                    + operador.getNombre() + ";"
                    + operador.getCorreo() + ";"
                    + operador.getServicio();
        }

        if (entidad instanceof Proveedor) {
            Proveedor proveedor = (Proveedor) entidad;

            return "PROVEEDOR;"
                    + proveedor.getRut() + ";"
                    + proveedor.getNombre() + ";"
                    + proveedor.getCorreo() + ";"
                    + proveedor.getRubro();
        }

        if (entidad instanceof Vehiculo) {
            Vehiculo vehiculo = (Vehiculo) entidad;

            return "VEHICULO;"
                    + vehiculo.getPatente() + ";"
                    + vehiculo.getMarca() + ";"
                    + vehiculo.getModelo() + ";"
                    + vehiculo.getCapacidadPasajeros();
        }

        if (entidad instanceof ColaboradorExterno) {
            ColaboradorExterno colaborador =
                    (ColaboradorExterno) entidad;

            return "COLABORADOR;"
                    + colaborador.getRut() + ";"
                    + colaborador.getNombre() + ";"
                    + colaborador.getCorreo() + ";"
                    + colaborador.getEmpresa() + ";"
                    + colaborador.getFuncion();
        }

        return null;
    }
}
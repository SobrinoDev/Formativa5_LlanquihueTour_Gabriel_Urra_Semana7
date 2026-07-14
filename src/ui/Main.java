package ui;

import data.GestorEntidades;
import model.ColaboradorExterno;
import model.Guia;
import model.Vehiculo;
import model.Registrable;
import util.ArchivoUtil;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        GestorEntidades gestor = new GestorEntidades();

        cargarEntidadesDesdeArchivo(gestor);
        mostrarMenu(gestor);
    }


    private static final String RUTA_ARCHIVO =
            "resources/personas.csv";

    private static void cargarEntidadesDesdeArchivo(
            GestorEntidades gestor
    ) {
        ArrayList<Registrable> entidades =
                ArchivoUtil.cargarEntidades(RUTA_ARCHIVO);

        gestor.agregarEntidades(entidades);

        System.out.println(
                "Registros cargados: " + entidades.size()
        );
    }

    private static void mostrarMenu(GestorEntidades gestor) {
        int opcion = 0;

        do {
            try {
                String entrada = JOptionPane.showInputDialog(
                        null,
                        """
                        === LLANQUIHUE TOUR ===

                        1. Registrar guía turístico
                        2. Registrar vehículo
                        3. Registrar colaborador externo
                        4. Mostrar entidades registradas
                        5. Salir

                        Seleccione una opción:
                        """,
                        "Gestión de entidades",
                        JOptionPane.QUESTION_MESSAGE
                );

                if (entrada == null) {
                    opcion = 5;
                } else {
                    opcion = Integer.parseInt(entrada);

                    switch (opcion) {
                        case 1:
                            registrarGuia(gestor);
                            break;

                        case 2:
                            registrarVehiculo(gestor);
                            break;

                        case 3:
                            registrarColaborador(gestor);
                            break;

                        case 4:
                            mostrarEntidades(gestor);
                            break;

                        case 5:
                            JOptionPane.showMessageDialog(
                                    null,
                                    "Programa finalizado.",
                                    "Llanquihue Tour",
                                    JOptionPane.INFORMATION_MESSAGE
                            );
                            break;

                        default:
                            JOptionPane.showMessageDialog(
                                    null,
                                    "Debe seleccionar una opción entre 1 y 5.",
                                    "Opción inválida",
                                    JOptionPane.WARNING_MESSAGE
                            );
                    }
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Debe ingresar una opción numérica.",
                        "Error de ingreso",
                        JOptionPane.ERROR_MESSAGE
                );
            }

        } while (opcion != 5);
    }

    private static void registrarGuia(GestorEntidades gestor) {
        String rut = solicitarTexto("Ingrese el RUT del guía:");
        String nombre = solicitarTexto("Ingrese el nombre del guía:");
        String correo = solicitarTexto("Ingrese el correo del guía:");
        String especialidad = solicitarTexto("Ingrese la especialidad del guía:");

        if (rut == null || nombre == null || correo == null || especialidad == null) {
            return;
        }

        Guia guia = new Guia(rut, nombre, correo, especialidad);
        gestor.agregarEntidad(guia);

        JOptionPane.showMessageDialog(
                null,
                "Guía registrado correctamente.\n\n" + guia.mostrarResumen(),
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private static void registrarVehiculo(GestorEntidades gestor) {
        String patente = solicitarTexto("Ingrese la patente del vehículo:");
        String marca = solicitarTexto("Ingrese la marca del vehículo:");
        String modelo = solicitarTexto("Ingrese el modelo del vehículo:");

        if (patente == null || marca == null || modelo == null) {
            return;
        }

        try {
            String capacidadTexto = solicitarTexto(
                    "Ingrese la capacidad de pasajeros:"
            );

            if (capacidadTexto == null) {
                return;
            }

            int capacidad = Integer.parseInt(capacidadTexto);

            if (capacidad <= 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "La capacidad debe ser mayor que cero.",
                        "Dato inválido",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }

            Vehiculo vehiculo = new Vehiculo(
                    patente,
                    marca,
                    modelo,
                    capacidad
            );

            if (ArchivoUtil.guardarEntidad(
                    RUTA_ARCHIVO,
                    vehiculo
            )) {
                gestor.agregarEntidad(vehiculo);

                JOptionPane.showMessageDialog(
                        null,
                        "Vehículo registrado y guardado correctamente.\n\n"
                                + vehiculo.mostrarResumen(),
                        "Registro exitoso",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "No fue posible guardar el vehículo.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }

            JOptionPane.showMessageDialog(
                    null,
                    "Vehículo registrado correctamente.\n\n"
                            + vehiculo.mostrarResumen(),
                    "Registro exitoso",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "La capacidad debe ser un número entero.",
                    "Error de ingreso",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private static void registrarColaborador(GestorEntidades gestor) {
        String rut = solicitarTexto("Ingrese el RUT del colaborador:");
        String nombre = solicitarTexto("Ingrese el nombre del colaborador:");
        String correo = solicitarTexto("Ingrese el correo del colaborador:");
        String empresa = solicitarTexto("Ingrese el nombre de la empresa:");
        String funcion = solicitarTexto("Ingrese la función que realiza:");

        if (rut == null
                || nombre == null
                || correo == null
                || empresa == null
                || funcion == null) {
            return;
        }

        ColaboradorExterno colaborador = new ColaboradorExterno(
                rut,
                nombre,
                correo,
                empresa,
                funcion
        );

        if (ArchivoUtil.guardarEntidad(
                RUTA_ARCHIVO,
                colaborador
        )) {
            gestor.agregarEntidad(colaborador);

            JOptionPane.showMessageDialog(
                    null,
                    "Colaborador registrado y guardado correctamente.\n\n"
                            + colaborador.mostrarResumen(),
                    "Registro exitoso",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "No fue posible guardar el colaborador.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }

        JOptionPane.showMessageDialog(
                null,
                "Colaborador registrado correctamente.\n\n"
                        + colaborador.mostrarResumen(),
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private static void mostrarEntidades(GestorEntidades gestor) {
        JTextArea areaTexto = new JTextArea(20, 50);

        areaTexto.setText(gestor.obtenerResumenes());
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setCaretPosition(0);

        JScrollPane scrollPane = new JScrollPane(areaTexto);

        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
        );

        scrollPane.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );

        JOptionPane.showMessageDialog(
                null,
                scrollPane,
                "Entidades registradas",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private static String solicitarTexto(String mensaje) {
        String valor = JOptionPane.showInputDialog(
                null,
                mensaje,
                "Ingreso de datos",
                JOptionPane.QUESTION_MESSAGE
        );

        if (valor == null) {
            return null;
        }

        valor = valor.trim();

        if (valor.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "El campo no puede quedar vacío.",
                    "Dato obligatorio",
                    JOptionPane.WARNING_MESSAGE
            );

            return null;
        }

        return valor;
    }
}
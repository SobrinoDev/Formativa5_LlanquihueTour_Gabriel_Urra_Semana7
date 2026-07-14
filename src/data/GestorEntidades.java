package data;

import model.ColaboradorExterno;
import model.Guia;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;

public class GestorEntidades {
    private final ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        if (entidad != null) {
            entidades.add(entidad);
        }
    }

    public void agregarEntidades(ArrayList<Registrable> nuevasEntidades) {
        if (nuevasEntidades != null) {
            entidades.addAll(nuevasEntidades);
        }
    }

    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }

    public boolean estaVacio() {
        return entidades.isEmpty();
    }

    public String obtenerResumenes() {
        if (entidades.isEmpty()) {
            return "No existen entidades registradas.";
        }

        StringBuilder resumen = new StringBuilder();

        for (Registrable entidad : entidades) {
            resumen.append(entidad.mostrarResumen());
            resumen.append("\n");

            if (entidad instanceof Guia) {
                resumen.append(
                        "Tipo detectado: Guía turístico.\n"
                );

            } else if (entidad instanceof Vehiculo) {
                resumen.append(
                        "Tipo detectado: Vehículo de la agencia.\n"
                );

            } else if (entidad instanceof ColaboradorExterno) {
                resumen.append(
                        "Tipo detectado: Colaborador externo.\n"
                );

            } else {
                resumen.append(
                        "Tipo detectado: Otra entidad registrable.\n"
                );
            }

            resumen.append(
                    "----------------------------------------\n"
            );
        }

        return resumen.toString();
    }
}
package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

public class GestorServicios {
    private List<ServicioTuristico> servicios;

    public GestorServicios() {
        servicios = new ArrayList<>();
    }

    public void cargarServicios() {
        servicios.add(new RutaGastronomica(
                "Sabores de Puerto Varas",
                3,
                4));

        servicios.add(new RutaGastronomica(
                "Ruta del Kuchen y Café",
                2,
                3));

        servicios.add(new PaseoLacustre(
                "Navegación Lago Llanquihue",
                2,
                "Lancha turística"));

        servicios.add(new PaseoLacustre(
                "Atardecer en el Lago",
                1,
                "Catamarán"));

        servicios.add(new ExcursionCultural(
                "Historia de Frutillar",
                4,
                "Teatro del Lago"));

        servicios.add(new ExcursionCultural(
                "Patrimonio de Puerto Octay",
                3,
                "Casa Niklitschek"));
    }

    public List<ServicioTuristico> obtenerServicios() {
        return servicios;
    }

    public void mostrarServicios() {
        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
            System.out.println();
        }
    }
}
package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicios {

    public void mostrarServiciosDePrueba() {
        RutaGastronomica ruta1 = new RutaGastronomica(
                "Sabores de Puerto Varas", 3, 4);

        RutaGastronomica ruta2 = new RutaGastronomica(
                "Ruta del Kuchen y Café", 2, 3);

        PaseoLacustre paseo1 = new PaseoLacustre(
                "Navegación Lago Llanquihue", 2, "Lancha turística");

        PaseoLacustre paseo2 = new PaseoLacustre(
                "Atardecer en el Lago", 1, "Catamarán");

        ExcursionCultural excursion1 = new ExcursionCultural(
                "Historia de Frutillar", 4, "Teatro del Lago");

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Patrimonio de Puerto Octay", 3, "Casa Niklitschek");

        System.out.println(ruta1);
        System.out.println(ruta2);
        System.out.println(paseo1);
        System.out.println(paseo2);
        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}

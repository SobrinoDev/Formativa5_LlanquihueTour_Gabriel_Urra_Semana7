LlanquihueTourApp
Desarrollo Orientado a Objetos I

Proyecto desarrollado para la asignatura Desarrollo Orientado a Objetos I, utilizando Java e IntelliJ IDEA.

Descripción

LlanquihueTourApp es una aplicación de consola que simula parte del sistema de gestión de la agencia de turismo Llanquihue Tour.

Durante el desarrollo del proyecto se han incorporado conceptos fundamentales de Programación Orientada a Objetos, como encapsulamiento, organización modular mediante paquetes, lectura de datos desde archivos y, posteriormente, la implementación de herencia simple para representar los distintos tipos de servicios turísticos ofrecidos por la agencia.

Objetivos
Organizar el proyecto utilizando paquetes.
Aplicar encapsulamiento mediante atributos privados.
Implementar constructores, getters, setters y el método toString().
Modelar una jerarquía de clases utilizando herencia.
Reutilizar código mediante una superclase.
Mostrar información por consola utilizando objetos creados desde el programa.
Estructura del proyecto
src/
│
├── model/
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── data/
│   └── GestorServicios.java
│
└── ui/
    └── Main.java
Clases implementadas
ServicioTuristico

Clase base (superclase) que representa un servicio turístico.

Atributos:

nombre
duracionHoras

Incluye:

Constructor
Getters y Setters
Método toString()
RutaGastronomica

Hereda de ServicioTuristico.

Atributo adicional:

numeroDeParadas

Sobrescribe el método toString() para mostrar toda la información del servicio.

PaseoLacustre

Hereda de ServicioTuristico.

Atributo adicional:

tipoEmbarcacion

También sobrescribe el método toString().

ExcursionCultural

Hereda de ServicioTuristico.

Atributo adicional:

lugarHistorico

Sobrescribe el método toString().

GestorServicios

Clase encargada de crear objetos de prueba de cada tipo de servicio turístico.

Se crean:

2 Rutas Gastronómicas.
2 Paseos Lacustres.
2 Excursiones Culturales.
Main

Clase principal del proyecto.

Su función es:

Crear una instancia de GestorServicios.
Mostrar todos los servicios turísticos utilizando el método toString() de cada objeto.
Conceptos aplicados
Programación Orientada a Objetos.
Encapsulamiento.
Herencia simple.
Sobrescritura de métodos (@Override).
Uso de super().
Organización modular mediante paquetes.
Reutilización de código.

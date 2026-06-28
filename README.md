LlanquihueTourApp
Desarrollo Orientado a Objetos I
Descripción del proyecto

LlanquihueTourApp es una aplicación de consola desarrollada en Java como parte de la asignatura Desarrollo Orientado a Objetos I. El proyecto tiene como finalidad representar un sistema básico para la gestión de servicios turísticos de la agencia Llanquihue Tour, aplicando los principios fundamentales de la Programación Orientada a Objetos (POO).

Durante el desarrollo del proyecto se implementaron conceptos como encapsulamiento, organización modular mediante paquetes, reutilización de código a través de la herencia y sobrescritura de métodos, permitiendo modelar de forma estructurada los distintos tipos de servicios turísticos ofrecidos por la agencia.

Objetivos

El desarrollo de este proyecto tiene como objetivos:

Organizar el código utilizando una estructura modular basada en paquetes.
Aplicar el principio de encapsulamiento mediante atributos privados.
Implementar constructores, métodos de acceso (getters y setters) y el método toString().
Diseñar una jerarquía de clases utilizando herencia simple.
Favorecer la reutilización de código mediante una superclase.
Mostrar la información de los servicios turísticos a través de una aplicación de consola.
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
Descripción de las clases
ServicioTuristico

Corresponde a la superclase del sistema y representa la información común de cualquier servicio turístico ofrecido por la agencia.

Atributos:

nombre
duracionHoras

Incluye:

Constructor.
Métodos getters y setters.
Sobrescritura del método toString() para representar la información del objeto.
RutaGastronomica

Clase que hereda de ServicioTuristico y representa las rutas gastronómicas ofrecidas por la agencia.

Atributo adicional:

numeroDeParadas

Sobrescribe el método toString() para incluir la información específica de este tipo de servicio.

PaseoLacustre

Clase derivada de ServicioTuristico que representa los paseos lacustres.

Atributo adicional:

tipoEmbarcacion

Implementa su propia versión del método toString() para mostrar las características particulares del servicio.

ExcursionCultural

Clase derivada de ServicioTuristico destinada a representar excursiones culturales.

Atributo adicional:

lugarHistorico

Sobrescribe el método toString() para complementar la información heredada con los datos propios de la excursión.

GestorServicios

Clase responsable de crear las instancias de prueba utilizadas por la aplicación.

Actualmente genera:

Dos objetos de tipo RutaGastronomica.
Dos objetos de tipo PaseoLacustre.
Dos objetos de tipo ExcursionCultural.

Su propósito es centralizar la creación de objetos y facilitar las pruebas del sistema.

Main

Clase principal de la aplicación.

Desde esta clase se inicia la ejecución del programa, se crea una instancia de GestorServicios y se muestran en consola todos los servicios turísticos registrados mediante la utilización del método toString() de cada objeto.

Conceptos aplicados

Durante el desarrollo del proyecto se aplicaron los siguientes conceptos de Programación Orientada a Objetos:

Encapsulamiento.
Herencia simple.
Reutilización de código.
Sobrescritura de métodos (@Override).
Uso del constructor de la superclase mediante super().
Organización modular del proyecto mediante paquetes.
Separación de responsabilidades entre las distintas clases.

# LlanquihueTourApp

## Desarrollo Orientado a Objetos I

## Descripción del proyecto

**LlanquihueTourApp** es una aplicación de consola desarrollada en **Java** para la asignatura **Desarrollo Orientado a Objetos I**.

El proyecto tiene como finalidad representar un sistema básico para la gestión de la agencia de turismo **Llanquihue Tour**, aplicando los principios fundamentales de la Programación Orientada a Objetos (POO).

Durante las distintas etapas del desarrollo se han implementado funcionalidades para la administración de personas vinculadas a la agencia (guías, operadores y proveedores), así como la representación de los distintos servicios turísticos mediante una jerarquía de clases. Además, se incorporó el uso de **polimorfismo** y **colecciones genéricas**, permitiendo gestionar diferentes tipos de servicios turísticos desde una única colección y recorrerlos dinámicamente.

---

# Objetivos

El proyecto tiene como objetivos:

- Organizar el código utilizando una estructura modular basada en paquetes.
- Aplicar el principio de encapsulamiento mediante atributos privados.
- Implementar constructores, métodos **getters**, **setters** y el método **toString()**.
- Modelar relaciones de herencia entre clases.
- Aplicar polimorfismo mediante referencias a la superclase.
- Gestionar objetos utilizando colecciones genéricas (`List` y `ArrayList`).
- Reutilizar código mediante superclases.
- Leer y validar información desde archivos externos.
- Mostrar información mediante una aplicación de consola.

---

# Estructura del proyecto

```text
src/
│
├── model/
│   ├── Persona.java
│   ├── Guia.java
│   ├── Operador.java
│   ├── Proveedor.java
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── data/
│   └── GestorServicios.java
│
├── service/
│   └── PersonaService.java
│
├── util/
│   └── ArchivoUtil.java
│
└── ui/
    └── Main.java
```

---

# Descripción de las clases

## Paquete `model`

### Persona

Clase abstracta que representa la información común de las personas asociadas a la agencia.

**Atributos:**

- rut
- nombre
- correo

Implementa:

- Constructor.
- Métodos getters y setters.
- Método `toString()`.

---

### Guia

Hereda de la clase `Persona` y representa a los guías turísticos.

**Atributo adicional:**

- especialidad

---

### Operador

Hereda de la clase `Persona` y representa a los operadores turísticos.

**Atributo adicional:**

- servicio

---

### Proveedor

Hereda de la clase `Persona` y representa a los proveedores externos.

**Atributo adicional:**

- rubro

---

### ServicioTuristico

Superclase que representa cualquier servicio turístico ofrecido por la agencia.

**Atributos:**

- nombre
- duracionHoras

Implementa:

- Constructor.
- Getters y setters.
- Método `toString()`.
- Método `mostrarInformacion()`, utilizado como base para aplicar polimorfismo.

---

### RutaGastronomica

Hereda de `ServicioTuristico`.

**Atributo adicional:**

- numeroDeParadas

Sobrescribe el método `mostrarInformacion()` para mostrar la información específica de una ruta gastronómica.

---

### PaseoLacustre

Hereda de `ServicioTuristico`.

**Atributo adicional:**

- tipoEmbarcacion

Sobrescribe el método `mostrarInformacion()` para mostrar la información específica del paseo lacustre.

---

### ExcursionCultural

Hereda de `ServicioTuristico`.

**Atributo adicional:**

- lugarHistorico

Sobrescribe el método `mostrarInformacion()` para mostrar la información específica de una excursión cultural.

---

## Paquete `data`

### GestorServicios

Clase encargada de administrar los servicios turísticos.

Sus principales responsabilidades son:

- Crear una colección de tipo `List<ServicioTuristico>`.
- Agregar objetos de las distintas subclases.
- Recorrer la colección utilizando un bucle `for-each`.
- Invocar el método `mostrarInformacion()` aplicando polimorfismo.

---

## Paquete `service`

### PersonaService

Clase responsable de la lógica relacionada con la administración de personas.

Permite:

- Listar personas.
- Buscar personas por RUT.
- Buscar personas por nombre.

---

## Paquete `util`

### ArchivoUtil

Clase utilitaria encargada de la lectura de archivos externos y la validación de los datos cargados al sistema mediante el uso de bloques `try-catch`.

---

## Paquete `ui`

### Main

Clase principal de la aplicación.

Su función es iniciar la ejecución del sistema, cargar los servicios turísticos mediante `GestorServicios` y recorrer la colección utilizando polimorfismo para mostrar la información correspondiente a cada servicio.

---

# Conceptos aplicados

Durante el desarrollo del proyecto se implementaron los siguientes conceptos de Programación Orientada a Objetos:

- Programación Orientada a Objetos (POO).
- Encapsulamiento.
- Clases abstractas.
- Herencia simple.
- Polimorfismo.
- Sobrescritura de métodos (`@Override`).
- Uso del constructor de la superclase mediante `super()`.
- Colecciones genéricas (`List` y `ArrayList`).
- Recorrido de colecciones mediante `for-each`.
- Lectura de archivos externos.
- Manejo de excepciones mediante `try-catch`.
- Organización modular mediante paquetes.
- Separación de responsabilidades.
- Reutilización de código.

---

# Tecnologías utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub

---

# Instrucciones de ejecución

1. Clonar el repositorio desde GitHub.
2. Abrir el proyecto utilizando IntelliJ IDEA.
3. Ejecutar la clase `Main` ubicada en el paquete `ui`.
4. La aplicación mostrará por consola los distintos servicios turísticos almacenados en una colección genérica, aplicando polimorfismo mediante el método `mostrarInformacion()`.

---

# Autor

**Gabriel Urra**

Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos I**.
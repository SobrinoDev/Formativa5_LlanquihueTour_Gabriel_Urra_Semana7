# LlanquihueTourApp

## Desarrollo Orientado a Objetos I

---

# Descripción del proyecto

**LlanquihueTourApp** es una aplicación desarrollada en **Java** como parte de la asignatura **Desarrollo Orientado a Objetos I**.

El proyecto representa un sistema de gestión para la agencia de turismo **Llanquihue Tour**, permitiendo administrar distintas entidades relacionadas con su operación, como guías turísticos, operadores, proveedores, colaboradores externos, vehículos y servicios turísticos.

Durante el desarrollo del proyecto se han aplicado los principales conceptos de Programación Orientada a Objetos, incorporando encapsulamiento, herencia, polimorfismo, interfaces, colecciones genéricas, lectura y escritura de archivos, además de una interfaz gráfica básica mediante **JOptionPane**.

---

# Objetivos

El proyecto tiene como finalidad:

- Organizar el código utilizando una estructura modular basada en paquetes.
- Aplicar encapsulamiento mediante atributos privados.
- Implementar constructores, getters, setters y el método `toString()`.
- Modelar relaciones de herencia entre clases.
- Aplicar polimorfismo mediante interfaces y sobrescritura de métodos.
- Gestionar objetos utilizando colecciones genéricas (`ArrayList`).
- Validar tipos de objetos utilizando `instanceof`.
- Leer y almacenar información utilizando archivos CSV.
- Implementar una interfaz gráfica básica mediante `JOptionPane`.
- Favorecer la reutilización y mantenibilidad del código.

---

# Estructura del proyecto

```text
src/
│
├── model/
│   ├── Registrable.java
│   ├── Persona.java
│   ├── Guia.java
│   ├── Operador.java
│   ├── Proveedor.java
│   ├── Vehiculo.java
│   ├── ColaboradorExterno.java
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── data/
│   ├── GestorServicios.java
│   └── GestorEntidades.java
│
├── service/
│   └── PersonaService.java
│
├── util/
│   └── ArchivoUtil.java
│
└── ui/
    └── Main.java

resources/
└── personas.csv
```

---

# Arquitectura del sistema

| Paquete | Descripción |
|----------|-------------|
| **model** | Contiene las clases del modelo y la interfaz `Registrable`. |
| **data** | Gestiona las colecciones de entidades y servicios turísticos. |
| **service** | Contiene la lógica de negocio asociada a las personas. |
| **util** | Gestiona la lectura y escritura de archivos CSV. |
| **ui** | Contiene la interfaz gráfica y el punto de inicio de la aplicación. |

---

# Descripción de las clases

## Paquete `model`

### Registrable

Interfaz que define el comportamiento común de todas las entidades administradas por el sistema mediante el método:

```java
mostrarResumen();
```

---

### Persona

Clase abstracta que representa la información común de las personas registradas en la agencia.

**Atributos:**

- rut
- nombre
- correo

Es la superclase de:

- Guia
- Operador
- Proveedor
- ColaboradorExterno

Implementa la interfaz `Registrable`.

---

### Guia

Representa a un guía turístico.

**Atributo adicional:**

- especialidad

Implementa el método `mostrarResumen()`.

---

### Operador

Representa a un operador turístico.

**Atributo adicional:**

- servicio

---

### Proveedor

Representa a un proveedor de servicios.

**Atributo adicional:**

- rubro

---

### ColaboradorExterno

Representa a un colaborador externo de la agencia.

**Atributos adicionales:**

- empresa
- funcion

---

### Vehiculo

Representa un vehículo utilizado por la agencia.

**Atributos:**

- patente
- marca
- modelo
- capacidadPasajeros

Implementa la interfaz `Registrable`.

---

### ServicioTuristico

Clase base para representar los distintos servicios turísticos ofrecidos por la agencia.

**Atributos:**

- nombre
- duracionHoras

Incluye el método `mostrarInformacion()`, sobrescrito por sus subclases.

Subclases:

- RutaGastronomica
- PaseoLacustre
- ExcursionCultural

---

# Paquete `data`

### GestorServicios

Administra los servicios turísticos utilizando una colección polimórfica.

Permite:

- Registrar servicios.
- Recorrer la colección.
- Mostrar la información de cada servicio.

---

### GestorEntidades

Administra todas las entidades registrables del sistema.

Implementa:

- Colección `ArrayList<Registrable>`.
- Registro de entidades.
- Recorrido mediante polimorfismo.
- Validación utilizando `instanceof`.
- Obtención del resumen de todas las entidades registradas.

---

# Paquete `service`

### PersonaService

Contiene la lógica relacionada con las personas registradas en la agencia.

Permite:

- Buscar personas por RUT.
- Buscar personas por nombre.
- Mostrar personas registradas.

---

# Paquete `util`

### ArchivoUtil

Clase encargada de la persistencia de datos.

Permite:

- Leer entidades desde el archivo `personas.csv`.
- Crear automáticamente los objetos correspondientes.
- Guardar nuevas entidades en el archivo CSV.
- Validar registros y controlar errores mediante `try-catch`.

---

# Paquete `ui`

### Main

Clase principal del sistema.

Implementa una interfaz gráfica mediante `JOptionPane`, permitiendo:

- Registrar guías turísticos.
- Registrar vehículos.
- Registrar colaboradores externos.
- Visualizar todas las entidades registradas.
- Cargar automáticamente la información almacenada en el archivo `personas.csv`.

---

# Funcionalidades implementadas

- Organización modular mediante paquetes.
- Encapsulamiento.
- Clases abstractas.
- Interfaces.
- Herencia simple.
- Polimorfismo.
- Sobrescritura de métodos (`@Override`).
- Uso del constructor de la superclase (`super()`).
- Uso de `instanceof`.
- Colecciones genéricas (`ArrayList`).
- Lectura de archivos CSV.
- Escritura de archivos CSV.
- Persistencia de datos.
- Manejo de excepciones mediante `try-catch`.
- Interfaz gráfica utilizando `JOptionPane`.

---

# Tecnologías utilizadas

- Java
- Swing (`JOptionPane`)
- IntelliJ IDEA
- Git
- GitHub

---

# Instrucciones de ejecución

1. Clonar el repositorio desde GitHub.
2. Abrir el proyecto utilizando IntelliJ IDEA.
3. Verificar que el archivo `resources/personas.csv` exista dentro del proyecto.
4. Ejecutar la clase `Main` ubicada en el paquete `ui`.
5. Utilizar el menú gráfico para registrar nuevas entidades o visualizar los registros existentes.
6. Cada nuevo registro será almacenado automáticamente en el archivo `personas.csv`.

---

# Autor

**Gabriel Urra**

Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos**.
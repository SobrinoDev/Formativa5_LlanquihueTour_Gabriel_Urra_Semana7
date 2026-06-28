# LlanquihueTourApp

## Descripción

Aplicación de consola desarrollada en Java para la agencia de turismo Llanquihue Tour.  
El sistema permite cargar información de guías, operadores y proveedores desde un archivo CSV, almacenar los datos en una colección dinámica y realizar búsquedas simples por consola.

## Paquetes utilizados

- model: contiene las clases del modelo de datos.
- util: contiene la clase encargada de leer archivos externos.
- service: contiene la lógica de búsqueda y listado.
- app: contiene la clase principal Main.

## Clases implementadas

- Persona: clase abstracta base.
- Guia: representa a un guía turístico.
- Operador: representa a un operador local.
- Proveedor: representa a un proveedor de servicios.
- ArchivoUtil: carga datos desde personas.csv.
- PersonaService: permite listar y buscar personas.
- Main: ejecuta el sistema.

## Archivo de entrada

El archivo se encuentra en:

resources/personas.csv

Formato:

TIPO;RUT;NOMBRE;CORREO;DETALLE

Ejemplo:

GUIA;12345678-9;Camila Soto;camila@correo.cl;Rutas culturales

## Funcionalidades

- Organización modular por paquetes.
- Uso de atributos privados.
- Constructores, getters, setters y toString().
- Herencia mediante la clase Persona.
- Uso de ArrayList<Persona>.
- Lectura de archivo CSV.
- Validación de registros.
- Manejo de errores con try-catch.
- Listado de registros por consola.
- Búsqueda por RUT.
- Búsqueda por nombre.

## Ejecución

Abrir el proyecto en IntelliJ IDEA y ejecutar la clase:

app.Main

Verificar que el archivo personas.csv esté ubicado en la carpeta resources.

package model;

public class ColaboradorExterno extends Persona {
    private String empresa;
    private String funcion;

    public ColaboradorExterno(
            String rut,
            String nombre,
            String correo,
            String empresa,
            String funcion
    ) {
        super(rut, nombre, correo);
        this.empresa = empresa;
        this.funcion = funcion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public String mostrarResumen() {
        return "=== COLABORADOR EXTERNO ===\n"
                + "RUT: " + getRut() + "\n"
                + "Nombre: " + getNombre() + "\n"
                + "Correo: " + getCorreo() + "\n"
                + "Empresa: " + empresa + "\n"
                + "Función: " + funcion;
    }

    @Override
    public String toString() {
        return "[Colaborador externo] " + super.toString()
                + " | Empresa: " + empresa
                + " | Función: " + funcion;
    }
}
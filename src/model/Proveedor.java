package model;

public class Proveedor extends Persona {
    private String rubro;

    public Proveedor(String rut, String nombre, String correo, String rubro) {
        super(rut, nombre, correo);
        this.rubro = rubro;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public String toString() {
        return "[Proveedor] " + super.toString() +
                " | Rubro: " + rubro;
    }
}

package poo.vestidos.dominio;

public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre=nombre;
    }

    public void Empleado(String nombre){

    }
    public abstract long calcularSalario();

    public String getNombre() {
        return nombre;
    }
}

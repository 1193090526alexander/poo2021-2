package dominio;

public class Productos {
    private String nombre;
    private int codigo;
    private  int precio;
    private int cantidadActual;

    public Productos(String nombre, int codigo, int precio, int cantidadActual) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidadActual = cantidadActual;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}

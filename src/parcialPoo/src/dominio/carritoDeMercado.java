package dominio;

import java.util.ArrayList;
import java.util.List;

public class carritoDeMercado {
    public static final byte CAPACIDAD=20;
    private String supermercado;
    private List<Producto> productos;

    public carritoDeMercado(String supermercado) {
        this.supermercado = supermercado;
        this.productos= new ArrayList<>();
    }
    public boolean agregar(String nombre, int precio, String tipo){
        if (CAPACIDAD > productos.size()){
             new Producto(nombre, precio, tipo);
             return true;
        } else {
            System.out.println("No es posible agregar un producto");
            return false;
        }
    }
    public Producto buscar(String nombre){
        for (Producto p : this.getProductos()) {
            if (p.getNombre().equals(nombre)) {
                System.out.println("lel producto busacado es " +  p.getNombre());
            }
        }
        return null;
    }
    public List<Producto> buscarPorTipo(String tipo){
        List<Producto> productosTipo = new ArrayList<>();
        for (Producto productos: this.getProductos()) {
            if (productos.getTipo().equals(tipo)) {
                productosTipo.add(productos);
            }
        }
        return productosTipo;
    }
    public boolean sacar(String nombre){
        for(Producto p: this.getProductos()){
            if(p.getNombre().equals(nombre)){
                this.getProductos().remove(p);
                return true;
            }
        }
        return false;
    }
    public int calcularValorTotal(){
        int suma = 0;
        for (Producto prod: this.getProductos()) {
            suma += prod.getPrecio();
        }
        System.out.println("el total de los productos del carrito es de  "+ suma);
        return suma;
    }
    public Producto obtenerProductoMasCaro(){
        return null;
    }

    public List<Producto> getProductos() {
        return productos;
    }



}

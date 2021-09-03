package dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dispensadora {
    private String marca;
    static final int CAPACIDAD=10;
    private List<Productos> producto;

    public Dispensadora(String marca) {
        this.marca = marca;
        this.producto = new ArrayList<>();
    }
    public boolean sacarUnidad(String nombre){
        List<Productos> prod =new ArrayList<>();
                for(Productos p: this.getProducto()){
                    if(p.getNombre().equals(nombre) && p.getCantidadActual()>0){
                        int cantidad = p.getCantidadActual();
                        p.setCantidadActual(cantidad-1);
                        return true;
                    }
                }
        return false;
    }
    public boolean sacarUnidad(int codigo){
        List<Productos> prod =new ArrayList<>();
        for(Productos p: this.getProducto()){
            if(p.getCodigo() ==codigo && p.getCantidadActual()>0){
                int cantidad = p.getCantidadActual();
                p.setCantidadActual(cantidad-1);
                return true;
            }
        }
        return false;
    }
    public List<String> productosAgotados(){
        List<Productos> agotados = new ArrayList<>();
        for (Productos productos: this.getProducto()) {
            if (productos.getCantidadActual() == 0) {
                System.out.println("el producto agotado es "+ productos.getNombre());
            }
        }
        return null;
    }
    public int consultarUnidades(String nombre) {
        for (Productos p : this.getProducto()) {
            if (p.getNombre().equals(nombre)) {
                int cantidad = p.getCantidadActual();
                System.out.println("la cantidad de " +  p.getNombre() + "es de " + cantidad);
            }
        }
        return 0;

    }
    public int totalUnidades(){
        int suma = 0;
        List<Productos> total = new ArrayList<>();
        for (Productos prod: this.getProducto()) {
            int cantidad = prod.getCantidadActual();
            suma+=cantidad;

            }
        System.out.println("la cantidad total de las unodades es de "+ suma);
        return suma;
    }


    public void aumentarProducto(int codigo, int cantidadAuemtar) {
        for (Productos p : this.getProducto()) {
            int nuevaCantidad = p.getCantidadActual();
            if (p.getCodigo() == codigo) {
                if ((nuevaCantidad + cantidadAuemtar) <= 8) {
                    p.setCantidadActual(nuevaCantidad + cantidadAuemtar);
                    System.out.println("aumento del producto " + p.getCantidadActual() + " del producto " + p.getNombre());

                } else if ((nuevaCantidad + cantidadAuemtar) > 8) {
                    System.out.println("escede la acapaciada de unidades");

                }
            }
        }
    }
    public String getMarca() {
        return marca;
    }

    public List<Productos> getProducto() {
        return producto;
    }

}

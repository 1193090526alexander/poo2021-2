package app;

import dominio.Producto;
import dominio.TipoPoducto;
import dominio.carritoDeMercado;

public class appSupermercado {
    public static void main(String[] args) {
        carritoDeMercado supermercado = new carritoDeMercado("surtitodo");
        Producto pro1 = new Producto("pera", 1600, TipoPoducto.FRUTA);
        Producto pro2 = new Producto("lomo", 20000, TipoPoducto.CARNE);
        Producto pro3 = new Producto("pan de oro", 1600, TipoPoducto.PAN);
        Producto pro4 = new Producto("pera", 1600, TipoPoducto.FRUTA);
        Producto pro5 = new Producto("naranja", 1100, TipoPoducto.FRUTA);
        Producto pro6 = new Producto("manzana", 1700, TipoPoducto.FRUTA);
        Producto pro7 = new Producto("toamate", 3000, TipoPoducto.VERDURA);
        Producto pro8 = new Producto("pera", 1600, TipoPoducto.ARINA);
        Producto pro9 = new Producto("papaya", 4500, TipoPoducto.FRUTA);
        supermercado.getProductos().add(pro1);
        supermercado.getProductos().add(pro2);
        supermercado.getProductos().add(pro3);
        supermercado.getProductos().add(pro4);
        supermercado.getProductos().add(pro5);
        supermercado.getProductos().add(pro6);
        supermercado.getProductos().add(pro7);
        supermercado.getProductos().add(pro8);
        supermercado.getProductos().add(pro9);
        supermercado.agregar("papaya", 1200, TipoPoducto.FRUTA);
        supermercado.getProductos().forEach(cont -> {
            System.out.println("nombre " + cont.getNombre() + " precio  "  + cont.getPrecio()+ " y el tipo " + cont.getTipo());
        });
        supermercado.calcularValorTotal();
        supermercado.sacar("toamate");
        supermercado.getProductos().forEach(cont -> {
            System.out.println("nombre " + cont.getNombre() + " Precio "  + cont.getPrecio()+ " y el tipo " + cont.getTipo());
        });
        supermercado.buscar("pera");


    }
}

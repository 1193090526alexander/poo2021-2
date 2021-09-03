package App;

import dominio.Dispensadora;
import dominio.Productos;

public class appdis {
    public static void main(String[] args) {
        Dispensadora dispensadora = new Dispensadora("mecato");
        Productos pro1 = new Productos("jet",123, 600,5);
        Productos pro2 = new Productos("chocorramo",456, 2500,0);
        Productos pro3 = new Productos("margarita",183, 1000,1);
        Productos pro4 = new Productos("doritos",223, 1200,5);
        Productos pro5 = new Productos("chitos",723, 500,0);
        Productos pro6 = new Productos("choclitos",563, 600,8);
        Productos pro7 = new Productos("gol",003, 800,5);
        Productos pro8 = new Productos("galletas",103, 900,4);
        Productos pro9 = new Productos("boliquesos",100, 1300,0);
        Productos pro10 = new Productos("chistris",101, 1500,6);
        dispensadora.getProducto().add(pro1);
        dispensadora.getProducto().add(pro2);
        dispensadora.getProducto().add(pro3);
        dispensadora.getProducto().add(pro4);
        dispensadora.getProducto().add(pro5);
        dispensadora.getProducto().add(pro6);
        dispensadora.getProducto().add(pro7);
        dispensadora.getProducto().add(pro8);
        dispensadora.getProducto().add(pro9);
        dispensadora.getProducto().add(pro10);

        dispensadora.sacarUnidad(183);
        dispensadora.sacarUnidad("galletas");
        dispensadora.productosAgotados();
        dispensadora.consultarUnidades("chistris");
        dispensadora.totalUnidades();
        dispensadora.aumentarProducto(100, 2);
        dispensadora.consultarUnidades("boliquesos");
        dispensadora.totalUnidades();
        dispensadora.sacarUnidad("margarita");
        dispensadora.productosAgotados();

    }
}

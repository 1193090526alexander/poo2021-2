package App;

import dominio.bicicleta;

public class App {
    public static void main(String[] args) {
       bicicleta bicicletaHelmer= new bicicleta("speed", "helmer", "negro", 1500000, 45);

       bicicletaHelmer.velocidad=45;
        System.out.println("color: " + bicicletaHelmer.color + "\nel presio es de: " + bicicletaHelmer.precio + "\nvelocidad: " + bicicletaHelmer.velocidad);
       bicicletaHelmer.cambiarcolor("azul");
       bicicletaHelmer.cambiarPrecio(2100000);
       bicicletaHelmer.acelerar(12.5);
        System.out.println("\n" + "nuevos Datos" + "\ncolor: " + bicicletaHelmer.color + "\nel presio es de: " + bicicletaHelmer.precio + "\nvelocidad: " + bicicletaHelmer.velocidad);
        bicicletaHelmer.frenar(60);
        System.out.println(bicicletaHelmer.velocidad);

    }
}

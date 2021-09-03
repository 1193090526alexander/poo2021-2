package dominio;

public class bicicleta {
    public String marca;
    public String referencia;
    public String color;
    public long precio;
    public double velocidad;

    public bicicleta(String marca, String referencia, String color, long precio, double velocidad) {
        this.marca = marca;
        this.referencia = referencia;
        this.color = color;
        this.precio = precio;
        this.velocidad = velocidad;
    }

    public void cambiarPrecio(long nuevoPrecio){
        this.precio = nuevoPrecio;

    }
    public void cambiarcolor(String nuevoColor){
        this.color=nuevoColor;

    }
    public boolean acelerar(double aumentar){
        if (aumentar>0){
            this.velocidad+=aumentar;
            return true;
        }
        return false;
    }
    public boolean frenar(double decremento){
        if (this.velocidad>decremento){
            this.velocidad-=decremento;
            return true;
        }
        this.velocidad=0;
        return false;
    }
}

package dominio;

public class Dispensador {
    public String marca;
    public long maxCantidadGel;
    public String color;
    public boolean sensor;
    public long gelActual;

    public void activo(){
        this.sensor=true;
    }

    public void inaactivo(){
        this.sensor=false;
    }
    public boolean dispensar(long cantidadADispenasar){

        if (this.sensor && cantidadADispenasar>0){
            this.gelActual-=cantidadADispenasar;
            return true;
        }
        return false;
    }
    public boolean agregarGel(long nuevaCantiudad){

        if (this.gelActual<maxCantidadGel && this.gelActual+nuevaCantiudad<=maxCantidadGel){
            this.gelActual+=nuevaCantiudad;
            return true;
        }
        System.out.println("la dispensadora se llenara hasta su cantidad maxima: " + this.maxCantidadGel);
        return false;
        }


    public void gelActual(){
        System.out.println("la cantidad actual del gel es de: " + this.gelActual);
    }

}

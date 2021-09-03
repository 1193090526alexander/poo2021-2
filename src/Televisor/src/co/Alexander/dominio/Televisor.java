package co.Alexander.dominio;

public class Televisor {
    public short tamano;
    public String marca;
    public String referencia;
    public boolean encendido;
    public short canalsintonizado;
    public byte volumenActual;

    public Televisor(String marca, short canalsintonizado, byte volumenActual) {
        this.marca = marca;
        this.canalsintonizado = canalsintonizado;
        this.volumenActual = volumenActual;
    }

    public void encender(){
        encendido=true;
    }
    public void apagar(){
        encendido=false;
    }
    public void subirVolumen(){
        if(this.encendido){
            this.volumenActual++;
        }
    }
    public void bajarVolumen(){
        if (this.encendido){
            this.volumenActual--;
        }
        System.out.println(this.volumenActual);

    }
    public boolean cambiarcanal(short nuevoCanal){
        if (this.encendido){
            this.canalsintonizado = nuevoCanal;
            return true;
        }
        return false;
    }
}

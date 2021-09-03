package dominio;

public class Docente {
    //Atributos
    private String identificacion;
    private String nombre;
    private int edad;
    //constructores

    public Docente(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public void mostararInformacion(){
        System.out.println("El Docente " + nombre + " con identificacion " +identificacion );
    }
}

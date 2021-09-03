package dominio;

public class Contacto {
    private String nombre;
    private String Apellido;
    private String numero;

    public Contacto(String nombre, String apellido, String numero) {
        this.nombre = nombre;
        this.Apellido = apellido;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}

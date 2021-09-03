package co.elmer.dominio;

import java.time.LocalDateTime;

public class persona {
    public String nombre;
    public LocalDateTime fechaNacimoento;
    public long identificacion;

    public persona(String nombre, long identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public persona(String nombre, long identificacion, LocalDateTime fechaNacimoento) {
        this.nombre = nombre;
        this.fechaNacimoento = LocalDateTime.now();
        this.identificacion = identificacion;
    }

    public persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFechaNacimoento() {
        return fechaNacimoento;
    }

    public long getIdentificacion() {
        return identificacion;
    }

}

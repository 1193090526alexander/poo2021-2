package co.elmer.dominio;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nombre;
    private persona gerente;
    private String ubicacion;
    private List<CuentaBancaria> cuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentas= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public persona getGerente() {
        return gerente;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setGerente(persona gerente) {
        this.gerente = gerente;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}

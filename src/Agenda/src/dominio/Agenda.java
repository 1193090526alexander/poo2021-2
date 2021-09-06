package dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Agenda {
    static final int CAPACIDAD=20;
    private List<Contacto> contactos;

    public Agenda(){
        this.contactos = new ArrayList<>();
    }
  public void crearContacto(){
        if (CAPACIDAD<this.contactos.size()){

        }

    }
    public boolean eliminarContacto(String nombre){
        for (Contacto cont : this.getContactos()) {
            if (cont.getNombre().equals(nombre)) {
                this.getContactos().remove(cont);
                return true;
            }
            }

        return false;
    }
    public boolean buscarContactoNombre(String nombre) {
        for (Contacto p : this.getContactos()) {
            if (p.getNombre().equals(nombre)) {
                System.out.println("el contacto que buscó por nombre es " + p.getNombre() + " " + p.getApellido() + "con Numoer "+ p.getNumero());
                return true;
            }
        }
        System.out.println("no existe");
        return false;
    }
    public boolean buscarContactoApellido(String Apellido){
        for (Contacto p : this.getContactos()) {
            if (p.getApellido().equals(Apellido)) {
                System.out.println("el contacto que buscó por apellido es " + p.getNombre() + " " + p.getApellido() + "con Numoer "+ p.getNumero());
                return true;
            }
        }
        return false;
    }
    public boolean buscarContactoNumero(String numero){
        for (Contacto p : this.getContactos()) {
            if (p.getNumero().equals(numero)) {
                System.out.println("el contacto que buscó por numero es " + p.getNombre() + " " + p.getApellido() + "con Numoer "+ p.getNumero());
                return true;
            }
        }
        return false;
    }
    public void cambiarNumero(String nombre, String numero){
        for (Contacto p : this.getContactos()) {
            if (p.getNombre().equals(nombre)) {
                p.setNumero(numero);
            }
        }
    }
    public List<Contacto> ordenarLista(){

        Collections.sort(Contacto);
    }
    public List<Contacto> getContactos() {
        return contactos;
    }

}


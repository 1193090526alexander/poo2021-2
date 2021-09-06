package app;

import dominio.Agenda;
import dominio.Contacto;

import java.util.Collections;

public class appagenda {
    public static void main(String[] args) {
        Agenda helmer = new Agenda();
        Contacto con1 = new Contacto("juan","ramirez","3122211562");
        Contacto con2 = new Contacto("felipe","quintero","3105456789");
        Contacto con3 = new Contacto("camilo","flores","3119876543");
        Contacto con4 = new Contacto("santiago","correa","3122211562");
        Contacto con5 = new Contacto("sebastian","lopez","3104094288");
        Contacto con6 = new Contacto("alejandra","gomez","3147689876");

        helmer.getContactos().add(con1);
        helmer.getContactos().add(con2);
        helmer.getContactos().add(con3);
        helmer.getContactos().add(con4);
        helmer.getContactos().add(con5);
        helmer.getContactos().add(con6);
        helmer.buscarContactoApellido("gomez");
        helmer.buscarContactoNombre("uh");
        helmer.buscarContactoNumero("3104094288");
        helmer.cambiarNumero("sebastian", "3109087779");
      helmer.buscarContactoNombre("sebastian");
      helmer.eliminarContacto("felipe");
      helmer.buscarContactoNombre("felipe");
      helmer.agregar("juan", "urrao" ,"31245234534");
        helmer.getContactos().forEach(cont -> {
            System.out.println("nombre " + cont.getNombre() + " Apellido  "  + cont.getApellido() + " y el numoer " + cont.getNumero());
        });

    }
}

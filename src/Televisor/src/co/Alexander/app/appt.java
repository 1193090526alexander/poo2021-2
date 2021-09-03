package co.Alexander.app;

import co.Alexander.dominio.Televisor;

public class appt {
    public static void main(String[] args) {
        Televisor newtelevisor = new Televisor("lg", 200, 12);

        System.out.println("El volumen actual es de " + newtelevisor.volumenActual);
        System.out.println("el canal que estas viendo es "+newtelevisor.canalsintonizado);

        newtelevisor.encender();
        newtelevisor.subirVolumen();
        newtelevisor.cambiarcanal((short) 12);
        System.out.println("El volumen actual es de " + newtelevisor.volumenActual);
        System.out.println("el canal que estas viendo es "+newtelevisor.canalsintonizado);

    }
}

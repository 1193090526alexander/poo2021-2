package co.elmer.app;

import co.elmer.dominio.Banco;
import co.elmer.dominio.CuentaBancaria;
import co.elmer.dominio.persona;

public class App {
    public static void main(String[] args) {
        Banco bancolombia= new Banco("bancolombia");
        persona Alexander = new persona("Alexander",1193090526);
        persona Alejo = new persona("Alejo",1005789464);
        CuentaBancaria ceuntahelmer = new CuentaBancaria(123, "ahorros", 1000000, Alexander, bancolombia);


        CuentaBancaria cuentalejo = new CuentaBancaria(222,"ahorros", 500000, Alejo,bancolombia);


        cuentalejo.mostaraSalso();
        ceuntahelmer.mostaraSalso();
        cuentalejo.transferir(ceuntahelmer, 10000);
        System.out.println("los saldos de las cuenats seran");
        cuentalejo.mostaraSalso();
        ceuntahelmer.mostaraSalso();

    }
}

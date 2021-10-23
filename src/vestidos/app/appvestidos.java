package poo.vestidos.app;

import poo.vestidos.dominio.*;

import java.util.ArrayList;

public class appvestidos {
    public static void main(String[] args) {
        Nomina nomina=new Nomina();
        ArrayList<Empleado> empleados= new ArrayList<>();
        Empleado juan=new Directo("Juan",6812000);
        Empleado julián=new Vendedor("Julián",2410000,62106200);
        Empleado johanna=new Freenlace(79,120000,"Johanna");
        Empleado carolina=new Vendedor("Carolina",998000,71589600);
        Empleado pedro=new Promotor("Pedro",974,190,68);
        Empleado david=new Directo("David",3578000);
        Empleado gustavo=new Freenlace(64,70500,"Gustavo");
        nomina.getEmpleados().add(juan);
        nomina.getEmpleados().add(julián);
        nomina.getEmpleados().add(carolina);
        nomina.getEmpleados().add(johanna);
        nomina.getEmpleados().add(david);
        nomina.getEmpleados().add(pedro);
        nomina.getEmpleados().add(gustavo);

        nomina.getEmpleados().forEach(nominaactual->{StringBuilder vistaso = new StringBuilder();
            vistaso.append(nominaactual.getNombre()).append(" tiene un salario de: ").append(nominaactual.calcularSalario());
            System.out.println(vistaso);
        });

    }
}

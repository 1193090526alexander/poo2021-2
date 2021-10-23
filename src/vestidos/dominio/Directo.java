package poo.vestidos.dominio;

public class Directo extends Empleado{
    private long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario=salario;
    }
    public long calcularSalud(){
        return (long) (salario*0.04);
    }
    public long calcularPension(){
        return (long) (salario*0.065);
    }
    @Override
    public long calcularSalario(){
        return salario-(this.calcularPension()+this.calcularSalud());
    }

    public long getSalario() {
        return salario;
    }

}

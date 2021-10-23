package poo.vestidos.dominio;

public class Vendedor extends Directo{
    private long ventasDelMes;

    public Vendedor(String nombre, long ventasDelMes, long salario) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }
    public long calcularComision(){
        long saldo=0;
        if(getSalario()>=999999){
            saldo=(long)(ventasDelMes*0.045);
        }else {
            saldo=(long)(ventasDelMes*0.055);
        }
        return saldo;
    }
    @Override
    public long calcularSalario() {

        return this.getSalario()+calcularComision()-(calcularPension()+calcularSalud());
    }
}

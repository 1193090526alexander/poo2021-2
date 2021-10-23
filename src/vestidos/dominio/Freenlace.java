package poo.vestidos.dominio;

public class Freenlace extends Empleado{
    private long valorHora;
    private int horasTrabajadas;

    public Freenlace(long valorHora, int horasTrabajadas, String nombre) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public long calcularSalario() {
        return (valorHora*horasTrabajadas);
    }
}

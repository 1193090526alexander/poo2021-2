package poo.vestidos.dominio;

public class Promotor extends Empleado{
    private int volantesRepartidos;
    private long valorVolantes;
    private int comprasVolantes;

    public Promotor(String nombre, int volantesRepartidos, long valorVolantes, int comprasVolantes) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolantes = valorVolantes;
        this.comprasVolantes = comprasVolantes;
    }

    @Override
    public long calcularSalario() {
        return (volantesRepartidos*valorVolantes)+(comprasVolantes*17000);
    }
}

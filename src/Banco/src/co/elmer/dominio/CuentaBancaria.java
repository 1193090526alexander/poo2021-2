package co.elmer.dominio;
public class CuentaBancaria {
    //Atributos
    private int numero;
    private String tipoCuenta;
    private long saldo;
    private persona propietario;
    private Banco banco;
    private boolean activa;

    //Constructores
    public CuentaBancaria(int numero, String tipoCuenta, persona propietario, Banco banco) {
        this.numero = numero;
        this.tipoCuenta = tipoCuenta;
        this.propietario = propietario;
        this.banco = banco;
        this.activa=true;
        this.saldo=0;
    }

    public CuentaBancaria(int numero, String tipoCuenta, long saldo, persona propietario, Banco banco) {
        this(numero, tipoCuenta, propietario, banco);
        this.saldo = saldo;

    }

    //Metodos

    public void activar(){
        activa = true;
    }
    public void inactivar(){
        activa = false;
    }
    public boolean consignar(long dienroAConsiganr){
        if (activa== true ) {
            saldo += dienroAConsiganr;
            return true;
        }else{
            return false;
        }
    }
    public boolean retirar(long diernoARetirar){
        if(diernoARetirar<=saldo && activa==true){
            saldo-=diernoARetirar;
            return true;
        }else{
            System.out.println("el valor a retitar eS mayor al saldo");
            return false;
        }
    }
    public boolean transferir(CuentaBancaria cuentaDestino, long dienrATranferir){
        boolean retiro= this.retirar(dienrATranferir);
        if (retiro==true){
            boolean consigno= cuentaDestino.consignar(dienrATranferir);
            if (consigno==true){
                return true;
            }else{
                this.consignar(dienrATranferir);
                return false;
            }
        }else{
            return false;
        }

    }
    public void mostaraSalso(){
        System.out.println("El saldo  de la cuenta" + numero + " es: $" +saldo);
    }

    public int getNumero() {
        return numero;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public long getSaldo() {
        return saldo;
    }

    public persona getPropietario() {
        return propietario;
    }

    public Banco getBanco() {
        return banco;
    }

    public boolean isActiva() {
        return activa;
    }

}

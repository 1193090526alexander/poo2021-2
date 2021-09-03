package dominio;

import java.util.ArrayList;
import java.util.List;

public class Nota {
    //Atributos
    private double parcial;
    private List<Double> seguimiento;
    private double  nfinal;
    private Asignatura materia;

    public Nota( Asignatura materia) {

        this.materia = materia;

    }

    //metodos

   private double calcularSeguimiento(){
        double sumaNotas=0;
        for (Double nota: this.seguimiento) {
            sumaNotas += nota;
        }
        return sumaNotas/this.seguimiento.size();
    }
  public double calcularDefinitiva(){
return (this.parcial*0.3)+ (this.nfinal*0.3)+(calcularSeguimiento()*0.4);
    }

    public double getParcial() {
        return parcial;
    }

    public List<Double> getSeguimiento() {
        return seguimiento;
    }

    public double getNfinal() {
        return nfinal;
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setParcial(double parcial) {
        this.parcial = parcial;
    }

    public void setSeguimiento(List<Double> seguimiento) {
        this.seguimiento = seguimiento;
    }

    public void setNfinal(double nfinal) {
        this.nfinal = nfinal;
    }
}

package dominio;

import java.util.ArrayList;
import java.util.List;

public class Nota {
    //Atributos
    private double parcial;
    private List<Double> seguimiento;
    private double  nfinal;
    private Asignatura materia;
    private static final double PORC_SEGUIMIENTO=0.4;
    private static final double PORC_PARCIAL=0.4;
    private static final double PORC_FINAL=0.4;

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
return (this.parcial*PORC_PARCIAL)+ (this.nfinal*PORC_FINAL)+(calcularSeguimiento()*PORC_SEGUIMIENTO);
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

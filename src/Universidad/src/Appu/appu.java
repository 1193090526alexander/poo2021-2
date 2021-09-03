package Appu;

import dominio.Asignatura;
import dominio.Docente;
import dominio.Estudiante;
import dominio.Nota;

import java.util.Arrays;

public class appu {
    public static void main(String[] args) {
        Estudiante helmer= new Estudiante("1193090526","Helmer Alexander Patiño",6);
        Docente profe =new Docente("2345234","Alejandro");
        Asignatura materia = new Asignatura("POO", profe);

        Nota helmernota = new Nota(materia);
        helmernota.setParcial(3.5);
        helmernota.setNfinal(3.0);
        helmernota.setSeguimiento(Arrays.asList(3.0,2d,5.0,3.5));
        helmer.setNota(helmernota);

        Estudiante juan = new Estudiante("3232423","Juan david",5);
        Nota juannota = new Nota(materia);
        juannota.setParcial(3.5);
        juannota.setNfinal(2.0);
        juannota.setSeguimiento(Arrays.asList(3.0,2d,5.0,2.5));
        juan.setNota(juannota);

        materia.getEstudiantes().add(helmer);
        materia.getEstudiantes().add(juan);
         calcularDefinitivadelcurso(materia);
    }
    private static void calcularDefinitivadelcurso(Asignatura curso){
        for (Estudiante estudiante: curso.getEstudiantes()){
            double definitiva = estudiante.getNota().calcularDefinitiva();
            if (definitiva < 3.0){
                System.out.println(estudiante.getNombre()+" perdio "+ curso.getNombre()+ "por que sacó"+definitiva);
            }else {
                System.out.println(estudiante.getNombre()+" ganó "+ curso.getNombre()+ "por que sacó"+definitiva);

            }
        }
    }
}

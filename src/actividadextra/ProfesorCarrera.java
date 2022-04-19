/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase heredada de Profesor
 * @author Duque Rafael
 */
public class ProfesorCarrera extends Profesor{
    private int numAsignatura;
    private int grupos;
    
    /**
     * Constructor vacío
     */
    public ProfesorCarrera() {
    }
    
    /**
     * Constructor inicializado
     * @param numAsignatura
     * @param grupos 
     */
    public ProfesorCarrera(int numAsignatura, int grupos) {
        this.numAsignatura = numAsignatura;
        this.grupos = grupos;
    }
    
    /**
     * Métodos abstractos implementados de Profesor Empleado y SerVivo
     * @return 
     */
    @Override
    public String reprobar() {
        return("Alumno calificación <=5 reprueba"); 
    }

    @Override
    public String pasarAlumnos() {
        return("Alumno calificación >=6 pasa"); 
    }

    @Override
    public String explicar() {
        return("Estoy explicando"); 
    }

    @Override
    public String aclararDudas() {
        return ("Cuál es su duda..?"); 
    }

    @Override
    public String respirar() {
        return ("Respirando"); 
    }

    public int getNumAsignatura() {
        return numAsignatura;
    }

    public void setNumAsignatura(int numAsignatura) {
        this.numAsignatura = numAsignatura;
    }

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }
    
    /**
     * Sobreescritura
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"ProfesorCarrera{" + '}';
    }
}

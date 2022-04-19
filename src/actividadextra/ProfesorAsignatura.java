/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase heredada de Profesor
 * @author Duque Rafael
 */
public class ProfesorAsignatura extends Profesor{
    private String nomAsignatura;
    
    /**
     * Constructor vacío
     */
    public ProfesorAsignatura() {
    }

    public ProfesorAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
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

    public String getNomAsignatura() {
        return nomAsignatura;
    }

    public void setNomAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }
    
    /**
     * Sobreescritura
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"ProfesorAsignatura{" + '}';
    }
}

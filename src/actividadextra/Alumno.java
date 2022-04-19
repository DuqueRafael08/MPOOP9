/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase heredada de Persona
 * @author Duque Rafael
 */
public class Alumno extends Persona{
    private String carrera;
    private int semestre;
    
     /**
     * Constructor vacío
     */
    public Alumno() {
    }
    
     /**
      * Constructor inicializado
      * @param carrera
      * @param semestre 
      */
    public Alumno(String carrera, int semestre) {
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    /**
     * Unico método heredado 
     * de SerVivo 
     * @return 
     */
    @Override
    public String respirar() {
        return ("Respirando");
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    /**
     * Métodos propios de la clase
     */
    public void aprender (){
        System.out.println("Estoy aprendiendo clases abstractas");
    }
    
    public void estudiar (){
        System.out.println("Estudio ingeniería");
    }
    
    public void darseDeBaja (){
        System.out.println("Si tengo calificación < 5 daré de baja la materia");
    }
    
    /**
     * Sobreescritura
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Alumno{" + '}';
    }
   
}

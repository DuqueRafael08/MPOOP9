/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase abstracta heredada de Empleado
 * @author Duque Rafael
 */
public abstract class Profesor extends Empleado{
    int numAlumnos;
    
    /**
     * métodos abstractos sin funcionalidad
     * @return 
     */
    public abstract String reprobar();
    public abstract String pasarAlumnos();
    public abstract String explicar();

    /**
     * Sobreescritura
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Profesor{" + '}';
    }
    
    
}

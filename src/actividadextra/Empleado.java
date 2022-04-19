/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase abstracta heredada de Persona
 * @author Duque Rafael
 */
public abstract class Empleado extends Persona{
    float salario;
    int horaEntrada, horaSalida;
   
    /**
     * Unico método abstracto sin funcionalidad
     * @return 
     */
    public abstract String aclararDudas();
    
    /**
     * Sobreescritura
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Empleado{" + '}';
    }
  
}

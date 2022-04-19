/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 * superClase abstracta
 * @author Duque Rafael
 */
public abstract class SerVivo {
    int edad;
    String nombre;
    
    /**
     * Método abstracto sin funcionalidad
     * @return 
     */
    public abstract String respirar();

    @Override
    public String toString() {
        return "SerVivo{" + '}';
    }
      
}



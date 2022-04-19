/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 * Clase abstracta Mascota
 * @author Duque Rafael
 */
public abstract class Mascota extends SerVivo{
    String color, raza, colorOjos;
    
    /**
     * Métodos abstractos sin funcionalidad
     * @return 
     */
    public abstract String jugar();
    public abstract String dormir();
    public abstract String saltar();

    @Override
    public String toString() {
        return super.toString()+"Mascota{" +'}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase abstracta heredada de Super clase
 * @author Duque Rafael
 */
public abstract class Persona extends SerVivo{
    Mascota mascota;
    
    /**
     * No hay Métodos abstractos
     * @return 
     */

    @Override
    public String toString() {
        return super.toString()+"Persona{" + '}';
    }
    
}

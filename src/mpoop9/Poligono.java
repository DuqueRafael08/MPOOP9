/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 *
 * @author Duque Rafael
 */
public abstract class Poligono {
    /**
     * métodos abstractos
     * sin funcionalidad
     * @return 
     */
    public abstract float area();
    public abstract float perimetro(); 

    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}

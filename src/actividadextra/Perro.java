/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 * Clase Perro que hereda de Mascota
 * @author Duque Rafael
 */
public class Perro extends Mascota{
    private boolean colaCortada;
    /**
     * Constructor vacío
     */
    public Perro() {
    }
    /**
     * Constructor inicializado con la variable
     * @param colaCortada 
     */
    public Perro(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }
    
    /**
     * Métodos abstractos 
     * @return 
     */
    @Override
    public String jugar() {
        return ("Estoy jugando");  
    }

    @Override
    public String dormir() {
        return ("ZZZzzzzZZZZ");  
    }
    @Override
    public String saltar() {
        return ("Estoy saltando");  
    }

    @Override
    public String respirar() {
        return ("Estoy respirando");  
    }

    public boolean isColaCortada() {
        return colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }
    
    /**
     * Métodos propios de la clase
     */
    public void correr (){
        System.out.println("CORRIENDO");
    }
    
    public void corretear (){
        System.out.println("Te estoy persiguiendo");
    }
    
     /**
     * Sobreescritura
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Perro{" + '}';
    }
    
}                                          

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;
/**
 *Clase que hereda de Mascota y de Ser vivo
 * @author Duque Rafael
 */
public class Gato extends Mascota{
    
    /**
     * Sin variables propias
     * constructor vacío
     */
    public Gato() {
    }
    
    /**
     * implementación de métodos abstractos de Mascota
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
    /**
     * Métodos propios de la clase
     */
    public void rasguñar() {
        System.out.println("Te estoy rasguñando"); 
    }
    
    public void trepar(){
        System.out.println("Estoy trepando");
    }
    
     /**
     * Sobreescritura
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Gato{" + '}';
    }         
}


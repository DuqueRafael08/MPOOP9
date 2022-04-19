/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase heredada de Empleado
 * @author Duque Rafael
 */
public class Mesero extends Empleado{
    private String restaurant, colorUniforme;
    private int numMesas;
    
    /**
     * Constructor vacío
     */
    public Mesero() {
    }
    
    /**
     * Constructor inicializado
     * @param restaurant
     * @param colorUniforme
     * @param numMesas 
     */
    public Mesero(String restaurant, String colorUniforme, int numMesas) {
        this.restaurant = restaurant;
        this.colorUniforme = colorUniforme;
        this.numMesas = numMesas;
    }
    
    /**
     * implementación de métodos abstractos de Empleado y SerVivo
     * @return 
     */
    @Override
    public String aclararDudas() {
        return("Cuál es su duda..?"); 
    }

    @Override
    public String respirar() {
        return("Respirando"); 
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getColorUniforme() {
        return colorUniforme;
    }

    public void setColorUniforme(String colorUniforme) {
        this.colorUniforme = colorUniforme;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }
  
    /**
     * Métodos propios de la clase
     */
    public void recibirPedidos(){
        System.out.println("Tomando su pedido");
    }
    
    public void darPedidos(){
        System.out.println("Entrego su pedido");
    }
    
    public void recibirPropina(){
        System.out.println("Gracias por la propina");
    }
    
    public void tomarUnDescanso(){
        System.out.println("Vuelvo en 10 minutos");
    }
    
    /**
     * Sobreescritura
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Mesero{" + '}';
    }
    
}

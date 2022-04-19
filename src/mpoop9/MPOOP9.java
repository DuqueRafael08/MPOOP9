/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop9;

import actividadextra.Alumno;
import actividadextra.Gato;
import actividadextra.Mesero;
import actividadextra.Perro;
import actividadextra.ProfesorAsignatura;
import actividadextra.ProfesorCarrera;

/**
 *
 * @author Duque Rafael
 */
public class MPOOP9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Poligono poligono = new Poligono(); NO SE PUEDEN INSTANCIAR CLASES ABSTRACTAS
         */
        Triangulo triangulo = new Triangulo();
        System.out.println(triangulo);
        
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        System.out.println(cuadrilatero);
        
        System.out.println("#####Actividad extra#####");
        
        Perro perro = new Perro ();
        System.out.println(perro);
        
        Gato gato = new Gato();
        System.out.println(gato);
        
        Alumno alumno = new Alumno();
        System.out.println(alumno);
        
        Mesero mesero = new Mesero();
        System.out.println(mesero);
        
        ProfesorCarrera profesorCarrera = new ProfesorCarrera();
        System.out.println(profesorCarrera);
        
        ProfesorAsignatura profesorAsignatura = new ProfesorAsignatura();
        System.out.println(profesorAsignatura);
        
        /**
         * 
        DUDA CLASE
        System.out.println(triangulo.getBase());// obtener la base
        Triangulo triangulo2 = triangulo;// apuntan al mismo objeto a la misma dirección de memoria
        System.out.println(triangulo2.getBase());
        triangulo2.setBase(9); // modificando la base de la variable que creamos
        System.out.println(triangulo2.getBase());// obtener base
        System.out.println(triangulo.getBase());// como los dos apuntan al mismo lugar(dirección) también se cambia su valor 
        */
    }
    
}


package Ejercicio1;

import Ejercicio1.Entidades.Persona;
import Ejercicio1.Servicio.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        
        try {
            PersonaServicio ps = new PersonaServicio();
        
        Persona p = null;
        
        ps.mayordeEdad(p);
            
        } catch (Exception e) {
            System.out.println("El objeto esa vacio");
        }
        
        
    }
    
}

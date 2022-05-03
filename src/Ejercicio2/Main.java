
package Ejercicio2;



import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Main {

    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");

       
     
        try {
            int [] arreglo = new int [2];
            arreglo [2] = 8;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El indice no corresponde");
        }
     
      
     
        
    }
    
}

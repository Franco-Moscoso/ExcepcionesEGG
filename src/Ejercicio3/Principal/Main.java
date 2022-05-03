
package Ejercicio3.Principal;

import Ejercicio3.Entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
       try{ 
        System.out.println("Ingrese un numero");
        String num = leer.next();
        
        System.out.println("Ingrese otro numero");
        String num2 = leer.next();
        
        DivisionNumero d = new DivisionNumero();
        
        d.setCadena(num);
        d.setCadena2(num2);

        int xd = Integer.parseInt(d.getCadena());
        int guille = Integer.parseInt(d.getCadena2());
        
        int division = xd / guille;
        
       }catch(NumberFormatException e){
           System.out.println("No se puede convertir a entero");
           
       }catch(InputMismatchException e){
           System.out.println("Error");
           
       }catch(ArithmeticException e){
           System.out.println("No se puede divir por cero");
       }
    }
    
}

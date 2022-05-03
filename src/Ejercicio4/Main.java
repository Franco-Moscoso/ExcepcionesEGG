package Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        boolean correcto = false;

        int numeroMisterioso = (int) (Math.random() * 100);
        int intentos = 0;
        Integer numero;

        try {
            pedirNumeros();

        } catch (Exception e) {
            System.out.println("Se debe ingresar numeros");
            e.printStackTrace();
        }
    }

    public static void pedirNumeros() throws Exception {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int intentos = 0;
        
        int numeroMisterioso = (int) (Math.random() * 100);
        
        boolean correcto = false;
        
       
        int numero;
        do {
            System.out.println("Introduzca un numero de 1-500");
            numero = leer.nextInt();

            if (numeroMisterioso > numero) {
                System.out.println("El numero es mayor");
            }

            if (numeroMisterioso < numero) {
                System.out.println("El numero es menor");
            }
            intentos++;

            if (numeroMisterioso == numero) {
                correcto = true;
                System.out.println("Era hora! terminaste en: " + intentos + " intentos");
            }
        } while (!correcto);
    }
}

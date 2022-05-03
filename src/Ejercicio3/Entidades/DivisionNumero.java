
package Ejercicio3.Entidades;

/**
 *
 * @author franc
 */
public class DivisionNumero {
    private String cadena;
    private String cadena2;

    public DivisionNumero(String cadena, String cadena2) {
        this.cadena = cadena;
        this.cadena2 = cadena2;
    }

    public DivisionNumero() {
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena2() {
        return cadena2;
    }

    public void setCadena2(String cadena2) {
        this.cadena2 = cadena2;
    }

    @Override
    public String toString() {
        return "DivisionNumero{" + "cadena=" + cadena + ", cadena2=" + cadena2 + '}';
    }
    
    
}

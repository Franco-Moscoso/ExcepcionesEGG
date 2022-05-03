
package Ejercicio1.Entidades;



/**
 *
 * @author franc
 */
public class Persona {
    
    
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, double altura, double peso, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", sexo=" + sexo + '}';
    }
    
    
    
       
}

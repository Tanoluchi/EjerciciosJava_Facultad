import java.util.*;
/**
 * Clase Alumno toma las notas de un alumno, evalua si aprobo, calcula y muestra su promedio.
 * @author Valenzuela Luciano
 */
public class Alumno extends Persona{
    private int lu;
    private double nota1;
    private double nota2;
    /**
     * Constructor
     * @param int dni, int LU, String nombre, String apellido, int anioNacimiento
     */
    public Alumno(int p_dni, int p_lu, String p_nombre, String p_apellido, int anioNacimiento){
        super(p_dni, p_nombre, p_apellido, anioNacimiento);
        setLU(p_lu);
        nota1 = 0;
        nota2 = 0;
    }
    /**
     * Setters
     */
    private void setLU(int p_lu){
        this.lu = p_lu;
    }
    public void setNota1(double p_nota1){
        this.nota1 = p_nota1;
    }
    public void setNota2(double p_nota2){
        this.nota2 = p_nota2;
    }
    /**
     * Getters
     */
    public int getLU(){
        return this.lu;
    }
    public double getNota1(){
        return this.nota1;
    }
    public double getNota2(){
        return this.nota2;
    }
    /**
     * Se realiza una verificacion, si las dos notas del alumno es igual o mayor a 6 se supone que el alumno aprobo.
     * @return True (si el alumno aprobo), False caso contrario.
     */
    private boolean aprueba(){
        if ((getNota1() >= 6) && (getNota2() >= 6)) {
            return true;    
        }
        return false;
    }
    /**
     * Se verifica si el alumno aprobo o no, dependiendo eso se retorna un String con su estado.
     * @return String que contiene aprobado o desaprobado.
     */
    private String leyendaAprueba(){
        if (aprueba()) {
            return "APROBADO";
        }
        return "DESAPROBADO";
    }
    /**
     * Se calcula el promedio del alumno.
     * @return promedio
     */
    public double promedio(){
        return (getNota1() + getNota2()) / 2;
    }
    /**
     * @return nombre y apellido
     */
    public String nomYApe(){
        return (getNombre() + " " + getApellido());
    }
    /**
     * @return apellido y nombre
     */
    public String apeYNom(){
        return (getApellido() + " " + getNombre());
    }
    /**
     * Realiza una especializacion, manda un mensaje al metodo mostrar de la clase padre y luego imprime los datos del alumno.
     */
    public void mostrar(){
        //System.out.println("Nombre y Apellido: " + nomYApe());
        super.mostrar();
        System.out.println("LU: " + getLU() + "\tNotas: " + getNota1() + " - " + getNota2());
        System.out.println("Promedio: " + promedio() + " - " + leyendaAprueba());
    }
}
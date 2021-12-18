import java.util.*;
/**
 * Clase Persona muestra los datos prinpales de una persona: DNI, nombre, apellido y año de nacimiento.
 * @author Valenzuela Luciano
 */
// Clase que define un conjunto de objetos que comparten caracteristicas en común.
public class Persona { 
    // Atributos: Caracteristicas del Objeto.
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    /**
     * Constructor sobrecargado - Inicializa el objeto
     * @param int dni, String nombre, String apellido, int anioNacimiento
     */
    public Persona (int p_dni, String p_nombre, String p_apellido, int p_anio){
        setDNI(p_dni);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setFechaNacimiento(new GregorianCalendar());
        setAnioNacimiento(p_anio);
    }
    /**
     * Constructor
     * @param int dni, String nombre, String apellido, Calendar fechaNacimiento
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fechaNacimiento){
        setDNI(p_dni);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setFechaNacimiento(p_fechaNacimiento);
        setAnioNacimiento(this.getFechaNacimiento().get(Calendar.YEAR));
    }
    /**
     * Setters
     */
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setAnioNacimiento(int p_anio){
        this.fechaNacimiento.set(Calendar.YEAR, p_anio);
    }
    private void setFechaNacimiento(Calendar p_fechaNacimiento){
        this.fechaNacimiento = p_fechaNacimiento;
    }
    /**
     * Getters
     */
    public int getDNI(){
        return this.nroDni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getAnioNacimiento(){
        return this.fechaNacimiento.get(Calendar.YEAR);
    }
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    /**
     * Método que obtiene la fecha actual y calcula la edad.
     * @return edad de la persona
     */ 
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        if(this.getAnioNacimiento() != 0){
            int anioHoy = fechaHoy.get(Calendar.YEAR);
            return (anioHoy - getAnioNacimiento());
        }else{
            int anioHoy = fechaHoy.get(Calendar.YEAR);
            return anioHoy - getFechaNacimiento().get(Calendar.YEAR);
        }
    }
    /**
     * @return nombre y apellido
     */
    public String nomYApe(){
        return (this.getNombre() + " " + getApellido()); 
    }
    /**
     * return apellido y nombre
     */
    public String apeYNom(){
        return (getApellido() + getNombre()); 
    }
    /**
     * Realiza una verificacion con el mes actual y el mes en cual nacio la persona, si coinciden es su cumpleaños.
     * @return true(si es su cumpleaños), false(si no es su cumpleaños)
     */
    public boolean esCumpleaños(){
        Calendar fechaHoy = new GregorianCalendar();
        if((this.getFechaNacimiento().get(Calendar.MONTH) == (fechaHoy.get(Calendar.MONTH)))){
            return true;
        }else{
            return false;
        }
    }
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("DNI: " + getDNI() + "\tEdad: " + edad());
    }
}
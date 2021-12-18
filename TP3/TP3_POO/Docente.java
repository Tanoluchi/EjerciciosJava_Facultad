
/**
 * Clase Docente asigna las caracteristicas de un docente y calcula su sueldo.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class Docente
{
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;
    
    /**
     * Constructor
     * @param String nombre, String grado, double sueldoBasico, double asignacionFamiliar
     */
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asigFamiliar){
        setNombre(p_nombre);
        setGrado(p_grado);
        setSueldoBasico(p_sueldoBasico);
        setAsigFamiliar(p_asigFamiliar);
    }
    /**
     * Setters
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setGrado(String p_grado){
        this.grado = p_grado;
    }
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    private void setAsigFamiliar(double p_asigFamiliar){
        this.asignacionFamiliar = p_asigFamiliar;
    }
    /**
     * Getters
     */
    public String getNombre(){
        return this.nombre;
    }
    public String getGrado(){
        return this.grado;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    public double getAsigFamiliar(){
        return this.asignacionFamiliar;
    }
    /**
     * Calcula el sueldo sumando su sueldo basico y su asignacion familiar.
     * @return Devuelve el sueldo del docente.
     */
    public double calcularSueldo(){
        return (this.getSueldoBasico() + this.getAsigFamiliar());
    }
}

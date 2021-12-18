import java.util.*;

/**
 * Clase Cargo retorna la antiguedad del cargo, calcula el adicional por antiguedad, calcula el sueldo definitivo del cargo y muestra por pantalla
 * la informacion del cargo.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Cargo
{
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;
    /**
     * Constructor
     * @param String nombreCargo, double sueldoBasico, int anioIngreso, int horasDocencia
     */
    public Cargo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDocencia){
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
        this.setHorasDeDocencia(p_horasDocencia);
    }
    /**
     * Setters
     */
    private void setNombreCargo(String p_nombreCargo){
        this.nombreCargo = p_nombreCargo;
    }
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    private void setAnioIngreso(int p_anioIngreso){
        this.anioIngreso = p_anioIngreso;
    }
    private void setHorasDeDocencia(int p_horasDocencia){
        this.horasDeDocencia = p_horasDocencia;    
    } 
    /**
     * Getters
     */
    public String getNombreCargo(){
        return this.nombreCargo;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    public int getHorasDocencia(){
        return this.horasDeDocencia;
    }
    /**
     * Calcula la antiguedad del cargo.
     * @return antiguedad
     */
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);

        return (anioHoy - this.getAnioIngreso());
    }
    /**
     * Calcula el adicional por la antiguedad del cargo.
     * @return adicional por antiguedad
     */
    private double adicionalXAntiguedad(){
        return ((1 * this.getSueldoBasico()) / 100) * this.antiguedad();
    }
    /**
     * Calcula el sueldo del cargo, suma el sueldo basico mas el adicional por antiguedad
     * @return sueldo del cargo
     */
    public double sueldoDelCargo(){
        return this.getSueldoBasico() + this.adicionalXAntiguedad();
    }
    public void mostrarCargo(){
        //JTP-Programación OO - Sueldo Basico: 800.0 - Sueldo Cargo: 904.0 – Antiguedad: 10 años
        //Horas Docencia: 10
        System.out.println(this.getNombreCargo() + " - Sueldo Basico: " + this.getSueldoBasico() + " - Sueldo Cargo: " + this.sueldoDelCargo() + " - Antiguedad: " + this.antiguedad());
        System.out.println("Horas Docencia: " + this.getHorasDocencia());
    }
}

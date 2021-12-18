import java.util.*;
/**
 * Clase EmpleadoConJefe calcula el sueldo neto, calcula sus años de antiguedad y imprime por pantalla los datos del empleado y a quien responde (jefe)
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class EmpleadoConJefe
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;
    /**
     * Constructor sobrecargado
     * @param long cuil, String apellido, String nombre, double importe, Calendar fecha, EmpleadoConJefe jefe
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_fecha.get(Calendar.YEAR));
        this.setJefe(p_jefe);
    }
    /**
     * Constructor sobrecargado
     * @param long cuil, String apellido, String nombre, double importe, Calendar fecha
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_fecha.get(Calendar.YEAR));
        this.setJefe(null);
    }
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
        this.setJefe(null);
    }
    /**
     * Setters
     */
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;        
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }
    private void setAnioIngreso(int p_anio){
        this.fechaIngreso = new GregorianCalendar();
        this.fechaIngreso.set(Calendar.YEAR, p_anio);
    }
    private void setJefe(EmpleadoConJefe p_jefe){
        this.jefe = p_jefe;
    }
    /**
     * Getters
     */
    public long getCuil(){
        return this.cuil;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    public int getAnioIngreso(){
        return this.fechaIngreso.get(Calendar.YEAR);
    }
    public EmpleadoConJefe getJefe(){
        return this.jefe;
    }
    /**
     * Calcula los años de antiguedad de un empleado, trae la fecha actual y resta el año actual con el año de ingreso.
     * @return años de antiguedad de un empleado
     */
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);

        return (anioHoy - this.getAnioIngreso());
    }
    /**
     * Calcula el descuento, que corresponde al %2 del sueldo basico mas $12 del seguro de vida.
     * @return Devuelve el descuento
     */
    private double descuento(){
        return ((2 * this.getSueldoBasico()) / 100) + 12;
    }
    /**
     * Realiza una verificacion y de acuerdo a los años de antiguedad calcula el adicional.
     * @return Devuelve el adicional
     */
    private double adicional(){
        if((this.antiguedad() >= 2) && (antiguedad() < 10) ){
            return (4 * this.getSueldoBasico()) / 100;
        }
        else if(this.antiguedad() >= 10){
            return (6 * this.getSueldoBasico()) / 100;
        }
        else{
            return (2 * this.getSueldoBasico()) / 100;
        }
    }
    /**
     * Suma el sueldo basico mas el adicional y resta el descuento para obtener el sueldo neto.
     * @return Devuelve el sueldo neto
     */
    public double sueldoNeto(){
        return (this.getSueldoBasico() + this.adicional()) - this.descuento();
    }
    /**
     * @return nombre y apellido
     */
    public String nomYApe(){
        return this.getNombre() + ", " + this.getApellido();
    }
    /**
     * @return apellido y nombre
     */
    public String apeYNom(){
        return this.getApellido() + ", " + this.getNombre();        
    }
    /**
     * Muestra los datos principales de un empleado y verifica si tiene algun jefe, si es así imprime por pantalla el apellido y el nombre del jefe,
     * caso contrario solamente imprime GERENTE GENERAL
     */
    public void mostrarPantalla(){
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("CUIL: " + this.getCuil() + " " + "Antiguedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: " + "$ " + this.sueldoNeto());
        if(this.getJefe() != null){
            System.out.println("Responde a: " + this.getJefe().apeYNom() + " / " + " GERENTE GENERAL ");
        }else{
            System.out.println("Responde a: GERENTE GENERAL");
        }
    }
    public String mostrarLinea(){
        return (this.getCuil() + "\t" + this.apeYNom() + "\t" + this.sueldoNeto());
    }
}

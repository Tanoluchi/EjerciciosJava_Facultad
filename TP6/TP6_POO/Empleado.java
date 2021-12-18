import java.util.*;
/**
 * Clase Empleado toma el sueldo basico de un empleado, calcula su sueldo neto, por otro lado también
 * calcula sus años de antiguedad en la empresa y realiza una verificacion para saber si es su aniversario. 
 * 
 * @author Valenzuela Luciano
 */
public class Empleado extends Persona{
    private long cuil;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    /**
     * Constructor sobrecargado
     * @param long cuil, String apellido, String nombre, double importe, int anio
     */
    public Empleado(long p_cuil, int p_nroDni, String p_apellido, String p_nombre, double p_importe, int p_anioIngreso, int p_anioNacimiento){
        super(p_nroDni, p_apellido, p_nombre, p_anioNacimiento);
        setCuil(p_cuil);
        setSueldo(p_importe);
        setFechaIngreso(new GregorianCalendar());
        setAnio(p_anioIngreso);
    }
    /**
     * Constructor sobrecargado
     * @param long cuil, String nombre, String apellido, double importe, Calendar fecha
     */
    public Empleado(long p_cuil, int p_nroDni, String p_nombre, String p_apellido, double p_importe, int p_anioNacimiento, Calendar p_fecha){
        super(p_nroDni, p_apellido, p_nombre, p_anioNacimiento);
        setCuil(p_cuil);
        setSueldo(p_importe);
        setFechaIngreso(p_fecha);
        setAnio(this.getFechaIngreso().get(Calendar.YEAR));
    }
    /**
     * Setters
     */
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    private void setSueldo(double p_importe){
        this.sueldoBasico = p_importe;
    }
    private void setAnio(int p_anio){
        this.fechaIngreso = new GregorianCalendar();
        this.fechaIngreso.set(Calendar.YEAR, p_anio);
    }
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso = p_fecha;
    }
    /**
     * Getters
     */
    public long getCuil(){
        return this.cuil;
    }
    public double getSueldo(){
        return this.sueldoBasico;
    }
    public int getAnioIngreso(){
        return this.fechaIngreso.get(Calendar.YEAR);
    }
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    /**
     * Calcula los años de antiguedad de un empleado, resta el año actual con el año de ingreso a la empresa del empleado.
     * @return años de antiguedad del empleado
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
        return ((2 * this.getSueldo()) / 100) + 12;
    }
    /**
     * Realiza una verificacion y de acuerdo a los años de antiguedad calcula el adicional.
     * @return Devuelve el adicional
     */
    private double adicional(){
        if((this.antiguedad() >= 2) && (antiguedad() < 10) ){
            return (4 * getSueldo()) / 100;
        }
        else if(this.antiguedad() >= 10){
            return (6 * getSueldo()) / 100;
        }
        else{
            return (2 * getSueldo()) / 100;
        }
    }
    /**
     * Suma el sueldo basico mas el adicional y resta el descuento para obtener el sueldo neto.
     * @return Devuelve el sueldo neto
     */
    public double sueldoNeto(){
        return (this.getSueldo() + this.adicional()) - this.descuento();
    }
    /**
     * @return apellido y nombre
     */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    /**
     * @return nombre y apellido
     */
    public String nomYApe(){
        return this.getNombre() + ", " + this.getApellido();
    }
    public void mostrarLinea(){
        System.out.println(this.getCuil() + "\t" + this.apeYNom() + "\t" + this.sueldoNeto());
    }
    /**
     * Realiza una especializacion, manda un mensaje al metodo mostrar de la clase padre y luego imprime los datos del empleado.
     */
    public void mostrar(){
        /*
         * Nombre y Apellido: Dario Perez 
            DNI: 13549867 Edad: 26 años
            CUIL: 27135498678 Antigüedad: 11 años de servicio
            Sueldo Neto: $ 1236.0
         */
        super.mostrar();
        System.out.println("CUIL: " + this.getCuil() + " " + "Antigüedad: " + this.antiguedad());
        System.out.println("Sueldo Neto: " + this.sueldoNeto());
    }
    /**
     * Realiza una verificacion, mientras que el año de ingreso no sea al actual (no tiene más de un año) y el mes y el día coinciden con la fecha actual
     * entonces devuelve true (Es su aniversario), caso contrario devuelve false.
     * @return true o false
     */
    public boolean esAniversario(){
        Calendar fechaHoy = new GregorianCalendar();
        if(this.getAnioIngreso() != fechaHoy.get(Calendar.YEAR)){
            if(this.getFechaIngreso().get(Calendar.MONTH) == fechaHoy.get(Calendar.MONTH) & this.getFechaIngreso().get(Calendar.DATE) == fechaHoy.get(Calendar.DATE)){
                return true; 
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
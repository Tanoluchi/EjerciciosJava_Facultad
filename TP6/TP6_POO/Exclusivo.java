
/**
 * Clase Exclusivo muestra por pantalla la informacion del cargo exclusivo.
 * 
 * @author Valenzuela Luciano Juan Ignacio 
 */
public class Exclusivo extends Cargo
{
    private int horasDeInvestigacion;
    private int horasDeExtension;
    /**
     * Constructor
     * @param String nombreCargo, double sueldoBasico, int anioIngreso, int horasDocencia, int horasDeInvestigacion, int horasDeExtension
     */
    public Exclusivo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDocencia, int p_horasDeInvestigacion, int p_horasDeExtension){
        super(p_nombreCargo, p_sueldoBasico, p_anioIngreso, p_horasDocencia);
        this.setHorasInvestigacion(p_horasDeInvestigacion);
        this.setHorasExtension(p_horasDeExtension);
    }
    /**
     * Setters
     */
    private void setHorasInvestigacion(int p_horasDeInvestigacion){
        this.horasDeInvestigacion = p_horasDeInvestigacion;
    }
    private void setHorasExtension(int p_horasDeExtension){
        this.horasDeExtension = p_horasDeExtension;
    }
    /**
     * Getters
     */
    public int getHorasInvestigacion(){
        return this.horasDeInvestigacion;
    }
    public int getHorasExtension(){
        return this.horasDeExtension;
    }
    /**
     * Realiza una especializacion, manda un mensaje al metodo mostrarCargo a la clase padre y luego muestra por pantalla la informacion del cargo
     * de caracter exclusivo
     */
    public void mostrarCargo(){
        //----Cargo de caracter Exclusivo----
        //Horas investigación: 10
        //Horas extension: 30
        super.mostrarCargo();
        System.out.println("----Cargo de caracter Exclusivo----");
        System.out.println("Horas investigación: " + this.getHorasInvestigacion());
        System.out.println("Horas extension: " + this.getHorasExtension());
    }
}

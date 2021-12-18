
/**
 * Clase SemiExclusivo muestra por pantalla la informacion del cargo semi exclusivo
 * 
 * @author Valenzuela Luciano Juan Ignacio 
 */
public class SemiExclusivo extends Cargo
{
    private int horasDeInvestigacion;
    /**
     * Constructor
     * @param String nombreCargo, double sueldoBasico, int anioIngreso, int horasDocencia, int horasDeInvestigacion
     */
    public SemiExclusivo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDocencia, int p_horasDeInvestigacion){
        super(p_nombreCargo, p_sueldoBasico, p_anioIngreso, p_horasDocencia);
        this.setHorasInvestigacion(p_horasDeInvestigacion);
    }
    /**
     * Setters
     */
    private void setHorasInvestigacion(int p_horasDeInvestigacion){
        this.horasDeInvestigacion = p_horasDeInvestigacion;
    }
    /**
     * Getters
     */
    public int getHorasInvestigacion(){
        return this.horasDeInvestigacion;
    }
    /**
     * Realiza una especializacion, manda un mensaje al metodo mostrarCargo de la clase padre y luego muestra por pantalla la informacion del cargo
     * semi exclusivo
     */
    public void mostrarCargo(){
        //----Cargo de caracter SemiExclusivo----
        //Horas investigación: 10
        super.mostrarCargo();
        System.out.println("----Cargo de caracter SemiExclusivo----");
        System.out.println("Horas investigación: " + this.getHorasInvestigacion());
    }
}

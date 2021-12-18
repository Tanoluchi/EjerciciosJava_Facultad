
/**
 * Clase Paciente muestra por pantalla los datos principales de un paciente.
 * 
 * @author Valenzuela Luciano 
 * @version 9/2021
 */
public class Paciente
{
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    /**
     * Constructor
     * @param int historiaClinica, String nombre, String domicilio, Localidad localidadNacido, Localidad localidadVive
     */
    public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
        setHistoria(p_historia);
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setNacido(p_localidadNacido);
        setVive(p_localidadVive);
    }
    /**
     * Setters
     */
    private void setHistoria(int p_historia){
        this.historiaClinica = p_historia;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setNacido(Localidad p_localidadNacido){
        this.localidadNacido = p_localidadNacido;
    }
    private void setVive(Localidad p_localidadVive){
        this.localidadVive = p_localidadVive;
    }
    /**
     * Getters
     */
    public int getHistoria(){
        return this.historiaClinica;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    public Localidad getNacido(){
        return this.localidadNacido;
    }
    public Localidad getVive(){
        return this.localidadVive;
    }
    
    public void mostrarDatosPantalla(){
         System.out.println("Paciente: " + this.getNombre() + "\tHistoria Clinica: " + this.getHistoria() + "\tDomicilio: " + this.getDomicilio());
         System.out.println("Localidad: " + this.getVive().getNombre() + "\tProvincia: " + this.getVive().getProvincia());
    }
    /**
     * @return una cadena de datos del paciente
     */
    public String cadenaDeDatos(){
        // Juan Manuel Ortigoza …… 57869 ..… Bulevar 3 de Abril - Monte Caseros – Corrientes
        return (this.getNombre() + " .... " + this.getHistoria() + " .... " + this.getDomicilio() + " - " + this.getVive().getNombre() + " - " + this.getVive().getProvincia());
    }
}


/**
 * Clase Localidad devuelve el nombre de la localidad y la provincia donde vive o nacio un paciente.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class Localidad
{
    private String nombre;
    private String provincia;
    /**
     * Constructor
     * @param String nombre, String provincia
     */
    public Localidad(String p_nombre, String p_provincia){
        setNombre(p_nombre);
        setProvincia(p_provincia);
    }
    /**
     * Setters
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    /**
     * Getters
     */
    public String getNombre(){
        return this.nombre;
    }
    public String getProvincia(){
        return this.provincia;
    }
    /**
     * @return Devuelve una cadena con el nombre de la localidad y la provincia.
     */
    public String mostrar(){
        return ("Localidad: " + this.getNombre() + "\tProvincia: " + this.getProvincia());
    }
}

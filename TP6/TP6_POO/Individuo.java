import java.util.*;

/**
 * Clase Individuo devuelve el precio de la entrada de un individuo, lista por fecha, muestra los datos del individuo y retorna el tipo de visitante.
 * 
 * @author Valenzuela Luciano Juan Ignacio 
 */
public class Individuo extends Visitante
{
    private Persona persona;
    /**
     * Constructor
     * @param String nombre, Calendar fechaVisita, Persona persona
     */
    public Individuo(String p_nombre, Calendar p_fechaVisita, Persona p_persona){
        super(p_nombre, p_fechaVisita);
        this.setPersona(p_persona);
    }
    /**
     * Setters
     */
    private void setPersona(Persona p_persona){
        this.persona = p_persona;
    }
    /**
     * Getters
     */
    public Persona getPersona(){
        return this.persona;
    }
    /**
     * @return precio de entrada
     */
    public double entrada(){
        return 10;
    }
    public void mostrar(){
        /*Nombre y Apellido: María Perez
            DNI: 14528796 Edad: 56 años
         * 
         */
        System.out.println("Nombre y Apellido: " + this.getPersona().nomYApe());
        System.out.println("DNI: " + this.getPersona().getDNI() + " - Edad: " + this.getPersona().edad());
        System.out.println("-------------------------------------------------------------");
    }
     /**
    * Realizamos una verificacion, si el tipo de visitante pasado por parametro es igual al String (individuo) y si la fecha de visita es igual
    * al pasado por parametro mandamos un mensaje al metodo mostrar
    * @param Calendar fecha, String visitante
    */
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if(this.tipoVisitante().equals(p_visitante.toLowerCase()) && super.getFechaVisita().equals(p_fecha)){
            this.mostrar();
        }
    }
    /**
     * @return tipo de visitante
     */
    public String tipoVisitante(){
        return "individuo";
    }
}

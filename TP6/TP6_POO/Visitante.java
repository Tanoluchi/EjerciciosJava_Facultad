import java.util.*;

/**
 * Clase Visitante devuelve el nombre del visitante o nombre de Delegacion y devuelve fecha de visita
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public abstract class Visitante
{
    private String nombre;
    private Calendar fechaVisita;
    /**
     * Constructor
     * @param String nombre, Calendar fechaVisita
     */
    public Visitante(String p_nombre, Calendar p_fechaVisita){
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fechaVisita);
    }
    /**
     * Setters
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setFechaVisita(Calendar p_fechaVisita){
        this.fechaVisita = p_fechaVisita;
    }
    /**
     * Getters
     */
    public String getNombre(){
        return this.nombre;
    }
    public Calendar getFechaVisita(){
        return this.fechaVisita;
    }
    public abstract void mostrar();
    public abstract double entrada();
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);
    public abstract String tipoVisitante();
}

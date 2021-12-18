import java.util.*;
import java.time.*;

/**
 * Clase Zoologico agrega o quita un visitante, lista un tipo de visitante por fecha, lista los visitantes por fecha, calcula
 * la recaudacion entre el lapso de 2 fechas pasadas por parametro.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Zoologico
{
    private String nombre;
    private ArrayList<Visitante> visitantes;
    /**
     * Constructor sobrecargado
     * @param String nombre, ArrayList visitantes
     */
    public Zoologico(String p_nombre, ArrayList<Visitante> p_visitantes){
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitantes);
    }
    /**
     * Constructor
     * @param String nombre
     */
    public Zoologico(String p_nombre){
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<Visitante>());
    }
    /**
     * Setters
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setVisitantes(ArrayList<Visitante> p_visitantes){
        this.visitantes = p_visitantes;
    }
    /**
     * Getters
     */
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Visitante> getVisitantes(){
        return this.visitantes;
    }
    /**
     * Agrega un nuevo visitante a la coleccion
     * @param Visitante visitante
     */
    public void nuevoVisitante(Visitante p_visitante){
        this.getVisitantes().add(p_visitante);
    }
    /**
     * Quita un visitante de la coleccion
     * @param Visitante visitante
     */
    public void quitarVisitante(Visitante p_visitante){
        this.getVisitantes().remove(p_visitante);
    }
    /**
     * @param Calendar fecha, String tipoVisitante
     */
    public void listaTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante){
        for(Visitante v: this.getVisitantes()){
            v.listarPorFecha(p_fecha, p_tipoVisitante);
        }
    }
    /**
     * @param Calendar fecha
     */
    public void listaVisitantePorFecha(Calendar p_fecha){
        for(Visitante v: this.getVisitantes()){
            if(v.getFechaVisita().equals(p_fecha)){
                v.mostrar();
            }
        }
    }
    /**
     * Se crea una variable temporal que sera un acumulador, hacemos un bucle while donde se ejecutara mientras que la variable fechaDesde
     * no sobrepase a la variable fechaHasta, dentro haremos un foreach donde recorremos la coleccion visitantes, luego una verificacion
     * si fechaDesde es igual a la fecha de visita de un visitante entonces total acumulara el costo de la entrada de ese visitante.
     * @param Calendar fechaDesde, Calendar fechaHasta
     * @return recaudacion
     */
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta){
        double total = 0;
        while(!p_fechaDesde.after(p_fechaHasta)){
            for(Visitante v: this.getVisitantes()){
                if(p_fechaDesde.equals(v.getFechaVisita())){
                    total += v.entrada();
                }
            }
            p_fechaDesde.add(Calendar.DATE, 1);
        }
        return total;
    }
}

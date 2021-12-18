import java.util.*;

/**
 * Clase Hotel calcula el costo de habitaciones de un hotel, cuenta los hoteles que se alquilan y liquida.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Hotel extends Alojamiento
{
    private String tipoHabitacion;
    /**
     * Constructor sobrecargado
     * @param String nombre, double precio, int diasAlq, String tipoHabitacion
     */
    public Hotel(String p_nombre, double p_precio, int p_diasAlq, String p_tipoHabitacion){
        super(p_nombre, p_precio, p_diasAlq);
        this.setHabitacion(p_tipoHabitacion);
    }
    /**
     * Constructor
     * @param String nombre, double precio, int diasAlq, ArrayList servicios, String tipoHabitacion
     */
    public Hotel(String p_nombre, double p_precio, int p_diasAlq, ArrayList<Servicio> p_servicios, String p_tipoHabitacion){
        super(p_nombre, p_precio, p_diasAlq, p_servicios);
        this.setHabitacion(p_tipoHabitacion);
    }
    /**
     * Setters
     */
    private void setHabitacion(String p_tipoHabitacion){
        this.tipoHabitacion = p_tipoHabitacion;
    }
    /**
     * Getters
     */
    public String getHabitacion(){
        return this.tipoHabitacion;
    }
    /**
     * Calcula el costo de un hotel, dependiendo si el tipo de habitacion es single o doble
     * @return costo
     */
    public double costo(){
        if(this.getHabitacion().equals("Single") || this.getHabitacion().equals("single")){
            return super.costo() + (20 * super.getDiasAlquiler());
        }else{
            return super.costo() + (35 * super.getDiasAlquiler());
        }
    }
    /**
     * Creamos una variable booleana que sera igual al nombre del alojamiento en minusculas y mandamos un mensaje al metodo contains y le pasamos
     * el string hotel. Luego hacemos una verificion, si contiene es true entonces devolvera 1 (Significa que encontro un alojamiento con el nombre
     * de hotel), si es false devolvera 0.
     * @param String alojamiento
     * return 1 o 0
     */
    public int contar(String p_alojamiento){
        boolean contiene = p_alojamiento.toLowerCase().contains("hotel");
        if(contiene){
            return 1;
        }
        else{
            return 0;   
        }
    }
    public void liquidar(){
        /*
         * Habitacion Single 
           Total: ------> $735.0
         */
        super.liquidar();
        System.out.println("Habitacion " + this.getHabitacion());
        System.out.println("Total: ------> $" + (this.costo() + super.costoServicios()));
    }
}

import java.util.*;

/**
 * Clase Cabaña calcula el costo de una cabaña y cuenta las cabañas y liquida
 * 
 * @author Valenzuela Luciano Juan Ignacio 
 */
public class Cabaña extends Alojamiento
{
    private int nroHabitaciones;
    /**
     * Constructor sobrecargado
     * @param String nombre, double precio, int diasAlq, int nroHabitaciones
     */
    public Cabaña(String p_nombre, double p_precio, int p_diasAlq, int p_nroHabitaciones){
        super(p_nombre, p_precio, p_diasAlq);
        this.setHabitaciones(p_nroHabitaciones);
    }
    /**
     * Constructor
     * @param String nombre, double precio, int diasAlq, ArrayList servicios, int nroHabitaciones
     */
    public Cabaña(String p_nombre, double p_precio, int p_diasAlq, ArrayList<Servicio> p_servicios, int p_nroHabitaciones){
        super(p_nombre, p_precio, p_diasAlq, p_servicios);
        this.setHabitaciones(p_nroHabitaciones);
    }
    /**
     * Setters
     */
    private void setHabitaciones(int p_nroHabitaciones){
        this.nroHabitaciones = p_nroHabitaciones;
    }
    /**
     * Getters
     */
    public int getHabitaciones(){
        return this.nroHabitaciones;
    }
    /**
     * Calcula el costo de una cabaña, suma el costo de un alojamiento (envia un mensaje al metodo costo de la clase padre) suma el adicional
     * y luego multiplica por la cantidad de dias de alquiler.
     * @return costo adicional
     */
    public double costo(){
        double adicional = (30 * this.getHabitaciones());
        return super.costo() + (adicional * super.getDiasAlquiler());
    }
    /**
     * Creamos una variable booleana que sera igual al nombre del alojamiento en minusculas y mandamos un mensaje al metodo contains y le pasamos
     * el string cabaña. Luego hacemos una verificion, si contiene es true entonces devolvera 1 (Significa que encontro un alojamiento con el nombre
     * de cabaña), si es false devolvera 0.
     * @param String alojamiento
     * return 1 o 0
     */
    public int contar(String p_alojamiento){
        boolean contiene = p_alojamiento.toLowerCase().contains("cabaña");
        if(contiene){
            return 1;
        }
        else{
            return 0;        
        }
    }
    public void liquidar(){
        /*
         * Cabaña con 3 habitaciones 
            Total: ------> $1170.0
         */
        super.liquidar();
        System.out.println("Cabaña con " + this.getHabitaciones() + " habitaciones");
        System.out.println("Total: ------> $" + (this.costo() + super.costoServicios()));
    }
}

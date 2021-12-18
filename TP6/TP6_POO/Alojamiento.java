import java.util.*;

/**
 * Clase Alojamiento agrega o quita servicios, calcula el costo de alojamiento, lista los servicios, calcula el precio total de los servicios y muestra
 * por pantallala liquidacion de cada alojamiento.
 * 
 * @author Valenzuela Luciano Juan Ignacio 
 */
public abstract class Alojamiento
{
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicios;
    /**
     * Constructor sobrecargado
     * @param String nombre, double precio, int diasAlq
     */
    public Alojamiento(String p_nombre, double p_precio, int p_diasAlq){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precio);
        this.setDiasAlq(p_diasAlq);
        this.setServicios(new ArrayList<Servicio>());
    }
    /**
     * Constructor
     * @param String nombre, double precio, int diasAlq, ArrayList servicios
     */
    public Alojamiento(String p_nombre, double p_precio, int p_diasAlq, ArrayList<Servicio> p_servicios){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precio);
        this.setDiasAlq(p_diasAlq);
        this.setServicios(p_servicios);
    }
    /**
     * Setters
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setPrecioBase(double p_precio){
        this.precioBase = p_precio;
    }
    private void setDiasAlq(int p_diasAlq){
        this.diasAlquiler = p_diasAlq;
    }
    private void setServicios(ArrayList<Servicio> p_servicios){
        this.servicios = p_servicios;
    }
    /**
     * Getters
     */
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecioBase(){
        return this.precioBase;
    }
    public int getDiasAlquiler(){
        return this.diasAlquiler;
    }
    public ArrayList<Servicio> getServicios(){
        return this.servicios;
    }
    /**
     * Agrega un servicio de la coleccion
     * @param Servicio servicio
     * @return true o false
     */
    public boolean agregarServicio(Servicio p_servicio){
        return this.getServicios().add(p_servicio);
    }
    /**
     * Quita un servicio de la coleccion
     * @param Servicio servicio
     * @return true o false
     */
    public boolean quitarServicio(Servicio p_servicio){
        return this.getServicios().remove(p_servicio);
    }
    public abstract int contar(String p_alojamiento);
    /**
     * Calcula el costo del alojamiento
     * @return costo
     */
    public double costo(){
        return this.getPrecioBase() * this.getDiasAlquiler();
    }
    public void listarServicios(){
        for(Servicio s: this.getServicios()){
            System.out.println(s.getDescripcion() + ": $" + s.getPrecio());
        }
    }
    /**
     * @return el precio total de los servicios
     */
    public double costoServicios(){
        double total = 0;
        for(Servicio s: this.getServicios()){
            total += s.getPrecio();
        }
        return total;
    }
    public void liquidar(){
        /*
         *  Alojamiento: Cabañas La Alondra 
            Costo por 5 dias: $600.0 
            alquiler auto: $100.0 
            lavanderia: $20.0
         */
        System.out.println("Alojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDiasAlquiler() + " dias: " + this.costo());
        this.listarServicios();
    }
}

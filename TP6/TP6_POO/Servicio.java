
/**
 * Clase Servicio muestra la descripcion y el precio de un servicio.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Servicio
{
    private String descripcion;
    private double precio;
    /**
     * Constructor
     * @param String descripcion, double precio
     */
    public Servicio(String p_descripcion, double p_precio){
        this.setDescripcion(p_descripcion);
        this.setPrecio(p_precio);
    }
    /**
     * Setters
     */
    private void setDescripcion(String p_descripcion){
        this.descripcion = p_descripcion;
    }
    private void setPrecio(double p_precio){
        this.precio = p_precio;
    }
    /**
     * Getters
     */
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getPrecio(){
        return this.precio;
    }
}

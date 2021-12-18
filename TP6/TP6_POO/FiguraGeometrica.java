
/**
 * Clase FiguraGeometrica
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public abstract class FiguraGeometrica
{
    private Punto origen;
    /**
     * Constructor sobrecargado
     * @param Punto origen
     */
    public FiguraGeometrica(Punto p_origen){
        this.setOrigen(p_origen);
    }
    /**
     * Constructor
     */
    public FiguraGeometrica(){
        this.setOrigen(new Punto());
    }
    /**
     * Setters
     */
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    /**
     * Getters
     */
    public Punto getOrigen(){
        return this.origen;
    }
    /**
     * @return nombre de la figura
     */
    protected abstract String nombreFigura();
    /**
     * @return la superficie
     */
    protected abstract double superficie();
    public void mostrarSuperficie(){
        System.out.println(this.nombreFigura());
        System.out.println("Superficie: " + this.superficie());
    }
}

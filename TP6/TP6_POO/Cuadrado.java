
/**
 * Clase Cuadrado devuelve el nombre de la figura, calcula la superficie y perimetro, muestra por pantallas las caracteristicas de un cuadrado.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Cuadrado extends Rectangulo
{
    private Punto origen;
    private double lado;
    /**
     * Constructor sobrecargado
     * @param Punto origen, double ancho, double alto, double lado
     */
    public Cuadrado(Punto p_origen, double p_ancho, double p_alto, double p_lado){
        super(p_origen, p_ancho, p_alto);
        this.setOrigen(p_origen);
        this.setLado(p_lado);
    }
    /**
     * Constructor
     * @param double ancho, double alto, double lado
     */
    public Cuadrado(double p_ancho, double p_alto, double p_lado){
        super(p_ancho, p_alto);
        this.setOrigen(new Punto());
        this.setLado(p_lado);
    }
    /**
     * Setters
     */
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    private void setLado(double p_lado){
        this.lado = p_lado;
    }
    /**
     * Getters
     */
    public Punto getOrigen(){
        return this.origen;
    }
    public double getLado(){
        return this.lado;
    }
    /**
     * @return nombre de la figura
     */
    public String nombreFigura(){
        return "****** Cuadrado ******";
    }
    /**
     * Utiliza una formula matematica para calcular la superficie
     * @return superficie
     */
    public double superficie(){
        return (Math.pow(this.getLado(), 2));
    }
    /**
     * Los lados se multiplican por 4 para poder obtener el perimetro
     * @return perimetro
     */
    public double perimetro(){
        return (this.getLado() * 4);
    }
    public void caracteristicas(){
        /*
         * ****** Cuadrado ******
        Origen: (5.0, 3.0) - Lado: 72.99
        Superficie: 5327.54 - Perimetro: 291.96
         */
        System.out.println("***** Cuadrado *****");
        System.out.println("Origen: (" + this.getOrigen().coordenadas() + " ) " + " - Lado: " + this.getLado());
        System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
    }
}

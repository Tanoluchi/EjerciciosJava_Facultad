
/**
 * Clase Triangulo
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Triangulo extends FiguraGeometrica
{
    private double base;
    private double altura;
    /**
     * Constructor
     * @param Punto origen, double base, double altura
     */
    public Triangulo(Punto p_origen, double p_base, double p_altura){
        super(p_origen);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    /**
     * Setters
     */
    private void setBase(double p_base){
       this.base = p_base; 
    }
    private void setAltura(double p_altura){
        this.altura = p_altura;
    }
    /**
     * Getters
     */
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    /**
     * @return nombre de la figura
     */
    public String nombreFigura(){
        return "****** Triangulo ******";
    }
    /**
     * Utiliza una formula matematica para poder calcular la superficie.
     * return superficie
     */
    public double superficie(){
        return (this.getBase() * this.getAltura()) / 2;
    }
}

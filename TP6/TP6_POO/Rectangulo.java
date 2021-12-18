
/**
 * Clase Rectangulo calcula el perimetro y superficie de un rectangulo, desplaza el punto de un rectangulo, calcula la distancia entre dos rectangulos
 * y devuelve el mayor entre dos rectangulos.
 * 
 * @author Valenzuela
 * @version 09/2021
 */
public class Rectangulo extends FiguraGeometrica{
    private Punto origen;
    private double ancho;
    private double alto;
    /**
     * Constructor (Sobrecargado)
     * @param Punto origen, double ancho, double alto
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        super(p_origen);
        setOrigen(p_origen);
        setAncho(p_ancho);
        setAlto(p_alto);
    }
    /**
     * Constructor (Sobrecargado)
     * @param double ancho, double alto
     */
    public Rectangulo(double p_ancho, double p_alto){
        setOrigen(new Punto());
        setAncho(p_ancho);
        setAlto(p_alto);
    }
    /**
     * Setters
     */
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    /**
     * Getters
     */
    public double getAncho(){
        return this.ancho;
    }
    public double getAlto(){
        return this.alto;
    }
    public Punto getOrigen(){
        return this.origen;
    }
    /**
     * Método que desplaza el punto (x,y) a (x + dx, y + dy)
     * @param double dx, double dy
     */
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    /**
     * @return nombre de la figura
     */
    public String nombreFigura(){
        return "****** Rectangulo ******";
    }
    public void caracteristicas(){
        System.out.println("***** Rectangulo *****");
        System.out.println("Origen: (" + this.getOrigen().coordenadas() + " ) " + " - Alto: " + this.getAlto() + " - Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
    }
    /**
     * Calcula el perimetro con la formula: alto x ancho.
     * @return Devuelve el perimetro.
     */
    public double perimetro(){
        return (this.getAlto() * this.getAncho());
    }
    /**
     * Calcula la superficie con la formula: 2 x (alto + ancho)
     */
    public double superficie(){
        return (2 * (this.getAlto() + this.getAncho()));
    }
    /**
     * Calcula la distancia entre dos puntos.
     * @param Circulo otroCirculo
     * @return La distancia entre el punto mismo de un rectangulo y el punto de un objeto Rectangulo pasado por parametro.
     */
    public double distanciaA(Rectangulo otroRectangulo){
        return (getOrigen().getX() + getOrigen().getY()) - (otroRectangulo.getOrigen().getX() + otroRectangulo.getOrigen().getY());
    }
    /**
     * Realiza una verificacion entre dos rectangulos y devuelve el rectangulo mayor.
     * @param Rectangulo otroRectangulo
     * @return Devuelve el Rectangulo mayor.
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie() > otroRectangulo.superficie()){
            return this;
        }else{
            return otroRectangulo;
        }
    }
}

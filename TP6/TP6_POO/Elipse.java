
/**
 * Clase Eclipse devuelve el nombre de la figura, realiza la verificacion del mayor entre dos elipses, desplaza los puntos x, y. Devuelve la distancia
 * entre dos elipses
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Elipse extends FiguraGeometrica
{
    private double sEjeMayor;
    private double sEjeMenor;
    private Punto centro;
    /**
     * Constructor sobrecargado
     * @param double sEjeMayor, double sEjeMenor, Punto centro
     */
    public Elipse(double p_sEjeMayor, double p_sEjeMenor, Punto p_centro){
        super(p_centro);
        this.setEjeMayor(p_sEjeMayor);
        this.setEjeMenor(p_sEjeMenor);
        this.setCentro(p_centro);
    }
    /**
     * Constructor
     * @param double sEjeMayor, double sEjeMenor
     */
    public Elipse(double p_sEjeMayor, double p_sEjeMenor){
        this.setEjeMayor(p_sEjeMayor);
        this.setEjeMenor(p_sEjeMenor);
        this.setCentro(new Punto());
    }
    /**
     * Setters
     */
    private void setEjeMayor(double p_sEjeMayor){
        this.sEjeMayor = p_sEjeMayor;
    }
    private void setEjeMenor(double p_sEjeMenor){
        this.sEjeMenor = p_sEjeMenor;
    }
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    /**
     * Getters
     */
    public double getEjeMayor(){
        return this.sEjeMayor;
    }
    public double getEjeMenor(){
        return this.sEjeMenor;
    }
    public Punto getCentro(){
        return this.centro;
    }
    /**
     * @return nombre de la figura
     */
    public String nombreFigura(){
        return "****** Elipse *******";
    }
    public void caracteristicas(){
        //****** Elipse ******
        //Centro: (5.0, 3.0) - Semieje Mayor: 20.44 - Semieje Menor: 46.86
        //Superficie: 3009.08
        System.out.println(this.nombreFigura() + "\nCentro: " + this.getCentro().coordenadas() + " - Semieje Mayor: " + this.getEjeMayor() + " - Semieje Menor: " + this.getEjeMenor());
        System.out.println("Superficie: " + this.superficie());
    }
    /**
     * Realiza una formula matematica para obtener la superficie y la devuelve.
     * @return superficie
     */
    public double superficie(){
        return Math.PI * this.getEjeMayor() * this.getEjeMenor();
    }
    /**
     * Desplaza el punto x y el punto y
     * @param double dx, double dy
     */
    public void desplazar(double p_dx, double p_dy){
        System.out.println("Punto Desplazado:\n X: " + (this.getCentro().getX() + p_dx) + "\tY: " + (this.getCentro().getY() + p_dy));
    }
    /**
     * @param Elipse otraElipse
     * @return distancia entre dos elipses
     */
    public double distanciaA(Elipse otraElipse){
        return (this.getCentro().getX() + this.getCentro().getY()) - (otraElipse.getCentro().getX() + otraElipse.getCentro().getY());
    }
    /**
     * Realiza una verificacion entre dos elipses, el que contenga la mayor superficie se considera el mayor y se retorna.
     * @param Elipse otraElipse
     * @return un elipse
     */
    public Elipse elMayor(Elipse otraElipse){
        if(this.superficie() > otraElipse.superficie()){
            return this;
        }else{
            return otraElipse;
        }
    }
}

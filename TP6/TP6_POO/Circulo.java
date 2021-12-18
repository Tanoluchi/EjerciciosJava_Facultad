import java.util.*;
/**
 * Clase Circulo calcula el perimetro y superficie de un circulo, desplaza el punto de un circulo.
 * Calcula la distancia entre dos circulos y devuelve el mayor entre dos circulos.
 * 
 * @author Valenzuela Luciano 
 */
public class Circulo extends Elipse{
    private double radio;
    private Punto centro;
    /**
     * Constructor sobrecargado (inicializa el objeto).
     * @param double sEjeMayor, double sEjeMenor, double radio, Punto centro
     */
    public Circulo(double p_sEjeMayor, double p_sEjeMenor, double p_radio, Punto p_centro){
        super(p_sEjeMayor, p_sEjeMenor, p_centro);
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    /**
     * Constructor sobrecargado
     * @param double sEjeMayor, double sEjeMenor
     */
    public Circulo(double p_sEjeMayor, double p_sEjeMenor){
        super(p_sEjeMayor, p_sEjeMenor);
        this.setRadio(0);
        this.setCentro(new Punto());
    }
    /**
     * Setters
     */
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    /**
     * Getters
     */
    public double getRadio(){
        return this.radio;
    }
    public Punto getCentro(){
        return this.centro;
    }
    /**
     * Método que desplaza el punto (x,y) a (x + dx, y + dy)
     * @param double dx, double dy
     */
    public void desplazar(double p_dx, double p_dy){
        System.out.println("Punto Desplazado:\n X: " + (getCentro().getX() + p_dx) + "\tY: " + (getCentro().getY() + p_dy));
    }
    /**
     * @return nombre de la figura
     */
    public String nombreFigura(){
        return "****** Circulo ******";
    }
    public void caracteristicas(){
        System.out.println("**** Circulo ****");
        System.out.println("Centro: " + "(" + getCentro().getX() + ", " + getCentro().getY() + ")\t - Radio: " + getRadio());
        System.out.println("Superficie: " + superficie() + "\t - Perimetro: " + perimetro());
    }
    /**
     * Calcula el perimetro con la formula: 2 x PI x radio.
     * @return devuelve el perimetro
     */
    public double perimetro(){
        return (2 * Math.PI * getRadio()); 
    }
    /**
     * Calcula la superficie con la formula: PI x radio^2
     * @return devuelve la superficie
     */
    public double superficie(){
        return (Math.PI * Math.pow(getRadio(), 2));
    }
    /**
     * Calcula la distancia entre dos puntos.
     * @param Circulo otroCirculo
     * @return La distancia entre el punto mismo de un circulo y el punto de un objeto Circulo pasado por parametro.
     */
    public double distanciaA(Circulo otroCirculo){
        return (getCentro().getX() + getCentro().getY()) - (otroCirculo.getCentro().getX() + otroCirculo.getCentro().getY());
    }
    /**
     * Realiza una verificacion entre dos circulos y devuelve el circulo mayor.
     * @param Circulo otroCirculo
     * @return circulo mayor.
     */
    public Circulo elMayor(Circulo otroCirculo){
        if(this.superficie() > otroCirculo.superficie()){
            return this;
        }else{
            return otroCirculo;
        }
    }
}
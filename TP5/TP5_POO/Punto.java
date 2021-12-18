import java.util.*;
/**
 * Clase punto calcula la distancia entre puntos, asigna y muestra su coordenada x, coordenada y. Calcula la distancia entre el mismo y otro punto. 
 * @author Valenzuela Luciano
 */
public class Punto{
    private double x;
    private double y;
    /**
     * Constructores de la clase Punto (sobrecargado)
     */
    public Punto(){
        x = 0;
        y = 0;
    }
    /**
     * @param double x, double y
     */
    public Punto(double p_x, double p_y){
        setX(p_x);
        setY(p_y);
    }
    /**
     * Setters
     */
    private void setX(double p_x){
        this.x = p_x;
    }
    private void setY(double p_y){
        this.y = p_y;
    }
    /**
     * Getters
     */
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    /**
     * Calcula la distancia entre dos puntos.
     * @param Punto puntoDistante
     * @return distancia entre el punto mismo a otro objeto punto pasado por parametro.
     */
    public double distanciaA(Punto p_ptoDistante){
        return (Math.sqrt(Math.pow((p_ptoDistante.getX() - this.getX()), 2) + Math.pow((p_ptoDistante.getY() - this.getY()), 2)));
    }
    /** Método que desplaza el punto (x,y) a (x + dx, y + dy)
     * @param double dx, double dy
     */
    public void desplazar(double p_dx, double p_dy){
        System.out.println("X se desplazo: " + (this.getX() + p_dx));
        System.out.println("Y se desplazo: " + (this.getY() + p_dy));
    }
    public String coordenadas(){
        return (getX() + ", " + getY());
    }
    public void mostrar(){
        System.out.println("Punto. X:" + getX() + ", Y:" + getY());
    }
}
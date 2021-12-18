import java.util.*;
/**
 * CreaFiguras es una clase ejecutable para probar las Clases circulo y rectangulo.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class CreaFiguras
{
   public static void main(String[] args){
       Random unNumero = new Random();
       double radio, x, y, ancho, alto;
       
       radio = unNumero.nextDouble() * 100.0;
       Circulo otroCirculo = new Circulo(radio, new Punto(0, 0));
       otroCirculo.desplazar(-240, -230);
       otroCirculo.caracteristicas();
       
       radio = unNumero.nextDouble() * 100.0;
       Circulo unCirculo = new Circulo(radio, new Punto(5.2, 0.5));
       unCirculo.elMayor(otroCirculo).caracteristicas();
       System.out.println("Distancia: " + unCirculo.distanciaA(otroCirculo));
       
       ancho = unNumero.nextDouble() * 100.0;
       alto = unNumero.nextDouble() * 100.0;
       Rectangulo unRectangulo = new Rectangulo(new Punto(0, 0), ancho, alto);
       unRectangulo.desplazar(40, -20);
       unRectangulo.caracteristicas();
        
       ancho = unNumero.nextDouble() * 100.0;
       alto = unNumero.nextDouble() * 100.0;
       Rectangulo otroRectangulo = new Rectangulo(new Punto(7.4, 4.5), ancho, alto);
       otroRectangulo.elMayor(unRectangulo).caracteristicas();
       System.out.println("Distancia: " + otroRectangulo.distanciaA(unRectangulo));
  }
}

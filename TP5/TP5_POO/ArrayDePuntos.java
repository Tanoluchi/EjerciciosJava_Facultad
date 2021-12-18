import java.io.*;
/**
 * Clase ejecutable donde creamos un contenedor estatico de 6 elementos y le agregamos elementos de la clase Punto, e imprimimos sus coordenadas.
 * 
 * @author Valenzuela Luciano Juan Ignacio 
 * @version 9/2021
 */
public class ArrayDePuntos
{
   public static void main(String[] args) throws IOException {
       Punto[] puntos = new Punto[6];
       double x, y;
       int j = 1;
       BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
       
       /**
        * Recorremos el array y vamos agregando elementos instancias de la Clase Punto.
        */
       for (int i = 0; i < puntos.length; i++){
           System.out.println("Ingresar coordenada X: ");
           x = Double.parseDouble(teclado.readLine());
           System.out.println("Ingresar coordenada Y: ");
           y = Double.parseDouble(teclado.readLine());
           puntos[i] = new Punto(x, y);
       }
       /**
        * Recorremos el array y vamos mostrando las coordenadas de cada elemento instancia de la Clase Punto.
        */
       for (int i = 0; i < puntos.length; i++){
            System.out.println("Elemento " + (i + 1) + ": " + "( " + puntos[i].coordenadas() + " )");
       }
       /**
        * Recorremos el array y vamos mostrando la distancia entre un elemento y otro.
        */
       for (int i = 0; i < puntos.length - 1; i++){
           System.out.println("La distancia entre el elemento " + (i + 1) + " y el elemento " + (j + 1) + " es de: " + puntos[i].distanciaA(puntos[j]));
           j++;
       }
   }
}

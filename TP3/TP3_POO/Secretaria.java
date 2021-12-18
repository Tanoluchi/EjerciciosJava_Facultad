import java.util.*;
/**
 * Clase Secretaria instancia una escuela y un docente, luego emite un recibo.
 * 
 * @author Valenzuela Luciano 
 * @version 9/2021
 */
public class Secretaria
{
   public static void main(String[] args){
       Scanner teclado = new Scanner(System.in);
       String escuela, domicilio, director, docente, grado;
       double sueldoBasico, asigFamiliar;
       System.out.print("Ingrese el nombre de la escuela: ");
       escuela = teclado.nextLine();
       System.out.print("\nIngrese el domicilio: ");
       domicilio = teclado.nextLine();
       System.out.print("\nIngrese el nombre del Director: ");
       director = teclado.nextLine();
       System.out.print("\nIngrese el nombre del Docente: ");
       docente = teclado.nextLine();
       System.out.print("\nIngrese grado: ");
       grado = teclado.nextLine();
       System.out.print("\nIngrese el sueldo basico: ");
       sueldoBasico = teclado.nextDouble();
       System.out.print("\nIngrese la asignacion familiar: ");
       asigFamiliar = teclado.nextDouble();
       
       Escuela unaEscuela = new Escuela(escuela, domicilio, director);
       Docente unDocente = new Docente(docente, grado, sueldoBasico, asigFamiliar);
       
       unaEscuela.imprimirRecibo(unDocente);
   }
}

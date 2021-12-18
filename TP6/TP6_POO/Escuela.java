import java.util.*;

/**
 * Clase Escuela es un ejecutable para probar a la clase Alumno
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Escuela
{
    public static void main(String[] args){
        int nroDni, lu, anioNacimiento;
        String nombre, apellido;
        double nota1, nota2;
        char continuar = 's';
        Scanner teclado = new Scanner(System.in);
        
        while(continuar != 'n' && continuar != 'N'){
            System.out.println("Ingrese los datos del alumno: ");
            System.out.println("\nIngrese DNI: ");
            nroDni = teclado.nextInt();
            System.out.println("Ingrese LU: ");
            lu = teclado.nextInt();
            System.out.println("Ingrese nombre: ");
            nombre = teclado.next();
            System.out.println("Ingrese apellido: ");
            apellido = teclado.next();
            System.out.println("Ingrese año de nacimiento: ");
            anioNacimiento = teclado.nextInt();
            Alumno unAlumno = new Alumno(nroDni, lu, nombre, apellido, anioNacimiento);
            System.out.println("Ingrese nota 1: ");
            nota1 = teclado.nextDouble();
            unAlumno.setNota1(nota1);
            System.out.println("Ingrese nota 2: ");
            nota2 = teclado.nextDouble();
            unAlumno.setNota2(nota2);
            unAlumno.mostrar();
            System.out.println("Desea seguir ingresando datos de alumnos? (S/N): ");
            continuar = (teclado.next()).charAt(0);
        }
        System.out.println("\nSe ha finalizado el programa!");
    }
}

import java.util.*;

/**
 * Clase Carrera es una clase Ejecutable para probar la clase Curso.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 * @version 9/2021
 */
public class Carrera
{
    public static void main(String [] args){
    int lu;
    String nombreCarrera, nombreAlumno, apellidoAlumno;
    double nota1, nota2;
    char opcion = 's';
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Ingresar nombre del curso: ");
    nombreCarrera = teclado.next();
    Curso unCurso = new Curso(nombreCarrera);
    
    System.out.println("Desea ingresar datos de los alumnos del curso? (S/N)");
    opcion = (teclado.next()).charAt(0);
    while(opcion != 'n' && opcion != 'N'){
        System.out.println("Ingresar LU: ");
        lu = teclado.nextInt();
        System.out.println("Ingresar nombre del alumno: ");
        nombreAlumno = teclado.next();
        System.out.println("Ingresar apellido del alumno: ");
        apellidoAlumno = teclado.next();
        System.out.println("Ingresar nota 1: ");
        nota1 = teclado.nextDouble();
        System.out.println("Ingresar nota 2: ");
        nota2 = teclado.nextDouble();
        
        Alumno unAlumno = new Alumno(lu, nombreAlumno, apellidoAlumno);
        unAlumno.setNota1(nota1);
        unAlumno.setNota2(nota2);
        unCurso.inscribirAlumno(unAlumno);
        System.out.println("Desea seguir ingresando datos? (S/N)");
        opcion = (teclado.next()).charAt(0);
    }
    unCurso.mostrarInscriptos();
    System.out.println("La cantidad de alumnos inscriptos es de: " + unCurso.cantidadDeAlumnos());
    unCurso.imprimirPromedioDelAlumno(1);
    Alumno unAlumno2 = new Alumno(3123, "Miguel", "Ramirez");
    unAlumno2.setNota1(1);
    unAlumno2.setNota2(8);
    Alumno unAlumno3 = new Alumno(8783, "Jose", "Mendez");
    unAlumno3.setNota1(10);
    unAlumno3.setNota2(6);
    unCurso.inscribirAlumno(unAlumno2);
    unCurso.inscribirAlumno(unAlumno3);
    unCurso.mostrarInscriptos();
    unCurso.imprimirPromedioDelAlumno(8783);
    unCurso.quitarAlumno(3123);
    unCurso.estaInscripto(8783);
    unCurso.estaInscripto(unAlumno2);
    unCurso.mostrarInscriptos();
    unCurso.buscarAlumno(8783).mostrar();
    unCurso.imprimirPromedioDelAlumno(8783);
    }
}

import java.util.*;

/**
 * Clase Empresa es una clase ejecutable para probar la clase Empleado
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Empresa
{
   public static void main(String[] args){
       int nroDni, fechaIngreso, fechaNacimiento;
       long cuil;
       double sueldoBasico;
       String nombre, apellido;
       char continuar = 's';
       Scanner teclado = new Scanner(System.in);
       
       while(continuar != 'n' && continuar != 'N'){
           System.out.println("Ingresa los datos del empleado: ");
           System.out.println("\nIngresa el CUIL: ");
           cuil = teclado.nextLong();
           System.out.println("Ingresa el DNI: ");
           nroDni = teclado.nextInt();
           System.out.println("Ingresa el apellido: ");
           apellido = teclado.next();
           System.out.println("Ingresa el nombre: ");
           nombre = teclado.next();
           System.out.println("Ingresa el sueldo basico: ");
           sueldoBasico = teclado.nextDouble();
           System.out.println("Ingresa año de ingreso: ");
           fechaIngreso = teclado.nextInt();
           System.out.println("Ingresa año de nacimiento: ");
           fechaNacimiento = teclado.nextInt();
           Empleado unEmpleado = new Empleado(cuil, nroDni, apellido, nombre, sueldoBasico, fechaIngreso, fechaNacimiento);
           unEmpleado.mostrar();
           System.out.println("Desea seguir ingresando datos de alumnos? (S/N): ");
           continuar = (teclado.next()).charAt(0);
       }
       System.out.println("\nSe ha finalizado el programa!");
   }
}

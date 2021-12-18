import java.util.*;
/**
 * Clase Empresa instancia los objetos Empleado y EmpleadoConJefe, muestra los datos del empleado y verifica si es su aniversario.
 * 
 * @author Valenzuela Luciano 
 * @version 9/2021
 */
public class Empresa
{
    public static void main(String[] args){
        Calendar fecha = Calendar.getInstance();
        fecha.set(2001, 8, 11);
        Empleado unEmpleado = new Empleado(42546, "Luciano", "Valenzuela", 1500.0, fecha);
        
        unEmpleado.mostrar();
        unEmpleado.mostrarLinea();
        if(unEmpleado.esAniversario()){
            System.out.println("Felicidades es tu aniversario en la empresa, puede retirarse 1 hora antes");
        }
        
        fecha.set(2020, 3, 25);
        Empleado otroEmpleado = new Empleado(42546, "Denise", "Grat", 2765.0, fecha);
        
        otroEmpleado.mostrar();
        otroEmpleado.mostrarLinea();
        if(otroEmpleado.esAniversario()){
            System.out.println("Felicidades es tu aniversario en la empresa, puede retirarse 1 hora antes");
        }
        
        fecha.set(2013, 10, 25);
        EmpleadoConJefe unEmpleadoConJefe = new EmpleadoConJefe(123, "Ramirez", "Juan", 500.25, fecha, new EmpleadoConJefe(145, "Bulgheri", "Gregorio", 1500.43, 2005));
        
        unEmpleadoConJefe.mostrarPantalla();
        
        fecha.set(2018, 5, 30);
        EmpleadoConJefe otroEmpleadoConJefe = new EmpleadoConJefe(2513, "Luis", "Miguel", 1901.245, fecha);
        otroEmpleadoConJefe.mostrarPantalla();
        System.out.println(otroEmpleadoConJefe.getAnioIngreso());
    }
}

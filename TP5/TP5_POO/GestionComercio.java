import java.util.*;

/**
 * GestionComercio es una clase ejecutable para probar la Clase Comercio
 * 
 * @author Valenzuela Luciano Juan Ignacio
 * @version 9/2021
 */
public class GestionComercio
{
    public static void main(String[] args){
        long cuil;
        int anioIngreso;
        String apellidoEmpleado, nombreEmpleado, nombreComercio;
        double sueldoBasico;
        char continuar = 's';
        
        Calendar fecha = Calendar.getInstance();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar nombre del comercio: ");
        nombreComercio = teclado.next();
        
        Comercio unComercio = new Comercio(nombreComercio);
        while(continuar != 'n' && continuar != 'N'){
            System.out.println("****** Ingresar datos de empleado ******");
            System.out.println("Ingresar CUIL: ");
            cuil = teclado.nextLong();
            System.out.println("Ingresar apellido: ");
            apellidoEmpleado = teclado.next();
            System.out.println("Ingresar nombre: ");
            nombreEmpleado = teclado.next();
            System.out.println("Ingresar sueldo basico: ");
            sueldoBasico = teclado.nextDouble();
            System.out.println("Ingresar año de ingreso: ");
            anioIngreso = teclado.nextInt();
            
            Empleado unEmpleado = new Empleado(cuil, apellidoEmpleado, nombreEmpleado, sueldoBasico, anioIngreso);
            unComercio.altaEmpleado(unEmpleado);
            System.out.println("Desea seguir ingresando datos? (S/N)");
            continuar = (teclado.next()).charAt(0);
        }
        Empleado otroEmpleado = new Empleado(345678, "Nata", "Miguelin", 2000, 1995);
        Empleado otroEmpleado2 = new Empleado(12345678, "Ruiz", "Pablo", 9000, 2015);
        System.out.println("La cantidad de empleados es de: " + unComercio.cantidadDeEmpleados());
        unComercio.nomina();
        unComercio.altaEmpleado(otroEmpleado);
        unComercio.altaEmpleado(otroEmpleado2);
        unComercio.esEmpleado(345678);
        unComercio.buscarEmpleado(345678).mostrarLinea();
        unComercio.sueldoNeto(345678);        
        unComercio.bajaEmpleado(345678);
        unComercio.esEmpleado(345678);
        System.out.println("La cantidad de empleados es de: " + unComercio.cantidadDeEmpleados());
        unComercio.nomina();
        
    }
}

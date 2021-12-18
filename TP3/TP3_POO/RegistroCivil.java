import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Clase RegistroCivil instancia un objeto hombre y un objeto mujer, los casa, muestra por pantalla con quien esta casado y muestra sus datos.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class RegistroCivil
{
    public static void main(String[] args) throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String nombre, apellido, entrada;
        int edad;
        System.out.println("Ingrese datos de la Mujer:");
        System.out.println("Ingrese nombre: ");
        nombre = bufer.readLine();
        System.out.println("Ingrese apellido: ");
        apellido = bufer.readLine();
        System.out.println("Ingrese edad: ");
        entrada = bufer.readLine();
        edad = Integer.valueOf(entrada);
        
        Mujer unaMujer = new Mujer(nombre, apellido, edad);
        
        System.out.println("Ingrese datos del Hombre:");
        System.out.println("Ingrese nombre: ");
        nombre = bufer.readLine();
        System.out.println("Ingrese apellido: ");
        apellido = bufer.readLine();
        System.out.println("Ingrese edad: ");
        entrada = bufer.readLine();
        edad = Integer.valueOf(entrada);
        
        Hombre unHombre = new Hombre(nombre, apellido, edad);
        
        System.out.println("Ingrese datos de otro Hombre:");
        System.out.println("Ingrese nombre: ");
        nombre = bufer.readLine();
        System.out.println("Ingrese apellido: ");
        apellido = bufer.readLine();
        System.out.println("Ingrese edad: ");
        entrada = bufer.readLine();
        edad = Integer.valueOf(entrada);
     
        Hombre otroHombre = new Hombre(nombre, apellido, edad);
        Mujer unaMujer2 = new Mujer("Juana", "Miguela", 28);
        
        unHombre.mostrarEstadoCivil();
        unaMujer.mostrarEstadoCivil();
        unaMujer.casarseCon(unHombre);
        unaMujer2.casarseCon(unHombre);
        unaMujer2.casadaCon();
        unHombre.casadoCon();
        otroHombre.casarseCon(unaMujer);
        unaMujer.divorcio();
        unaMujer.casarseCon(otroHombre);
        unHombre.mostrarEstadoCivil();
        unaMujer.mostrarEstadoCivil();
        otroHombre.mostrarEstadoCivil();
        unHombre.datos();
        unaMujer.datos();
        otroHombre.datos();
    }
}

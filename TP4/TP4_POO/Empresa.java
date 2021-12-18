import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 * Write a description of class Empresa here.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class Empresa
{
    public static void main(String[] args) throws java.text.ParseException {
        long cuil = 0;
        String apellido = "";
        String nombre = "";
        String fechaString = "";
        double sueldoBasico = 0.0;
        double sueldoNeto = 0.0;
        int diaIngreso = 0;
        int mesIngreso = 0;
        int añoIngreso = 0;
        char opcion = 'S';
        
        // Creamos un objeto fechaIngreso de la clase Calendar
        Calendar fechaIngreso = Calendar.getInstance();
        // Creamos un objeto teclado de la clase BufferedReader
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            FileOutputStream archiFOS = new FileOutputStream("C:\\Users\\Usuario\\Desktop\\Facultad\\Segundo Año\\Programación Orientada a Objetos\\Practico\\Resolución\\TP4\\Empleado.dat",true);
            DataOutputStream archiDOS = new DataOutputStream(archiFOS);
            while(opcion != 'n' && opcion != 'N'){
                //CUIL Apellido Nombre Sueldo básico Sueldo Neto Día Ingreso Mes Ingreso Año Ingreso
                System.out.println("Ingrese CUIL: ");
                cuil = Long.parseLong(teclado.readLine());
                System.out.println("Ingrese Nombre: ");
                nombre = teclado.readLine();
                System.out.println("Ingrese Apellido: ");
                apellido = teclado.readLine();
                System.out.println("Ingrese Sueldo Basico: ");
                sueldoBasico = Double.parseDouble(teclado.readLine());
                System.out.println("Ingrese Fecha de Ingreso(dd/MM/yyyy): ");
                fechaString = teclado.readLine();
                // Convertimos el String en un Date
                Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaString);  
                // Asignamos el Date a fechaIngreso
                fechaIngreso.setTime(fecha);
                
                // Instanciamos al empleado
                Empleado unEmpleado = new Empleado(cuil, nombre, apellido, sueldoBasico, fechaIngreso);
                unEmpleado.mostrar();
                
                diaIngreso = fechaIngreso.get(Calendar.DATE);
                mesIngreso = fechaIngreso.get(Calendar.MONTH);
                añoIngreso = fechaIngreso.get(Calendar.YEAR);
                
                sueldoNeto = unEmpleado.sueldoNeto();
                //grabando el archivo
                archiDOS.writeLong(cuil);
                archiDOS.writeUTF(nombre);
                archiDOS.writeUTF(apellido);
                archiDOS.writeDouble(sueldoBasico); 
                archiDOS.writeDouble(sueldoNeto); 
                archiDOS.writeInt(diaIngreso); 
                archiDOS.writeInt(mesIngreso); 
                archiDOS.writeInt(añoIngreso);
                
                System.out.println("Usted desea ingresar más datos? (S/N): ");
                opcion=teclado.readLine().charAt(0);
            }
            archiDOS.close();
        }
        catch(FileNotFoundException fnfe){
            System.out.println("Archivo no encontrado");
        }
        catch(IOException ioe){
             System.out.println("Error al grabar");
        } 
    }
}

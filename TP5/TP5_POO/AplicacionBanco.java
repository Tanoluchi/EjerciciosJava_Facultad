import java.util.*;
import java.io.*;
/**
 * AplicacionBanco Clase ejecutable para probar la clase Banco.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 * @version 9/2021
 */
public class AplicacionBanco
{
   public static void main(String[] args) throws IOException {
       BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
       Calendar fecha = Calendar.getInstance();
       ArrayList <Empleado>listaEmpleados = new ArrayList();
       ArrayList <CuentaBancaria>listaCuentas = new ArrayList();
       long cuil;
       String apellidoEmpleado, nombreEmpleado, nombreTitular, apellidoTitular;
       double sueldoBasico, saldo;
       int anioIngreso, anioNacimiento, nroDni, nroCuenta;
       int opcion;
       char continuar = 's';
       int x = 0;
       
       System.out.println("Ingresar nombre del banco: ");
       String nombreBanco = teclado.readLine();
       System.out.println("Ingresar nro de sucursal: ");
       int nroSucursal = Integer.parseInt(teclado.readLine());
       System.out.println("Ingresar localidad: ");
       String localidad = teclado.readLine();
       System.out.println("Ingresar provincia: ");
       String provincia = teclado.readLine();
       System.out.println("Que tipos de datos desea ingresar? (0- Empleados, 1- Cuentas)");
       opcion = Integer.parseInt(teclado.readLine());
        if(opcion == 0){
            while(continuar != 'n' && continuar != 'N'){
                System.out.println("--- DATOS DEL EMPLEADO ---");
                System.out.println("Ingresar CUIL del empleado: ");
                cuil = Long.parseLong(teclado.readLine());
                System.out.println("Ingresar apellido del empleado: ");
                apellidoEmpleado = teclado.readLine(); 
                System.out.println("Ingresar nombre del empleado: ");
                nombreEmpleado = teclado.readLine();
                System.out.println("Ingresar sueldo basico del empleado: ");
                sueldoBasico = Double.parseDouble(teclado.readLine());
                System.out.println("Ingresar anio de ingreso: ");
                anioIngreso = Integer.parseInt(teclado.readLine());
                Empleado unEmpleado = new Empleado(cuil, apellidoEmpleado, nombreEmpleado, sueldoBasico, anioIngreso);    
                listaEmpleados.add(unEmpleado);
                System.out.println("Desea seguir ingresando datos de empleados? (s/n)");
                continuar = teclado.readLine().charAt(0);
                System.out.println("---------------------------------------------------------------");
            }
            System.out.println("Desea ingresar datos de cuentas? (0- Si, 1- No)");
            opcion = Integer.parseInt(teclado.readLine());
            if(opcion == 0){
                continuar = 's';
                while(continuar != 'n' && continuar != 'N'){
                    System.out.println("--- DATOS DE CUENTAS BANCARIAS ---");
                    System.out.println("Ingresar CUIL del titular: ");
                    nroDni = Integer.parseInt(teclado.readLine());
                    System.out.println("Ingresar nombre del titular: ");
                    nombreTitular = teclado.readLine(); 
                    System.out.println("Ingresar apellido del titular: ");
                    apellidoTitular = teclado.readLine();
                    System.out.println("Ingresar anio de nacimiento del titular: ");
                    anioNacimiento = Integer.parseInt(teclado.readLine());
                    System.out.println("Ingresar Numero de Cuenta: ");
                    nroCuenta = Integer.parseInt(teclado.readLine());
                    System.out.println("Ingresar Saldo en la cuenta: ");
                    saldo = Double.parseDouble(teclado.readLine());
                    Persona unaPersona = new Persona(nroDni, nombreTitular, apellidoTitular, anioNacimiento);
                    CuentaBancaria unaCuenta = new CuentaBancaria(nroCuenta, unaPersona, saldo);
                    listaCuentas.add(unaCuenta);
                    System.out.println("Desea seguir ingresando datos de cuentas? (s/n)");
                    continuar = teclado.readLine().charAt(0);
                    System.out.println("---------------------------------------------------------------");
               }
           } 
        }else{
               while(continuar != 'n' && continuar != 'N'){
                System.out.println("--- DATOS DE CUENTAS BANCARIAS ---");
                System.out.println("Ingresar CUIL del titular: ");
                nroDni = Integer.parseInt(teclado.readLine());
                System.out.println("Ingresar nombre del titular: ");
                nombreTitular = teclado.readLine(); 
                System.out.println("Ingresar apellido del titular: ");
                apellidoTitular = teclado.readLine();
                System.out.println("Ingresar anio de nacimiento del titular: ");
                anioNacimiento = Integer.parseInt(teclado.readLine());
                System.out.println("Ingresar Numero de Cuenta: ");
                nroCuenta = Integer.parseInt(teclado.readLine());
                System.out.println("Ingresar Saldo en la cuenta: ");
                saldo = Double.parseDouble(teclado.readLine());
                Persona unaPersona = new Persona(nroDni, nombreTitular, apellidoTitular, anioNacimiento);
                CuentaBancaria unaCuenta = new CuentaBancaria(nroCuenta, unaPersona, saldo);
                listaCuentas.add(unaCuenta);
                System.out.println("Desea seguir ingresando datos de cuentas? (s/n)");
                continuar = teclado.readLine().charAt(0);
                System.out.println("---------------------------------------------------------------");
           }
           System.out.println("Desea ingresar datos de Empleados? (0- Si, 1- No)");
           opcion = Integer.parseInt(teclado.readLine());
            if(opcion == 0){
                continuar = 's';
                while(continuar != 'n' && continuar != 'N'){
                   System.out.println("--- DATOS DEL EMPLEADO ---");
                   System.out.println("Ingresar CUIL del empleado: ");
                   cuil = Long.parseLong(teclado.readLine());
                   System.out.println("Ingresar apellido del empleado: ");
                   apellidoEmpleado = teclado.readLine(); 
                   System.out.println("Ingresar nombre del empleado: ");
                   nombreEmpleado = teclado.readLine();
                   System.out.println("Ingresar sueldo basico del empleado: ");
                   sueldoBasico = Double.parseDouble(teclado.readLine());
                   System.out.println("Ingresar anio de ingreso: ");
                   anioIngreso = Integer.parseInt(teclado.readLine());
                   Empleado unEmpleado = new Empleado(cuil, apellidoEmpleado, nombreEmpleado, sueldoBasico, anioIngreso);    
                   listaEmpleados.add(unEmpleado);
                   System.out.println("Desea seguir ingresando datos de empleados? (s/n)");
                   continuar = teclado.readLine().charAt(0);
                   System.out.println("---------------------------------------------------------------");
               }
            }
    }
    Banco unBanco = new Banco(nombreBanco, new Localidad(localidad, provincia), nroSucursal, listaEmpleados);
    unBanco.mostrar();
    unBanco.quitarEmpleado(unBanco.getEmpleados().get(unBanco.getEmpleados().size() - 1));
    unBanco.mostrar();
    
    Banco unBanco2 = new Banco(nombreBanco, new Localidad(localidad, provincia), nroSucursal, listaEmpleados, listaCuentas);
    unBanco2.agregarCuentaBancaria(new CuentaBancaria(52, new Persona(41231, "Malkova", "Juancin", 1998), 0));
    unBanco2.mostrarResumen();       
    unBanco2.quitarCuentaBancaria(unBanco2.getCuentas().get(unBanco2.getCuentas().size() - 1));
    
        
   }
}

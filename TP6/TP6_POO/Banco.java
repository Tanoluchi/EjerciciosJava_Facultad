import java.util.*;

/**
 * Clase Banco ejecutable para probar la clase CuentaBancaria
 * 
 * @author Valenzuela Luciano Juan Ignacio 
 */
public class Banco
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Calendar fecha = Calendar.getInstance();
        int nroDni, anioNacimiento, nroCuenta, opcion;
        String nombre, apellido;
        double saldo;
        char continuar = 's';
        
        while(continuar != 'n' && continuar != 'N'){
            System.out.println("Ingresar datos de (1- Cuenta Corriente, 2- Caja de Ahorro): ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if(opcion == 1){
                System.out.println("Ingrese datos para una cuenta corriente");
                System.out.println("Nombre: ");
                nombre = teclado.nextLine();
                System.out.println("Apellido: ");
                apellido = teclado.nextLine();
                System.out.println("Numero de DNI: ");
                nroDni = teclado.nextInt();
                System.out.println("Año de Nacimiento: ");
                anioNacimiento = teclado.nextInt();
                System.out.println("Numero de Cuenta: ");
                nroCuenta = teclado.nextInt();
                System.out.println("Saldo: ");
                saldo = teclado.nextDouble();
                
                Persona unaPersona = new Persona(nroDni, nombre, apellido, anioNacimiento);
                CuentaBancaria unaCuenta = new CuentaCorriente(nroCuenta, unaPersona, saldo);
                
                System.out.println("Desea realizar alguna operacion? (S/N)");
                continuar = (teclado.next()).charAt(0);
                while(continuar != 'n' && continuar != 'N'){
                    System.out.println("\nOperaciones disponibles:");
                    System.out.println("1- Depositar, 2- Extraer, 3- Mostrar informacion");
                    opcion = teclado.nextInt();
                    if(opcion == 1){
                        System.out.println("\nIngrese el monto a depositar: ");
                        saldo = teclado.nextDouble();
                        unaCuenta.depositar(saldo);
                        System.out.println("Desea realizar otra operacion? (S/N)");
                        continuar = (teclado.next()).charAt(0);
                    }else if(opcion == 2){
                        System.out.println("\nIngrese el monto a extraer: ");
                        saldo = teclado.nextDouble();
                        if(unaCuenta.extraer(saldo)){
                            unaCuenta.extraccion(saldo);
                        }else{
                            System.out.println(unaCuenta.xQNoPuedeExtraer(saldo));
                        }
                        System.out.println("Desea realizar otra operacion? (S/N)");
                        continuar = (teclado.next()).charAt(0);
                    }else if(opcion == 3){
                         unaCuenta.mostrar();
                         System.out.println("Desea realizar otra operacion? (S/N)");
                        continuar = (teclado.next()).charAt(0);
                    }else{
                        System.out.println("No se ha encontrado esa opcion, intentalo de nuevo!");
                    }
                }
                System.out.println("Desea seguir ingresando datos de cuentas? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else if(opcion == 2){
                System.out.println("Ingrese datos para una cuenta corriente");
                System.out.println("Nombre: ");
                nombre = teclado.nextLine();
                System.out.println("Apellido: ");
                apellido = teclado.nextLine();
                System.out.println("Numero de DNI: ");
                nroDni = teclado.nextInt();
                System.out.println("Año de Nacimiento: ");
                anioNacimiento = teclado.nextInt();
                System.out.println("Numero de Cuenta: ");
                nroCuenta = teclado.nextInt();
                System.out.println("Saldo: ");
                saldo = teclado.nextDouble();
                
                Persona unaPersona = new Persona(nroDni, nombre, apellido, anioNacimiento);
                CuentaBancaria unaCuenta = new CajaDeAhorro(nroCuenta, unaPersona, saldo);
                
                System.out.println("Desea realizar alguna operacion? (S/N)");
                continuar = (teclado.next()).charAt(0);
                while(continuar != 'n' && continuar != 'N'){
                    System.out.println("\nOperaciones disponibles:");
                    System.out.println("1- Depositar, 2- Extraer, 3- Mostrar informacion");
                    opcion = teclado.nextInt();
                    if(opcion == 1){
                        System.out.println("\nIngrese el monto a depositar: ");
                        saldo = teclado.nextDouble();
                        unaCuenta.depositar(saldo);
                        System.out.println("Desea realizar otra operacion? (S/N)");
                        continuar = (teclado.next()).charAt(0);
                    }else if(opcion == 2){
                        System.out.println("\nIngrese el monto a extraer: ");
                        saldo = teclado.nextDouble();
                        if(unaCuenta.extraer(saldo)){
                            unaCuenta.extraccion(saldo);
                        }else{
                            System.out.println(unaCuenta.xQNoPuedeExtraer(saldo));
                        }
                        System.out.println("Desea realizar otra operacion? (S/N)");
                        continuar = (teclado.next()).charAt(0);
                    }else if(opcion == 3){
                         unaCuenta.mostrar();
                         System.out.println("Desea realizar otra operacion? (S/N)");
                         continuar = (teclado.next()).charAt(0);
                    }else{
                        System.out.println("No se ha encontrado esa opcion, intentalo de nuevo!");
                    }
                }
                System.out.println("Desea seguir ingresando datos de cuentas? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else{
                System.out.println("Lo siento no se ha encontrado esa opcion, intentalo de nuevo!");
            }
        }
        System.out.println("Se ha finalizado el programa!!");
    }
}

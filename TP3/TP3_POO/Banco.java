import java.util.*;
/**
 * Clase Banco realiza una instancia de los objetos CuentaCorriente y CajaDeAhorro y luego realiza depositos y extracciones.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class Banco
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Calendar fecha = Calendar.getInstance();
        int nroDni, anioNacimiento, nroCuenta;
        String nombre, apellido;
        double saldo;
        
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
        
        CuentaCorriente unaCuentaCorriente = new CuentaCorriente(nroCuenta, new Persona(nroDni, nombre, apellido, anioNacimiento), saldo);
        
        unaCuentaCorriente.mostrar();
        unaCuentaCorriente.depositar(1000);
        unaCuentaCorriente.extraer(3000);
        unaCuentaCorriente.mostrar();
        unaCuentaCorriente.extraer(250);
        unaCuentaCorriente.mostrar();
        
        System.out.println("\nIngrese datos para una caja de ahorro");
        System.out.println("Nombre: ");
        nombre = teclado.next();
        System.out.println("Apellido: ");
        apellido = teclado.next();
        System.out.println("Numero de DNI: ");
        nroDni = teclado.nextInt();
        System.out.println("Año de Nacimiento: ");
        anioNacimiento = teclado.nextInt();
        System.out.println("Numero de Cuenta: ");
        nroCuenta = teclado.nextInt();
        System.out.println("Saldo: ");
        saldo = teclado.nextDouble();
        
        CajaDeAhorro unaCajaAhorro = new CajaDeAhorro(nroCuenta, new Persona(nroDni, nombre, apellido, anioNacimiento), saldo);
        
        unaCajaAhorro.mostrar();
        unaCajaAhorro.depositar(300);
        unaCajaAhorro.mostrar();
        for(int i = 0; i <= 10; i++){
            unaCajaAhorro.extraer(50);
        }
        unaCajaAhorro.mostrar();
        
        fecha.set(2001, 8, 30);
        CuentaCorriente otraCuentaCorriente = new CuentaCorriente(3456, new Persona(43346145, "Luciano", "Valenzuela", fecha));
        
        otraCuentaCorriente.mostrar();
        System.out.println("Mes de Nacimiento: " + otraCuentaCorriente.getTitular().getFechaNacimiento().get(Calendar.MONTH));
        if(unaCuentaCorriente.getTitular().esCumpleaños()){
            System.out.println("Le deseamos un Feliz Cumpleaños!!");
        }
    }
}

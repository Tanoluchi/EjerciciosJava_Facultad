
/**
 * Clase CrearCuentaBancaria es un ejecutable para probar la clase CuentaBancaria
 * 
 * @author Valenzuela Luciano 
 * @version (a version number or a date)
 */
public class CrearCuentaBancaria
{
    public static void main(String[] args){
        int nroCuenta = Integer.valueOf(args[0]);
        double saldo = Double.valueOf(args[1]);
        
        CuentaBancaria unaCuenta = new CuentaBancaria(nroCuenta, new Persona(43346145, "Luciano", "Valenzuela", 2001), saldo);
        
        unaCuenta.mostrar();
        unaCuenta.depositar(250);
        System.out.println(unaCuenta.toString());
        unaCuenta.extraer(100);
        System.out.println(unaCuenta.toString());
        unaCuenta.mostrar();
    }
}

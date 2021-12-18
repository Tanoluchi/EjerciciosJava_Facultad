import java.util.*;
/**
 * Clase Banco agrega y quita Empleados, tambien agrega o quita cuentas bancarias y muestra por pantalla datos importantes de los Empleados o Cuentas.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 * @version 9/2021
 */
public class Banco
{
   private String nombre;
   private int nroSucursal;
   private Localidad localidad;
   private ArrayList<Empleado> empleados;
   private ArrayList<CuentaBancaria> cuentasBancarias;
   /**
    * Constructor Sobrecargado
    * @param String nombre, Localidad localidad, int nroSucursal, Empleado empleado
    */
   public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado){
       this.setNombre(p_nombre);
       this.setLocalidad(p_localidad);
       this.setNroSucursal(p_nroSucursal);
       this.setEmpleados(new ArrayList());
       this.agregarEmpleado(p_empleado);
       this.setCuentas(new ArrayList());
   }
   /**
    * @param String nombre, Localidad localidad, int nroSucursal, ArrayList empleados
    */
   public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleados){
       this.setNombre(p_nombre);
       this.setLocalidad(p_localidad);
       this.setNroSucursal(p_nroSucursal);
       this.setEmpleados(p_empleados);
       this.setCuentas(new ArrayList());
   }
   /**
    * @param String nombre, Localidad localidad, int nroSucursal, ArrayList empleados, ArrayList cuentas
    */
   public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleados, ArrayList p_cuentas){
       this.setNombre(p_nombre);
       this.setLocalidad(p_localidad);
       this.setNroSucursal(p_nroSucursal);
       this.setEmpleados(p_empleados);
       this.setCuentas(p_cuentas);
   }
   /**
    * Setters
    */
   private void setNombre(String p_nombre){
       this.nombre = p_nombre;
   }
   private void setLocalidad(Localidad p_localidad){
       this.localidad = p_localidad;
   }
   private void setNroSucursal(int p_nroSucursal){
       this.nroSucursal = p_nroSucursal;
   }
   private void setEmpleados(ArrayList<Empleado> p_empleados){
       this.empleados = p_empleados;
   }
   private void setCuentas(ArrayList<CuentaBancaria> p_cuentas){
       this.cuentasBancarias = p_cuentas;
   }
   /**
    * Getters
    */
   public String getNombre(){
       return this.nombre;
   }
   public Localidad getLocalidad(){
       return this.localidad;
   }
   public int getNroSucursal(){
       return this.nroSucursal;
   }
   public ArrayList<Empleado> getEmpleados(){
       return this.empleados;
   }
   public ArrayList<CuentaBancaria> getCuentas(){
       return this.cuentasBancarias;
   }
   /**
    * Agrega un empleado a la coleccion empleados 
    * @param Empleado empleado
    * @return True(si lograr agregar al empleado), False caso contrario
    */
   public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
   }
   /**
    * Quita a un empleado de la coleccion empleados
    * @param Empleado empleado
    * @return True(si logra quitar al empleado de la coleccion), False caso contrario
    */
   public boolean quitarEmpleado(Empleado p_empleado){
       return this.getEmpleados().remove(p_empleado);
   }
   public void listarSueldos(){
        for(Empleado e: this.getEmpleados()){
           e.mostrarLinea();
        }
   }
   /**
    * Suma los sueldos netos de cada empleado y lo devuelve
    * @return El total de los sueldos netos
    */
   public double sueldosAPagar(){
       double total = 0.0;
       for(Empleado e: this.getEmpleados()){
           total += e.sueldoNeto();
        }
       return total;
   }
   public void mostrar(){
       /*
        * Banco: RIO Sucursal: 3
        Localidad: Corrientes Provincia: Corrientes
        27267504235 Perez, Lorena, ------------------------------------------------$1212.0
        20159462638 Dominguez, Pedro -------------------------------------------$2650.4
        Total a Pagar-------------------------------------------------------------------$3862.4
        */
       System.out.println("Banco: " + this.getNombre() + "\tSucursal: " + this.getNroSucursal());
       System.out.println("Localidad: " + this.getLocalidad().getNombre() + "\tProvincia: " + this.getLocalidad().getProvincia());
       this.listarSueldos();
       System.out.println("Total a Pagar: " + this.sueldosAPagar());
       System.out.println("-------------------------------------------------------------------------------------------");
   }
   /**
    * Agrega una cuenta bancaria a la coleccion de cuentasBancarias
    * @param CuentaBancaria cuenta
    * @return True (si logra agregar la cuenta), False caso contrario.
    */
   public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentas().add(p_cuenta); 
   }
   /**
    * Quita una cuenta bancaria de la coleccion de cuentasBancarias
    * @param CuentaBancaria cuenta
    * @return True(si logra quitar la cuenta), False caso contrario.
    */
   public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentas().remove(p_cuenta); 
   }
   /**
    * Muestra por pantalla los datos de las cuentas que contienen saldo cero.
    */
   private void mostrarSaldoCero(){
       for(CuentaBancaria x: this.getCuentas()){
           if(x.getSaldo() <= 0){
               System.out.println(x.toString());
           }
        }
   }
   /**
    * 
    * @return cantidad de cuentas con saldo activo (Cuentas con saldo mayor a 0).
    */
   private int cuentasSaldoActivo(){
       int contador = 0;
       for(CuentaBancaria x: this.getCuentas()){
           if(x.getSaldo() > 0){
               contador += 1;
           }
        }
       return contador;
   }
   /**
    * @return El total de cuentas registradas
    */
   private int totalCuentas(){
       return this.getCuentas().size();
   }
   public void mostrarResumen(){
       /*
        * Banco: Rio - Sucursal: 3
        Localidad: Saladas Provincia: Corrientes
        ************************************************************
        RESUMEN DE CUENTAS BANCARIAS
        ************************************************************
        Número total de Cuentas Bancarias: 2510
        Cuentas Activas: 2352
        Cuentas Saldo Cero: 158.
        -------------------------------------------------------------------------------------------
        Titulares con Cuenta en Saldo Cero
        ------------------------------------------------------------------------------------------
        14526387 Gomez, Marisa Esther
        23145698 Villalba, Martín 
        ------------------------------------------------------------------------------------------
        * 
        */
       
       System.out.println("Banco: " + this.getNombre() + "\tSucursal: " + this.getNroSucursal());
       System.out.println("Localidad: " + this.getLocalidad().getNombre() + "\tProvincia: " + this.getLocalidad().getProvincia());
       System.out.println("************************************************************");
       System.out.println("RESUMEN DE CUENTAS BANCARIAS");
       System.out.println("************************************************************");
       System.out.println("Numero total de Cuentas Bancarias: " + this.totalCuentas());
       System.out.println("Cuentas Activas: " + this.cuentasSaldoActivo());
       System.out.println("Cuentas Saldo Cero: " + (this.totalCuentas() - this.cuentasSaldoActivo()));
       System.out.println("-------------------------------------------------------------------------------------------");
       System.out.println("Titulares con Cuenta en Saldo Cero");
       System.out.println("-------------------------------------------------------------------------------------------");
       mostrarSaldoCero();
       System.out.println("-------------------------------------------------------------------------------------------");
   }
}

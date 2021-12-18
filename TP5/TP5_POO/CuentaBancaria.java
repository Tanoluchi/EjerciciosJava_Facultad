
import java.util.*;
/**
 * Clase CuentaBancaria realiza la operacion de depositar, extraer y por ultimo muestra por pantalla la informacion del titular y el saldo de la cuenta.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class CuentaBancaria
{
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    /**
     * Constructor sobrecargado
     * @param int nroCuenta, Persona titular (variable de instancia)
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(0.0);
    }
    /**
     * Constructo sobrecargado
     * @param int nroCuenta, Persona titular (variable de instancia), double saldo
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(p_saldo);
    }
    /**
     * Setters
     */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    /**
     * Getters
     */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    public Persona getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }
    /**
     * Realiza un deposito en la cuenta con el monto pasado por parametro.
     * @param double importe
     * @return Devuelve el saldo actual
     */
    public double depositar(double p_importe){
        this.setSaldo(getSaldo() + p_importe);
        return getSaldo();
    }
    /**
     * Realiza una extraccion en la cuenta del usuario con el monto pasado por parametro.
     * @param double importe
     * @return Devuelve el saldo actual
     */
    public double extraer(double p_importe){
        this.setSaldo(getSaldo() - p_importe);
        return getSaldo();
    }
    public void mostrar(){
        System.out.println("- Cuenta Bancaria -");
        System.out.println("Titular: " + this.getTitular().nomYApe() + " (" + this.getTitular().edad() + ")");
        System.out.println("Saldo: " + this.getSaldo());
    }
    /**
     * @return datos de la cuenta del titular (variable de instancia).
     */
    public String toString(){
        return (this.getNroCuenta() + "\t" + this.getTitular().nomYApe() + "\t" + this.getSaldo());
    }
}
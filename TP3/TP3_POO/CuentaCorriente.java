
/**
 * La clase CuentaCorriente realiza extraccion o depositos de un monto especifico, y muestra por pantalla la información de la cuenta.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class CuentaCorriente
{
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;
    
    /**
     * Constructor (sobrecargado)
     * @param int nroCuenta, Persona titular (variable de instancia)
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(0);
        setLimiteDescubierto(500);
    } 
    /**
     * Constructor sobrecargado
     * @param int nroCuenta, Persona titular, double saldo
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(p_saldo);
        setLimiteDescubierto(500);
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
    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
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
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    /**
     * Realiza una verificacion de si el saldo + el limite descubierto es mayor o igual al monto pasado por parametro
     * devuelve true (puede extraer), caso contrario devuelve false (no puede extraer).
     * @param double importe
     * @return true o false
     */
    private boolean puedeExtraer(double p_importe){
        if((getSaldo() + getLimiteDescubierto()) >= p_importe){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Asigna el nuevo el nuevo saldo y muestra por pantalla una leyenda si se realizo con exito la extraccion
     * @param double importe
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        System.out.println("Se ha realizado con exito la extraccion");
    }
    /**
     * Verifica si puede extraer (manda un mensaje con su firma al metodo puedeExtraer), si se puede extraer manda un mensaje con su firma al metodo
     * extraccion(), caso contrario imprime por pantalla la leyenda de que sobrepasa el limite de descubierto.
     * @param importe
     */
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
            this.extraccion(p_importe);
        }else{
            System.out.println("El importe de extraccion sobrepasa el límite de descubierto!");
        }
    }
    /**
     * Realiza la asignacion (agrega) del nuevo saldo.
     * @param double importe
     */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    public void mostrar(){
        System.out.println("---- Cuenta Corriente ----");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + "\t - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
}

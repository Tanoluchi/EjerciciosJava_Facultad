
/**
 * La clase CuentaCorriente realiza la operacion de verificar si puede extraer, si no puede manda un mensaje de por que no puede extraer y 
 * un metodo para poder autorizar la extraccion.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class CuentaCorriente extends CuentaBancaria
{
    private double limiteDescubierto;
    /**
     * Constructor (sobrecargado)
     * @param int nroCuenta, Persona titular (variable de instancia)
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, p_titular);
        this.setLimiteDescubierto(500);
    } 
    /**
     * Constructor sobrecargado
     * @param int nroCuenta, Persona titular, double saldo
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta, p_titular, p_saldo);
        setLimiteDescubierto(500);
    }
    /**
     * Setters
     */
    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
    }
    /**
     * Getters
     */
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
        if((this.getSaldo() + this.getLimiteDescubierto()) >= p_importe){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Realiza una verificacion, manda un mensaje al metodo puedeExtraer y le pasa por parametro el importe, esta si devuelve true entonces
     * el metodo retornara true autorizando la extraccion. Caso contrario devuelve false
     * @param importe
     * @return true o false
     */
    protected boolean extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
            return true;
        }else{
            return false;
        }
    }
    /**
     * @param double importe
     * @return mensaje de por que no puede extraer
     */
    public String xQNoPuedeExtraer(double p_importe){
        return "El importe de extraccion sobrepasa el límite de descubierto!";
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("---- Cuenta Corriente ----");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + "\t - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
       
}
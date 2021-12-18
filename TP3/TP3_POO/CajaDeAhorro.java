
/**
 * Clase CuentaCorriente realiza la operacion de extraer, depositar y por ultimo muestra por pantalla informacion de la cuenta.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class CajaDeAhorro{
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    /**
     * Constructor sobrecargado
     * @param int nroCuenta, Persona titular (variable de instancia)
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(0);
        setExtraccionesPosibles(10);
    } 
    /**
     * Constructor sobrecargado
     * @param int nroCuenta, Persona titular, double saldo
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(p_saldo);
        setExtraccionesPosibles(10);
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
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
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
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
     /**
     * Realiza una verificacion de si el saldo + el limite descubierto es mayor o igual al monto pasado por parametro
     * devuelve true (puede extraer), caso contrario devuelve false (no puede extraer).
     * @param double importe
     * @return true o false
     */
    private boolean puedeExtraer(double p_importe){
        if(this.getSaldo() > p_importe){
            if(this.getExtraccionesPosibles() > 0){
                return true;    
            }
        }
            return false;
        }
    /**
     * Asigna el nuevo saldo despues de la extraccion(resta el monto pasado por parametro), y descuenta uno a extracciones posibles.
     * @param double importe
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    /**
     * Realiza una verificacion, si puede extraer manda un mensaje con su firma al metodo extraccion y luego imprime por pantalla que la extraccion se 
     * realizo con exito, caso contrario emite una leyenda de por que no puede extraer.
     */
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
            this.extraccion(p_importe);
            System.out.println("La extracción se ha realizado con exito");
        }else{
            if(this.getSaldo() < p_importe){
                System.out.println("No puede extraer mas que el saldo!");
            }else{
                System.out.println("No tiene habilitadas mas extracciones!");
            }
        }
    }
    /**
     * Asigna el nuevo saldo (agrega el monto pasado por parametro al saldo actual).
     * @param double importe
     */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    public void mostrar(){
        System.out.println("---- Caja de Ahorro ----");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones Posibles: " + this.getExtraccionesPosibles());
    }
}


/**
 * Clase CajaDeAhorro realiza la operacion de verificar si puede extraer, si no puede manda un mensaje de por que no puede extraer y 
 * un metodo para poder autorizar la extraccion.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class CajaDeAhorro extends CuentaBancaria{
    private int extraccionesPosibles;
    /**
     * Constructor sobrecargado
     * @param int nroCuenta, Persona titular (variable de instancia)
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, p_titular);
        this.setExtraccionesPosibles(10);
    } 
    /**
     * Constructor sobrecargado
     * @param int nroCuenta, Persona titular, double saldo
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta, p_titular, p_saldo);
        this.setExtraccionesPosibles(10);
    }
    /**
     * Setters
     */
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
    }
    /**
     * Getters
     */
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
        if(this.getSaldo() >= p_importe && this.getExtraccionesPosibles() > 0){
            return true;    
        }else{
            return false;
        }
    }
    /**
     * Metodo que realiza una verificacion, manda un mensaje al metodo puedeExtraer y le pasa por parametro el importe, si el metodo
     * devuelve true, entonces le quitamos uno a las extracciones posibles del usuario y se devuelve true (se realiza la extraccion).
     * Caso contrario devuelve false (no se puede realizar la extraccion).
     * @param double importe
     * @return true o false
     */
    protected boolean extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
            this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
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
        if(this.getSaldo() < p_importe){
                return "No puede extraer mas que el saldo!";
        }else{
                return "No tiene habilitadas mas extracciones!";
        }
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("---- Caja de Ahorro ----");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones Posibles: " + this.getExtraccionesPosibles());
    }
}

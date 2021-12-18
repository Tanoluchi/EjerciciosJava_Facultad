
/**
 * Clase Heladera imprime por pantalla las caracteristicas de una heladera y calcula el adicional.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Heladera extends ArtefactoHogar
{
    private int pies;
    private int puertas;
    private boolean compresor;
    /**
     * Constructor 
     * Stirng marca, float precio, int stock, int pies, int puertas, boolean compresor
     */
    public Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_compresor){
        super(p_marca, p_precio, p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_compresor);
    }
    /**
     * Setters
     */
    private void setPies(int p_pies){
        this.pies = p_pies;
    }
    private void setPuertas(int p_puertas){
        this.puertas = p_puertas;
    }
    private void setCompresor(boolean p_compresor){
        this.compresor = p_compresor;
    }
    /**
     * Getters
     */
    public int getPies(){
        return this.pies;
    }
    public int getPuertas(){
        return this.puertas;
    }
    public boolean getCompresor(){
        return this.compresor;
    }
    public void imprimir(){
        /*Marca: Gafa - Precio: 1200.0 - Stock: 8
        Pies: 11
        Puertas: 2
        Compresor: Si
         * 
         */
        System.out.println("**** Heladera ****");
        super.imprimir();
        System.out.println("Pies: " + this.getPies());
        System.out.println("Puertas: " + this.getPuertas());
        if(!this.getCompresor()){
            System.out.println("Compresor: No");
        }else{
             System.out.println("Compresor: Si");
        }
    }
    /**
     * Calcula el adicional del valor de las cuotas al socilitar un credito.
     * @param int cuotas, float interes
     * @return adicional
     */
    public float creditoConAdicional(int p_cuotas, float p_interes){
        if(!this.getCompresor()){
            return super.cuotaCredito(p_cuotas, p_interes);
        }else{
            return super.cuotaCredito(p_cuotas, p_interes) + 50;
        }
    }
}

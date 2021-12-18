
/**
 * Clase Lavarropas imprime por pantalla las caracteristicas de un lavarropas y calcula el adicional.
 * 
 * @author Valenzuela Luciano Juan Ignacio 
 */
public class Lavarropas extends ArtefactoHogar
{
    private int programas;
    private float kilos;
    private boolean automatico;
    /**
     * Constructor
     * @param String marca, float precio, int stock, int programas, float kilos, boolean automatico
     */
    public Lavarropas(String p_marca, float p_precio, int p_stock, int p_programas, float p_kilos, boolean p_automatico){
        super(p_marca, p_precio, p_stock);
        this.setProgramas(p_programas);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
    }
    /**
     * Setters
     */
    private void setProgramas(int p_programas){
        this.programas = p_programas;
    }
    private void setKilos(float p_kilos){
        this.kilos = p_kilos;
    }
    private void setAutomatico(boolean p_automatico){
        this.automatico = p_automatico;
    }
    /**
     * Getters
     */
    public int getProgramas(){
        return this.programas;
    }
    public float getKilos(){
        return this.kilos;
    }
    public boolean getAutomatico(){
        return this.automatico;
    }
    public void imprimir(){
        System.out.println("**** Lavarropas ****");
       super.imprimir();
       System.out.println("Programas: " + this.getProgramas());
       System.out.println("Kilos: " + this.getKilos() + "kg");
       if(!this.getAutomatico()){
           System.out.println("Automatico: No");
       }else{
           System.out.println("Automatico: Si");
       }
    }
    /**
     * Calcula el adicional del valor de las cuotas al pedir un credito
     * @param int cuotas, float interes
     * @return adicional
     */
    public float creditoConAdicional(int p_cuotas, float p_interes){
        float descuento = 0.0F;
        float total = 0.0F;
        if(!this.getAutomatico()){
            total = super.cuotaCredito(p_cuotas, p_interes);
            descuento = (2 * total) / 100;
            total -= descuento;
            return total;
        }else{
            return super.cuotaCredito(p_cuotas, p_interes);
        }
    }
}

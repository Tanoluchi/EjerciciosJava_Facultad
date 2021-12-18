
/**
 * Clase Cocina imprime por pantalla las caracteristicas de una cocina y calcula la cuotas de credito adicional.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Cocina extends ArtefactoHogar
{
   private int hornallas;
   private int calorias;
   private String dimensiones;
   /**
    * Constructor
    * @param String marca, float precio, int stock, int hornallas, int calorias, String dimensiones
    */
   public Cocina(String p_marca, float p_precio, int p_stock, int p_hornallas, int p_calorias, String p_dimensiones){
       super(p_marca, p_precio, p_stock);
       this.setHornallas(p_hornallas);
       this.setCalorias(p_calorias);
       this.setDimensiones(p_dimensiones);
   }
   /**
    * Setters
    */
   private void setHornallas(int p_hornallas){
       this.hornallas = p_hornallas;
   }
   private void setCalorias(int p_calorias){
       this.calorias = p_calorias;
   }
   private void setDimensiones(String p_dimensiones){
       this.dimensiones = p_dimensiones;
   }
   /**
    * Getters
    */
   public int getHornallas(){
       return this.hornallas;
   }
   public int getCalorias(){
       return this.calorias;
   }
   public String getDimensiones(){
       return this.dimensiones;
   }
   public void imprimir(){
       /*
        * **** Cocina ****
        Marca: Volcan - Precio: 600.0 - Stock: 15
        Hornallas: 4
        Calorias: 2000
        Dimensiones: 80*60*60cm
        Cuotas: 6 - Interes: 2.53%
        Valor Cuota: 115.18
        Valor Cuota Con Adicionales: 115.18
        */
       System.out.println("**** Cocina ****");
       super.imprimir();
       System.out.println("Hornallas: " + this.getHornallas() + "\nCalorias: " + this.getCalorias() + "\nDimensiones: " + this.getDimensiones());
   }
   /**
    * Se manda un mensaje al metodo cuotaCredito de la clase padre para calcular el credito.
    * @param int cuotas, interes
    * @return credito con adicional
    */
   public float creditoConAdicional(int p_cuotas, float p_interes){
       return super.cuotaCredito(p_cuotas, p_interes);
   }
}

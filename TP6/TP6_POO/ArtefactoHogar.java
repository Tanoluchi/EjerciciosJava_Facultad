
/**
 * Clase ArtefactoHogar imprime por pantalla las caracteristicas principales de un artefacto del hogar, calcula el valor de las cuotas 
 * cuando se solicite un credito.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public abstract class ArtefactoHogar
{
    private String marca;
    private float precio;
    private int stock;
    /**
     * Constructor
     * @param String marca, float precio, int stock
     */
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock){
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }
    /**
     * Setters
     */
    private void setMarca(String p_marca){
        this.marca = p_marca;
    }
    private void setPrecio(float p_precio){
        this.precio = p_precio;
    }
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    /**
     * Getters
     */
    public String getMarca(){
        return this.marca;
    }
    public float getPrecio(){
        return this.precio;
    }
    public int getStock(){
        return this.stock;
    }
    public void imprimir(){
        /*
         * Marca: Volcan - Precio: 600.0 - Stock: 15
         */
        System.out.println("Marca: " + this.getMarca() + " - Precio: " + this.getPrecio() + " - Stock: " + this.getStock());
    }
    /**
     * Calcula el valor de la cuota al socilitar un credito.
     * @param int cuotas, float interes
     * @return valor de la cuota
     */
    public float cuotaCredito(int p_cuotas, float p_interes){
        float porcentaje = (p_interes * this.getPrecio()) / 100;
        return (this.getPrecio() + (p_cuotas * porcentaje)) / p_cuotas;
    }
    /**
     * @param int cuotas, float interes
     * @return el adicional al valor de las cuotas
     */
    public abstract float creditoConAdicional(int p_cuotas, float p_interes);
}

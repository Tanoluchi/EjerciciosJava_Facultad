
/**
 * Clase Producto muestra por pantalla las caracteristicas de un laboratorio que comercia con una drogueria y tambien de un producto especifico.
 * Realiza ajustes en el stock del producto y calcula sus precios.
 * 
 * @author Valenzuela Luciano 
 * @version 09/2021
 */
public class Producto
{
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;
    
    /**
     * Clase Constructor (sobrecargado).
     * @param int codigo, String rubro, String descripcion, double costo, double puntoDeReposicion, int existeMinima, Laboratorio laboratorio
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima, Laboratorio p_laboratorio){
        this.setCodigo(p_codigo);
        this.setDesc(p_desc);
        this.setRubro(p_rubro);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_laboratorio);
        this.setStock(0);
    } 
    /**
     * @param int codigo, String rubro, String descripcion, double costo, Laboratorio laboratorio
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_laboratorio){
        this.setCodigo(p_codigo);
        this.setDesc(p_desc);
        this.setRubro(p_rubro);
        this.setCosto(p_costo);
        this.setLaboratorio(p_laboratorio);
        this.setPorcPtoRepo(0);
        this.setExistMinima(0);
        this.setStock(0);
    }
    /**
     * Setters
     */
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    private void setDesc(String p_desc){
        this.descripcion = p_desc;
    }
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    private void setLaboratorio(Laboratorio p_laboratorio){
        this.laboratorio = p_laboratorio;
    }
    /**
     * Getters
     */
    public int getCodigo(){
        return this.codigo;
    }
    public String getRubro(){
        return this.rubro;
    }
    public String getDesc(){
        return this.descripcion;
    }
    public double getCosto(){
        return this.costo;
    }
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
    public int getExistMinima(){
        return this.existMinima;
    }
    public int getStock(){
        return this.stock;
    }
    public Laboratorio getLaboratorio(){
        return this.laboratorio;
    }
    // Métodos
    /**
     * Modifica el stock(agrega o quita).
     * @param int cantidad
     */
    public void ajuste(int p_cantidad){
        this.setStock(this.getStock() + p_cantidad);
    }
    /**
     * Multiplica el stock por el precio de costo, más una rentabilidad de 12%
     * @return el stock valorizado
     */
    public double stockValorizado(){
        return (this.getStock() * this.getCosto() + ((12 * this.getCosto()) / 100));
    }
    /**
     * Agrega un 12% al precio de costo.
     * @return precio de lista.
     */
    public double precioLista(){
         return (12 * this.getCosto()) / 100;
    }
    /**
     * Se calcula el precio contado restando un %5 al precio de lista
     * @return valor que representa el precio por pago al contado.
     */
    public double precioContado(){
        return (this.precioLista() - ((5 * this.precioLista()) / 100));
    }
    /**
     * return descripcion, precio de lista y precio al contado.
     */
    public String mostrarLinea(){
        return (this.getDesc() + "\t " + this.precioLista() + "\t " + this.precioContado());
    }
    /**
     * Modifica el porcentaje de punto de reposicion.
     * @param punto de reposicion.
     */
    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce);
    }
    /**
     * Modifica el existe minima
     * @param cantidad
     */
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
    public void mostrar(){
        System.out.println("Laboratorio: " + this.getLaboratorio().getNombre());
        System.out.println("Domicilio: " + this.getLaboratorio().getDomicilio() + " - " + this.getLaboratorio().getTelefono());
        System.out.println("\nRubro: " + this.getRubro());
        System.out.println("Descripcion: " + this.getDesc());
        System.out.println("Precio Costo: " + this.getCosto());
        System.out.println("Stock: " + this.getStock() + " - " + "Stock Valorizado: " + "$" + this.stockValorizado());
    }
}
import java.util.*;
/**
 * Clase Pedido obtiene el total del precio al contado, el total del precio a lista, agrega o quita un producto y muestra por pantalla los datos del pedido.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 * @version 9/2021
 */
public class Pedido
{
   private Calendar fecha;
   private Cliente cliente;
   private ArrayList<Producto>productos;
   
   /**
    * Constructor sobrecargado
    * @param Calendar fecha, Cliente cliente, ArrayList productos
    */
   public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList p_productos){
       this.setFecha(p_fecha);
       this.setCliente(p_cliente);
       this.setProductos(p_productos);
   }
   /**
    * @param Calendar fecha, Cliente cliente, Producto producto
    */
   public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
       this.setFecha(p_fecha);
       this.setCliente(p_cliente);
       this.setProductos(new ArrayList());
       this.agregarProducto(p_producto);
   }
   /**
    * Setters
    */
   private void setFecha(Calendar p_fecha){
       this.fecha = p_fecha;
   }
   private void setCliente(Cliente p_cliente){
       this.cliente = p_cliente;
   }
   private void setProductos(ArrayList<Producto>p_productos){
       this.productos = p_productos;
   }
   /**
    * Getters
    */
   public Calendar getFecha(){
       return this.fecha;
   }
   public Cliente getCliente(){
       return this.cliente;
   }
   public ArrayList<Producto> getProductos(){
       return this.productos;
   }
   /**
    * Realiza la suma de los precios al contado de cada elemento en la coleccion de productos.
    * @return El total al contado.
    */
   public double totalAlContado(){
       double total = 0.0;
       for (int i = 0; i < this.getProductos().size(); i++){
             total += ((Producto)this.getProductos().get(i)).precioContado();
         }
         
       return total;
   }
    /**
     * Realiza la suma de todos los precios de lista de cada elemento de la coleccion de productos.
     * @return El total al precio lista.
     */
   public double totalFinanciado(){
       double total = 0.0;
       for (int i = 0; i < this.getProductos().size(); i++){
             total += ((Producto)this.getProductos().get(i)).precioLista();
         }
         
       return total;
   }
   /**
    * Se agrega un producto a la coleccion.
    * @param Producto producto
    * @return True(si se logro agregar el producto), False caso contrario.
    */
   public boolean agregarProducto(Producto p_producto){
       return this.getProductos().add(p_producto);
   }
   /**
    * Se quita un producto en especifico de la coleccion.
    * @param Producto producto
    * @return True(si se logro quitar el producto), False caso contrario.
    */
   public boolean quitarProducto(Producto p_producto){
       return this.getProductos().remove(p_producto);
   }
   public void mostrarPedido(){
       String MES[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
       System.out.println("***** Detalle del pedido ***** \t Fecha: " + this.getFecha().get(Calendar.DATE) + " de " + MES[this.getFecha().get(Calendar.MONTH)] + " del " + this.getFecha().get(Calendar.YEAR));
       System.out.println("Producto\tPrecio Lista\tPrecio Contado"); 
       System.out.println("------------------------------------------------------------------------------------------"); 
       for(Producto p: this.getProductos()){
           System.out.println(p.mostrarLinea());
       System.out.println("------------------------------------------------------------------------------------------");
       System.out.println("***** Total: " + "\t " + this.totalFinanciado() + "\t " + this.totalAlContado());
       System.out.println("------------------------------------------------------------------------------------------");
       }
       
    }
}

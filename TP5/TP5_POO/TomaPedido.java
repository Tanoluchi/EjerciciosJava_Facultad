import java.util.*;
/**
 * TomaPedido Clase ejecutable para probar la clase Pedido.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 * @version 9/2021
 */
public class TomaPedido
{
    public static void main(String[] args){
        Producto producto1 = new Producto(1, "Perfumeria", "Jabon Deluxe", 30.25, new Laboratorio("Farmacia S.A", "Juan Romero 232", "53-123-432-6631"));
        Producto producto2 = new Producto(2, "Lacteos", "Queso Roquefort", 125.82, new Laboratorio("La Queseria S.R.L", "Juan Bautista 342", "54-333-123-4123"));
        Producto producto3 = new Producto(3, "Panificados", "Facturas", 43, new Laboratorio("Medialunas Calentitas", "Manuel Belgrano 123", "54-412-456-1231"));
        Producto producto4 = new Producto(4, "Electronica", "CD-Soda Stereo", 25.2, new Laboratorio("Mundo Musica", "Romerin Titin 351", "32-124-561-123"));
        ArrayList productos = new ArrayList();
        
        Calendar fecha = Calendar.getInstance();
        fecha.set(2019, 8, 30);
        
        Pedido unPedido = new Pedido(fecha, new Cliente(43346145, "Valenzuela", "Luciano", 5000), productos);
        unPedido.agregarProducto(producto1);
        unPedido.agregarProducto(producto2);
        unPedido.mostrarPedido();
        unPedido.agregarProducto(producto3);
        unPedido.agregarProducto(producto4);
        unPedido.mostrarPedido();
        unPedido.quitarProducto(producto2);
        unPedido.quitarProducto(producto4);
        unPedido.mostrarPedido();
    }
}

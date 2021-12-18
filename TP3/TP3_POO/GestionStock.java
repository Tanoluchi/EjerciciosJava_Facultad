/**
 * GestionStock es una clase ejecutable para la clase Producto.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class GestionStock{
        public static void main(String[] args) {
            Producto unProducto = new Producto(123, "Perfumeria", "Jabon Deluxe", 5.25, new Laboratorio("Colgate S.A.", "Scalabrini Ortiz 5524", "54-11-4239-8447"));

            unProducto.ajuste(500);
            unProducto.mostrar();
            // Simulacion de la baja de 200 productos
            unProducto.ajuste(-200);
            unProducto.mostrar();

            System.out.println("Precio Lista: " + unProducto.precioLista() + "\tPrecio Contado: " + unProducto.precioContado());
            unProducto.mostrarLinea();
        }
    }
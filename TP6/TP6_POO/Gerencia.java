import java.util.*;

/**
 * Clase Gerencia agrega o quita alojamientos, cuenta la cantidad de alojamientos alquilados, liquida cada uno de ellos y muestra por pantalla
 * los datos principales de la gerencia y de los alojamientos alquilados.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Gerencia
{
   private String nombre;
   private ArrayList<Alojamiento> alojamientosAlquilados;
   /**
    * Constructor sobrecargado
    * @param String nombre
    */
   public Gerencia(String p_nombre){
       this.setNombre(p_nombre);
       this.setAlojamientosAlq(new ArrayList<Alojamiento>());
   }
   /**
    * Constructor
    * @param String nombre, ArrayList alojamientosAlquilados
    */
   public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientosAlquilados){
       this.setNombre(p_nombre);
       this.setAlojamientosAlq(p_alojamientosAlquilados);
   }
   /**
    * Setters
    */
   private void setNombre(String p_nombre){
       this.nombre = p_nombre;
   }
   private void setAlojamientosAlq(ArrayList<Alojamiento> p_alojamientosAlquilados){
       this.alojamientosAlquilados = p_alojamientosAlquilados;
   }
   /**
    * Getters
    */
   public String getNombre(){
       return this.nombre;
   }
   public ArrayList<Alojamiento> getAlojamientosAlq(){
       return this.alojamientosAlquilados;
   }
   /**
    * Agrega un alojamiento a la coleccion
    * @param Alojamiento alojamiento
    * @return true o false
    */
   public boolean agregarAlojamiento(Alojamiento p_alojamiento){
       return this.getAlojamientosAlq().add(p_alojamiento);
   }
   /**
    * Quita un alojamiento de la coleccion
    * @param Alojamiento alojamiento
    * @return true o false
    */
   public boolean quitarAlojamiento(Alojamiento p_alojamiento){
       return this.getAlojamientosAlq().remove(p_alojamiento);
   }
   /**
    * Se crea una variable temporal que servira como contador, luego una variable booleana. Se realiza un foreach y recorremos la coleccion
    * la variable booleana guardara true (si el nombre del alojamiento contiene el tipo de alojamiento pasado por parametor), si no guardara false.
    * Se hace una verificacion, si nuestra variable booleana guarda un true entonces entra al if y el contador suma en 1.
    * @param String tipoAlojamiento
    * @return cantidad de alojamientos
    */
   public int contarAlojamiento(String tipoAlojamiento){
       int contador = 0;
       boolean contiene = false;
       for(Alojamiento a: this.getAlojamientosAlq()){
           contiene = a.getNombre().contains(tipoAlojamiento);
           if(contiene){
               contador += a.contar(tipoAlojamiento);
           }
       }
       return contador;
   }
   /**
    * Se realiza un foreach y liquidamos todos los alojamientos dentro de la coleccion.
    */
   public void liquidar(){
       for(Alojamiento a: this.getAlojamientosAlq()){
           a.liquidar();
       }
   }
   public void mostrarLiquidacion(){
       /*Gerencia Los Arroyos
        Liquidación-------------------
        Alojamiento: Cabañas La Alondra
        Costo por 5 dias: $1050.0
         alquiler auto: $100.0
         lavanderia: $20.0
         Cabaña con 3 habitaciones 
        Total: ------> $1170.0
        Alojamiento: Hotel Guaraní
        Costo por 7 dias: $630.0
         internet: $5.0
         alquiler auto: $100.0
         Habitacion Single
        Total: ------> $735.0
        Alojamiento tipo Cabaña ---->1
        Alojamiento tipo Hotel ------->1
        * 
        */
       System.out.println("Gerencia " + this.getNombre());
       System.out.println("Liquidación");
       System.out.println("-------------------");
       this.liquidar();
       System.out.println("Alojamiento tipo Cabaña ----> " + this.contarAlojamiento("Cabaña"));
       System.out.println("Alojamiento tipo Hotel -------> " + this.contarAlojamiento("Hotel"));
   }
}

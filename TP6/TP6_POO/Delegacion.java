import java.util.*;

/**
 * Clase Delegacion calcula el precio total de las entradas de todos los integrantes, inscribi o quita a un individuo de la delegacion, lista por fecha
 * y muestra por pantalla las caractesticas de la delegacion y los datos de los integrantes.
 * 
 * @author Valenzuela Luciano Juan Ignacio 
 */
public class Delegacion extends Visitante
{
   private ArrayList<Individuo> integrantes;
   /**
    * Constructor sobrecargado
    * @param String nombre, Calendar fechaVisita, ArrayList individuos
    */
   public Delegacion(String p_nombre, Calendar p_fechaVisita, ArrayList<Individuo> p_individuos){
       super(p_nombre, p_fechaVisita);
       this.setIntegrantes(p_individuos);
   }
   /**
    * Constructor
    * @param String nombre, Calendar fechaVisita, Individuo individuo
    */
   public Delegacion(String p_nombre, Calendar p_fechaVisita, Individuo p_individuo){
       super(p_nombre, p_fechaVisita);
       this.setIntegrantes(new ArrayList<Individuo>());
       this.inscribirIndividuo(p_individuo);
   }
   /**
    * Setters
    */
   private void setIntegrantes(ArrayList<Individuo> p_integrantes){
       this.integrantes = p_integrantes;
   }
   /**
    * Getters
    */
   public ArrayList<Individuo> getIntegrantes(){
       return this.integrantes;
   }
   /**
    * Calcula la entrada de una delegacion, se crea una variable temporal que sera un acumulador, se realiza un foreach y el total acumulara
    * la entrada de cada integrante de la delegacion, se devolvera el total menos el 10%.
    * @return precio total de entradas
    */
   public double entrada(){
       double total = 0;
       for(Individuo i: this.getIntegrantes()){
           total += i.entrada();
       }
       return total - ((10 * total) / 100);
   }
   /**
    * Inscribi a un individuo a la coleccion
    * @param Individuo individuo
    */
   public void inscribirIndividuo(Individuo p_individuo){
       this.getIntegrantes().add(p_individuo);
   }
   /**
    * Quita a un individuo de la coleccion
    * @param Individuo individuo
    */
   public void quitarIndividuo(Individuo p_individuo){
       this.getIntegrantes().remove(p_individuo);
   }
   /**
    * Calcula la cantidad de integrantes de la delegacion
    * @return cantidad de integrantes
    */
   public int cantidadIntegrantes(){
       int contador = 0;
       for(Individuo i: this.getIntegrantes()){
           contador += 1;
       }
       return contador;
   }
   public void mostrar(){
       /*
        * -------------------------------------------------------------
            Delegación: UNNE – Alumnos 2do. Año
            Integrantes
            Nombre y Apellido: María Louseau
            DNI: 13568963 Edad: 56 años
            Nombre y Apellido: Carlos Lopez
            DNI: 19875785 Edad: 47 años
            …
            Cantidad de Integrantes: 15
            -------------------------------------------------------------
        */
       System.out.println("-------------------------------------------------------------");
       System.out.println("Delegacion: " + super.getNombre());
       System.out.println("Integrantes");
       for(Individuo i: this.getIntegrantes()){
                System.out.println("Nombre y Apellido: " + i.getPersona().nomYApe());
                System.out.println("DNI: " + i.getPersona().getDNI() + " - Edad: " + i.getPersona().edad());
       }
       System.out.println("Cantidad de Integrantes: " + this.cantidadIntegrantes());
       System.out.println("-------------------------------------------------------------");
   }
   /**
    * Realizamos una verificacion, si el tipo de visitante pasado por parametro es igual al String (delegacion) y si la fecha de visita es igual
    * al pasado por parametro mandamos un mensaje al metodo mostrar
    * @param Calendar fecha, String visitante
    */
   public void listarPorFecha(Calendar p_fecha, String p_visitante){
       if(this.tipoVisitante().equals(p_visitante.toLowerCase()) && super.getFechaVisita().equals(p_fecha)){
           this.mostrar();
       }
   }
   /**
    * @return tipo de visitante
    */
   public String tipoVisitante(){
       return "delegacion";
   }
}

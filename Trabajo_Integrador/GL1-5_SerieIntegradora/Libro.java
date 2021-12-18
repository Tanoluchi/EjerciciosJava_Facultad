
/**
 * Clase administradora del libro y sus prestamos.
 * 
 * @author (Gl1 5) 
 * @version (nov 2021)
 */
import java.util.*;
public class Libro
{  /**
    *Declaracion de Variables de Instancia
    **/
    private String titulo;
    private int edicion;
    private String editorial;
    private int anio;
    private ArrayList <Prestamo> prestamos;
    
    /**
     * contructor de la clase Libro
     */
    public Libro( String p_titulo, int p_edicion,String p_editorial, int p_anio){
        this.setTitulo(p_titulo);
        this.setEdicion(p_edicion);
        this.setEditorial(p_editorial);
        this.setAnio(p_anio);
        this.setPrestamos(new ArrayList<Prestamo>());
    }
    
    /**
     * asignacion de valores a las v.i a traves de los mutadores(setters)
     */
    private void setTitulo(String p_titulo){ 
        this.titulo=p_titulo;
    }
    private void setEdicion(int p_edicion){
        this.edicion=p_edicion;
    }
    private void setEditorial(String p_editorial){
        this.editorial=p_editorial;
    }
    private void setAnio(int p_anio){
        this.anio=p_anio;
    }
    private void setPrestamos(ArrayList p_prestamos){
        this.prestamos=p_prestamos;
    }
    
    /**
     * declaracion de Observadores  para el acceso a los datos(getters)
     */
    public String getTitulo(){
        return this.titulo;
    }
    public int getEdicion(){
        return this.edicion;
    }
    public String getEditorial(){
        return this.editorial;
    }
    public int getAnio(){
        return this.anio;
    }
    public ArrayList<Prestamo> getPrestamos(){
        return this.prestamos;
    }
    /**
     * metodo que permite agregar un prestamo del libro
     */
    
    public void addPrestamo(Prestamo p_prestamo){
        this.getPrestamos().add(p_prestamo);
    }
    
    /**
     * Metodo que retorna el ultimo prestamo del libro
     */
    public Prestamo getPrestamo(){
         if (this.getPrestamos().isEmpty()){
            return null;
        }else{   
           return this.getPrestamos().get(this.getPrestamos().size()-1);
        }
    }
        
    /**
     * Metodo que permite saber si un libro se encuentra prestado o no.
     */
    public boolean prestado(){
        if(this.getPrestamo()!=null && this.getPrestamo().getFechaDevolucion()==null) {
            return true;//como solo se tiene una fecha de devolución cuando se regresa el libro, esta debe ser no null
        }
        return false;
    }     
     
    /**
     * metodo que retorna una cadena con el titulp del libro.
     */
    public String toString (){
        return "Titulo: " +this.getTitulo();
    }
    
        
}

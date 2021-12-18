import java.util.*;
/**
 * class Docente.
 *
 * @author (your name)
 * @version (1.0 - 01/11/2020)
 */
public class Docente extends Socio
{
    // atributos
    private String area;
    /**
     * Constructor for objects of class Docente
     * 
     * @param int p_dniSocio
     * @param String p_nombre
     * @param String p_area
     */
    Docente(int p_dniSocio,String p_nombre,String p_area)
    {
        super(p_dniSocio,p_nombre, 5); //Se coloca 5 porque todos los docentes inicialmente tienen 5 dias para devolver el libro prestado.
        this.setArea(p_area);
    }
    // mutador
    private void setArea(String p_area)
    {
        this.area = p_area;
    }
    // observador
    public String getArea(){
        return this.area;
    }
    
   /**
     * Metodo esResponsable que retorna 'True' si el docente no posee prestamos vencidos.
     * en caso contrario, no es responsable y retorna 'False'
     */
    public boolean esResponsable(){
     if(super.puedePedir() == true ){
        return true;
     }else 
        return false;
    }
    
            
    /**
     * Metodo agregarDiasDePrestamos(), adiciona días de préstamo al docente. Es un premio a la responsabilidad.
     */
     public void agregarDiasDePrestamo(int p_dias)
     {        
        if(this.esResponsable() == true){
            this.setDiasPrestamo(this.getDiasPrestamo() + p_dias);
        }else{
            System.out.println("No es responsable, no se pueden añadir dias de prestamo.");
        }
     }
    
    /**
     * Metodo soyDeLaClase(), devuelve el String “Docente?.
     */
    public String soyDeLaClase()
    {
        return "Docente";
    }
}
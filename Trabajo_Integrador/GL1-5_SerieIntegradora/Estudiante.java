
/**
 * Clase: Docente, que hereda las caracteristicas de la clase Socio.
 *
 * @author Fernandez Aimara
 * @version (1.0)
 */

public class Estudiante extends Socio{
    
    private String carrera;

    /**
     * Constructor para objectos de clase Estudiante
     * @param p_dniSocio
     * @param p_nombre
     * @param p_carrera
     */
    public Estudiante(int p_dniSocio, String p_nombre, String p_carrera){    
        super(p_dniSocio,p_nombre,20);
        this.setCarrera(p_carrera);
    }
    
    //Setters
    
    private void setCarrera(String p_carrera){
     this.carrera = p_carrera;
    }
    
    //Getters
    /**
     * @return String 
     */    
    public String getCarrera(){
     return this.carrera;
    }

    /**
      * El metodo soyDeLaClase(), devuelve el String “Estudiante?.
      * @return String 
     */
    
    public String soyDeLaClase(){
        return "Estudiante";
    }

    /**
     * Metodo: retorna 'True' si no hay prestamos vencidos, ni mas de 3 libros prestados.
     en caso contrario retorna 'False'
     * @return boolean
     */
    public boolean puedePedir(){
      if(this.cantLibrosPrestados() <= 3  && super.puedePedir() == true){
         return true ; //puede pedir 
      }else 
        return false; //no puede  pedir
    }
}
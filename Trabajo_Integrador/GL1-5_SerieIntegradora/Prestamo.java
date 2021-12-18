 


import java.util.Calendar;
import java.util.GregorianCalendar;



import java.util.ArrayList;


/**
 * Clase Prestamo modelado de un Objeto el cual es una abstracion del prestamo del ulibro.
 * 
 * 
 * 
 */
public class Prestamo
{
    // varaibles de instacia
    private Calendar fechaRetiro;
    private Calendar fechaDevolucion;
    private Socio socio;
    private Libro libro;

    /**
     * Constructor para objectos de clase Prestamo
     */
    public Prestamo(Calendar p_fechaRetiro, Socio p_socio, Libro p_libro)
    {
        // Inicializacion de atributos
        setFechaRetiro(p_fechaRetiro);
        setSocio(p_socio);
        setLibro(p_libro);
        
    }

    /**
     * Setters y Getters de clase
     * @param p_fechaRetiro
     */
    private void setFechaRetiro(Calendar p_fechaRetiro) {
        this.fechaRetiro = p_fechaRetiro;
    }

    public Calendar getFechaRetiro() {
        return this.fechaRetiro;
    }

    public void setFechaDevolucion(Calendar p_fechaDevolucion) {
        this.fechaDevolucion = p_fechaDevolucion;
    }

    public Calendar getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    public void setSocio(Socio p_socio) {
        this.socio = p_socio;
    }

    public Socio getSocio() {
        return this.socio;
    }

    private void setLibro(Libro p_libro) {
        this.libro = p_libro;
    }

    public Libro getLibro() {
        return this.libro;
    }

    /**
     * metoso registraFechaDevolucion. Registra la Fecha en la cual se devuelve un Libro
     * @param p_fechaDevolucion
     */
    public void registrarFechaDevolucion(Calendar p_fechaDevolucion) {
        this.setFechaDevolucion(p_fechaDevolucion);
    }

    /**
     * metodo vencido. determina si un prestamo se encuentra vecido a partir de una fecha de entrada
     */
    public boolean vencido(Calendar p_fecha) {
        /* devuelve true si la fecha pasada como parámetro es mayor que la fecha de vencimiento
        (fecha de retiro más los días de préstamos asignados). */
        Calendar fechaVencimiento = this.getFechaRetiro();
        fechaVencimiento.add(Calendar.DATE, 20); 
        
        if (p_fecha.after(fechaVencimiento) )  {
            return true;
        }else{
            return false;
        }
    }

    /**
     * metodo toString. Devuelve un estring con la concatenacion de algunas varibles de instancia
     */
    public String toString() {
       String salida = "Retiro: " + this.fechaRetiro + " - Devolucion: " + this.getFechaDevolucion() + "\n" + "Libro: " + this.getLibro().getTitulo() + "\n" + "Socio: " + this.getSocio().getNombre();
       return salida;
    }
}

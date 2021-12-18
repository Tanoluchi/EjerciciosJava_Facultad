
 

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
05/11
Se corrige error en el inicializaciond de variables de instancia
se corrige metodo toString
 */

/**
 * Clase Socio. Clase Abtracta Modelado de un Socio de un Libreria
 * 
 *
 */
public abstract class Socio 
{
    //Variable de instancia
    private int dniSocio;
    private String nombre;
    private int diasPrestamo;
    private ArrayList<Prestamo> prestamos;

    /**
     * Constructor para objectos de clase Socio
     */
    protected Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo)
    {
        setDniSocio(p_dniSocio);
        setNombre(p_nombre);
        setDiasPrestamo(p_diasPrestamo);
        setPrestamos(new ArrayList<Prestamo>());
    }

    /**
     * Setters y Getters de Clase
     * @param p_dinSocio
     */

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    public ArrayList<Prestamo> getPrestamos() {
        return this.prestamos;
    }

    private void setDniSocio(int p_dniSocio){
        this.dniSocio = p_dniSocio;
    }

    public int getDniSocio() {
        return this.dniSocio;
    }

    public void setDiasPrestamo(int p_diasPrestamo) {
        this.diasPrestamo = p_diasPrestamo;
    }

    public int getDiasPrestamo() {
        return this.diasPrestamo;
    }

    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    /**
     * metodo addPrestamos. Agrega un prestamos al Array de Prestamos del Socio
     * @param p_prestamo
     */
    public void addPrestamo(Prestamo p_prestamo) {
        this.getPrestamos().add(p_prestamo);
    }

    /**
     * metodo removePrestamo. Elimina unprestamo del Array del Prestamos del Socio
     * @param p_prestamo
     * @return
     */
    public Prestamo removePrestamo(Prestamo p_prestamo) {
        //Agregué al metodo que devuelba el Objeto Eliminado ya que no está especifica en el UML
        Prestamo elPrestamo = p_prestamo;
        this.getPrestamos().remove(p_prestamo);
        return elPrestamo;
    }

    /**
     * catLibrosPrestado. Returna la cantidad de libros en poder del socio
     * @return
     */
    public int cantLibrosPrestados() {
        return this.getPrestamos().size();
    }

    /**
     * metodo toString. Devuelve una concatencion de artributos segun especificación
     */
    public String toString() {
        return ("Dni: " + this.getDniSocio() + " || " + this.getNombre() + "( " + this.soyDeLaClase() +" )" + " || " + "Libros Prestados: " + this.cantLibrosPrestados()); 
    }

    /**
     * meto puedePedir. Detrmina si e socio puee pedir un libro segun criterios establecidos
     * @return
     */
    public boolean puedePedir() {
        //returna true o  falso según pueda pedir.
        /* Cada socio tiene una lista de préstamos donde se asientan los préstamos en su poder.
        Los socios pueden ser estudiantes o docentes. Un socio estudiante puede pedir prestado un
        libro sólo si no tiene más de 3 libros en su poder y si no tiene ningún libro vencido (20 días después de la fecha de retiro).
        Un socio docente no tiene límite en cuanto a la cantidad de libros prestados, pero solo puede pedir prestado un libro si no
        tiene alguna devolución vencida (superados los días de préstamos que tiene cada docente, ​desde la fecha de retiro).
        Inicialmente todos los docentes tienen 5 días de préstamo, pero si es responsable se le van agregando días de préstamo,
        individualmente. Al pedir un préstamo, éste se crea con fecha de retiro solamente; la biblioteca asienta el préstamo en
        la ficha del libro y en la ficha del socio. Cuando se devuelve el libro, en el préstamo se indica la fecha de devolución. */

        //Acá no me importa si es aluno o docente. eso se verá en la clase correspondiente.
        Calendar fechaActual = new GregorianCalendar();
        Calendar fecha_prestamo = Calendar.getInstance();
        
        //Consulta todo el array de prestamos. si hay uno que esté vencido devuelva false
        for (Prestamo prestamo : this.getPrestamos()) {
            if (prestamo.vencido(fechaActual) ) {
                return false;
            }
        }
        return true;
    }

    /**
     * metodo abstracto soyDelaClase. si implementación
     * @return
     */
    public abstract String soyDeLaClase();

}

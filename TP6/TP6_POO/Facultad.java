import java.util.*;

/**
 * Clase Facultad agrega y quita profesores de la coleccion, retorna el total a pagar a todos los profesores y muestra por pantalla la nomina de
 * profesores y los cargos de los profesores.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Facultad
{
    private String nombre;
    private ArrayList<Profesor>profesores;
    /**
     * Constructor sobrecargado
     * @param String nombre, Profesor profesor
     */
    public Facultad(String p_nombre, Profesor p_profesor){
        this.setNombre(p_nombre);
        this.setProfesores(new ArrayList<Profesor>());
        this.agregarProfesor(p_profesor);
    }
    /**
     * Constructor 
     * @param String nombre, ArrayList profesor
     */
    public Facultad(String p_nombre, ArrayList<Profesor> p_profesor){
        this.setNombre(p_nombre);
        this.setProfesores(p_profesor);
    }
    /**
     * Setters
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setProfesores(ArrayList<Profesor> p_profesores){
        this.profesores = p_profesores;
    }
    /**
     * Getters
     */
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Profesor> getProfesores(){
        return this.profesores;
    }
    /**
     * Agrega un profesor a la coleccion
     * @return true o false
     */
    public boolean agregarProfesor(Profesor p_profesor){
       return this.getProfesores().add(p_profesor);
    }
    /**
     * Quita un profesor de la coleccion
     * @return true o null
     */
    public boolean quitarProfesor(Profesor p_profesor){
       return this.getProfesores().remove(p_profesor);
   }
    public void nominaProfesores(){
        /*
         * *************** Nómina Facultad: FaCENA
            ------------------------------------------------------------------
            DNI: 21.859.361 Nombre: Juan Perez - Sueldo Total: 3260.0
            DNI: 23.451.992 Nombre: Mirta Lopez - Sueldo Total: 3306.0
            ------------------------------------------------------------------
             Total a pagar: $6566.0
         */
        System.out.println("*************** Nómina Facultad: FaCENA ***************");
        System.out.println("------------------------------------------------------------------");
        for(Profesor p: this.getProfesores()){
           System.out.println(p.mostrarLinea());
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Total a pagar: " + this.totalAPagar());
    }
    /**
     * Se crea una variable temporal para acumular, se realiza un foreach y recorremos la coleccion de profesor, en total se acumulara
     * el sueldo de cada profesor.
     * @return Total a pagar
     */
    public double totalAPagar(){
        double total = 0;
        for(Profesor p: this.getProfesores()){
           total += p.sueldoTotal();
        }
        return total;
    }
    public void listarProfesorCargos(){
        /*
         ****** Detalle de Profesores y cargos de Facultad: FaCENA *****
            --------------------------------------------------------------------------------
            Nombre y Apellido: Juan Perez
            DNI: 28596132 Edad: 37 años
            Titulo: Lic. en Sistemas de Información
            -***** Cargos Asignados *****-
            ------------------------------
            JTP-Programación OO - Sueldo Basico: 800.0 - Sueldo Cargo: 904.0 - Antiguedad: 10 años
            Horas Docencia: 10
            Titular-TFA - Sueldo Basico: 1400.0 - Sueldo Cargo: 1484.0 - Antiguedad: 12 años
            Horas Docencia: 20
            ----Cargo de caracter SemiExclusivo----
            Horas investigación: 0
            JTP-Analisis de Sistemas - Sueldo Basico: 800.0 - Sueldo Cargo: 872.0 - Antiguedad: 20 años
            Horas Docencia: 10
            ** Sueldo Total: 3260.0 **
             ------------------ **** -------------------
            Nombre y Apellido: Mirta Lopez
            DNI: 34519921 Edad: 30 años
            Titulo: Lic. en Sistemas de Información
            -***** Cargos Asignados *****-
            ------------------------------
            JTP-TP-II - Sueldo Basico: 1200.0 - Sueldo Cargo: 1344.0 - Antiguedad: 11 años
            Horas Docencia: 10
            JTP-Ing.Soft - Sueldo Basico: 1800.0 - Sueldo Cargo: 1962.0 - Antiguedad: 10 años
            Horas Docencia: 10
            ----Cargo de caracter Exclusivo----
            Horas investigación: 20
            Horas extension: 10
            ** Sueldo Total: 33060.0 **
            ------------------------------------------------------------------
             Hay 2 profesores 
         */
        System.out.println("****** Detalle de Profesores y cargos de Facultad: FaCENA *****");
        System.out.println("--------------------------------------------------------------------------------");
        for(Profesor p: this.getProfesores()){
           p.mostrar();
        }
        System.out.println("Hay " + this.getProfesores().size() + " profesores");
    }
}

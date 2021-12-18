import java.util.*;

/**
 * Clase Curso agrega o quita alumnos, se busca a un alumno, se verifica si un alumno esta inscripto o no al curso, mostramos por pantalla los datos
 * de los alumnos inscriptos al curso y se imprime el promedio de un alumno.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 * @version 9/2021
 */
public class Curso
{
    private String nombre;
    private HashMap<Integer, Alumno> alumnos;
    /**
     * Constructor Sobrecargado
     * @param String nombre
     */
    public Curso(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<Integer, Alumno>());
    }
    /**
     * @param String nombre, Hashmap<Integer, Alumno> alumno
     */
    public Curso(String p_nombre, HashMap<Integer, Alumno> p_alumnos){
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }
    /**
     * Setters
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setAlumnos(HashMap<Integer, Alumno> p_alumnos){
        this.alumnos = p_alumnos;
    }
    /**
     * Getters
     */
    public String getNombre(){
        return this.nombre;
    }
    public HashMap<Integer, Alumno> getAlumnos(){
        return this.alumnos;
    }
    /**
     * Se inscribi a un alumno (se agrega al alumno a la coleccion)
     * @param Alumno alumno
     */
    public void inscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(p_alumno.getLU(),p_alumno);
    }
    /**
     * Se da de baja a un alumno (se lo quita de la coleccion)
     * @param int LU
     * @return Alumno
     */
    public Alumno quitarAlumno(int p_lu){
        for (Map.Entry <Integer, Alumno> student : this.getAlumnos().entrySet()){
            if(student.getKey() == p_lu){
                System.out.println("El alumno" + student.getValue().getNombre() + "" + student.getValue().getApellido() + " se esta dando de baja del curso.");
            }
        }
        return (Alumno)this.getAlumnos().remove(p_lu);
    }
    /**
     * @return cantidad de alumnos inscriptos
     */
    public int cantidadDeAlumnos(){
        return this.getAlumnos().size();
    }
    /**
     * Se realiza una verificacion, buscamos entre las claves de la coleccion de Alumnos inscriptos si el LU coincide, se retorna True (se encuentra inscripto).
     * @param int lu
     * @return True (si el alumno se encuentra inscripto), False caso contrario.
     */
    public boolean estaInscripto(int p_lu){
        if(this.getAlumnos().containsKey(p_lu)){
            for (Map.Entry <Integer, Alumno> student : this.getAlumnos().entrySet()){
                if(student.getKey() == p_lu){
                    System.out.println("El alumno " + student.getValue().getNombre() + "" + student.getValue().getApellido() + " Se encuentra inscripto.");
                }
            }
            return true;
        }else{
            System.out.println("El alumno con LU: " + p_lu + " no se encuentra inscripto.");
            return false;
        }
    }
    /**
     * Se verifica si en la coleccion existe el alumno pasado por parametro, si es asi se retorna True, False caso contrario.
     * @param Alumno alumno
     * @return True (si se encuentra inscripto), False caso contrario.
     */
    public boolean estaInscripto(Alumno p_alumno){
        if(this.getAlumnos().containsValue(p_alumno)){
            System.out.println("El alumno: " + p_alumno.nomYApe() + " se encuentra inscripto.");
            return true;
        }else{
            System.out.println("El alumno: " + p_alumno.nomYApe() + " no se encuentra inscripto.");
            return false;
        }
    }
    /**
     * Buscamos a un alumno por su LU dentro de la coleccion de alumnos.
     * @param int lu
     * @return el alumno buscado
     */
    public Alumno buscarAlumno(int p_lu){
        return (Alumno)this.getAlumnos().get(p_lu);
    }
    /**
     * @param int lu
     */
    public void imprimirPromedioDelAlumno(int p_lu){
        System.out.println("El promedio del Alumno con LU " + p_lu + " es de: " + buscarAlumno(p_lu).promedio());
    }
    public void mostrarInscriptos(){
        System.out.println("*** Cantidad de Inscriptos: " + this.cantidadDeAlumnos() + " ***");
        for (Map.Entry <Integer, Alumno> student : this.getAlumnos().entrySet()){
         System.out.println(student.getKey() + " - " + student.getValue().getNombre() + " " + student.getValue().getApellido());
         }
    }
}

import java.util.*;

/**
 * Clase Comercio agrega y quita Empleados, retorna cantidad de empleados del comercio, se verifica por el cuil si una persona es empleado del local,
 * busca y retorna a un empleado, muestra por pantalla la nomina de empleados y muestra por pantalla el sueldo neto de un empleado en especifico.zS
 * 
 * @author Valenzuela Luciano Juan Ignacio
 * @version 9/2021
 */
public class Comercio
{
    private String nombre;
    private HashMap<Long, Empleado> empleados;
    /**
     * Constructor sobrecargado
     * @param String nombre
     */
    public Comercio(String p_nombre){
        setNombre(p_nombre);
        setEmpleados(new HashMap<Long, Empleado>());
    }
    /**
     * @param String nombre, Hashmap<Long, Empleado> empleados
     */
    public Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados){
        setNombre(p_nombre);
        setEmpleados(p_empleados);
    }
    /**
     * Setters
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setEmpleados(HashMap<Long, Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    /**
     * Getters
     */
    public String getNombre(){
        return this.nombre;
    }
    public HashMap<Long, Empleado> getEmpleados(){
        return this.empleados;
    }
    /**
     * Se agrega un empleado a la coleccion
     * @param Empleado empleado
     */
    public void altaEmpleado(Empleado p_empleado){
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }
    /**
     * Se quita un empleado de la coleccion
     * @param long cuil
     * @return Empleado removido
     */
    public Empleado bajaEmpleado(long p_cuil){
         for (Map.Entry <Long, Empleado> e : this.getEmpleados().entrySet()){
            if(e.getKey() == p_cuil){
                System.out.println("El empleado " + e.getValue().nomYApe() + " se esta dando de baja.");
            }
        }
        return (Empleado)this.getEmpleados().remove(p_cuil);
    }
    /**
     * @return cantidad de empleados en el comercio.
     */
    public int cantidadDeEmpleados(){
        return this.getEmpleados().size();
    }
    /**
     * Se verifica el cuil pasado por parametro si es una clave dentro de la coleccion de Empleados, si es asi es un empleado del comercio y se devuelve True, caso contrario se devuelve False.
     * @param long cuil
     * @return True (si es un empleado del comercio), False caso contrario.
     */
    public boolean esEmpleado(long p_cuil){
        if(this.getEmpleados().containsKey(p_cuil)){
            for (Map.Entry <Long, Empleado> e : this.getEmpleados().entrySet()){
                if(e.getKey() == p_cuil){
                    System.out.println(e.getValue().nomYApe() + " es un empleado.");
                }
            }
            return true;
        }else{
            System.out.println("La persona con CUIL: " + p_cuil + " no es un empleado.");
            return false;
        }
    }
    /**
     * Se busca un empleado por el cuil pasado por parametro, si se encuentra se retorna el empleado sino se retorna null.
     * @param long cuil
     * @return Empleado
     */
    public Empleado buscarEmpleado(long p_cuil){
        return this.getEmpleados().get(p_cuil);
    }
    /**
     * Se verifica si la coleccion contiene al empleado con el cuil pasado por parametro, si es asi se muestra por pantalla su sueldo neto.
     * @param long cuil
     */
    public void sueldoNeto(long p_cuil){
        if(this.getEmpleados().containsKey(p_cuil)){
            for (Map.Entry <Long, Empleado> e : this.getEmpleados().entrySet()){
                if(e.getKey() == p_cuil){
                    System.out.println("El sueldo neto del empleado " + e.getValue().nomYApe() + " es de: " + e.getValue().sueldoNeto());
                }
            }
        }
    }
    public void nomina(){
        System.out.println("***** Nomina de empleados de " + this.getNombre() + " *****");
        for (Map.Entry <Long, Empleado> e : this.getEmpleados().entrySet()){
             e.getValue().mostrarLinea();
        }
    }
}

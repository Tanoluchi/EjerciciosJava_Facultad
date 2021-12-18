
/**
 * Clase Profesor muestra por pantalla la informacion de un profesor, lista sus cargos, obtiene el sueldo total de todos los cargos que posee
 * y muestra en una linea la informacion principal de un profesor.
 * 
 * @author Valenzuela Luciano Juan Ignacio 
 */
public class Profesor extends Persona
{
    private String titulo;
    private Cargo cargos[];
    /**
     * Constructor sobrecargado
     * @param int dni, String nombre, String apellido, int anio, String titulo, Cargo[] cargos
     */
    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, Cargo[] p_cargos){
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(p_cargos);
    }
    /**
     * Setters
     */
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    private void setCargos(Cargo p_cargos[]){
        this.cargos = p_cargos;
    }
    /**
     * Getters
     */
    public String getTitulo(){
        return this.titulo;
    }
    public Cargo[] getCargos(){
        return this.cargos;
    }
    public void mostrar(){
        /*
         *  Nombre y Apellido: Juan Perez
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
         *
         */
        super.mostrar();
        System.out.println("Titulo: " + this.getTitulo());
        this.listarCargos();
        System.out.println("*** Sueldo Total: " + this.sueldoTotal() + " ***");
        System.out.println("--------------------------------------------------------------------------------");
    }
    public void listarCargos(){
        /*
         * -***** Cargos Asignados *****-
            ---------------------------------------
            JTP-Programación OO - Sueldo Basico: 800.0 - Sueldo Cargo: 904.0 - Antiguedad: 10 años
            Horas Docencia: 10
            Titular-TFA - Sueldo Basico: 1400.0 - Sueldo Cargo: 1484.0 - Antiguedad: 12 años
            Horas Docencia: 20
            ----Cargo de caracter SemiExclusivo----
            Horas investigación: 0
            JTP-Analisis de Sistemas - Sueldo Basico: 800.0 - Sueldo Cargo: 872.0 - Antiguedad: 20 años
            Horas Docencia: 10
         * 
         */
        System.out.println("-***** Cargos Asignados *****-");
        System.out.println("---------------------------------------");
        for(int i = 0; i < this.getCargos().length; i++){
            if(this.getCargos()[i] != null){
                this.getCargos()[i].mostrarCargo();
            }
        }
    }
    /**
     * Se crea una variable temporal para acumular el sueldo de cada cargo, se realiza un for que recorrera el Array y realiza una verificacion
     * mientras que la posicion del array contenga un cargo (no sea null) entonces la variable acumulara el sueldo de cada cargo.
     * @return sueldo de todos los cargos de un profesor
     */
    public double sueldoTotal(){
        double total = 0;
        for(int i = 0; i < this.getCargos().length; i++){
            if(this.getCargos()[i] != null){
                total += this.getCargos()[i].sueldoDelCargo();
            }
        }
        return total;
    }
    /**
     * @return datos principales del profesor
     */
    public String mostrarLinea(){
        /*
         * DNI: 28.596.132 - Nombre: Juan Perez - Sueldo Total: 3260.0
         */
        return "DNI: " + super.getDNI() + " - Nombre: " + super.nomYApe() + " - Sueldo Total: " + this.sueldoTotal();
    }
}


/**
 * Clase Mujer puede Casarse con un Hombre, puede divorciarse del esposo, muestra los datos con quien esta casada y muestra por pantalla sus propios datos.
 * 
 * @author Valenzuela Luciano 
 * @version 9/2021
 */
public class Mujer
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    /**
     * constructor sobrecargado
     * @param String nombre, String apellido, int edad
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad){
        setNombre(p_nombre);
        setApellido(p_apellido);
        setEdad(p_edad);
        setEstadoCivil("Soltera");
        setEsposo(null);
    }
    /**
     * constructor sobrecargado
     * @param String nombre, String apellido, int edad, Hombre esposo
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo){
        setNombre(p_nombre);
        setApellido(p_apellido);
        setEdad(p_edad);
        setEsposo(p_esposo);
        setEstadoCivil("Soltera");
    }
    /**
     * Setters
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }
    private void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;
    }
    /**
     * Getters
     */
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    public Hombre getEsposo(){
        return this.esposo;
    }
    /**
     * Realiza una verificacion, si el estado civil de la persona es distinta a Casada entonces se le asigna su nuevo estado civil, se le asigna el esposo
     * y manda un mensaje con su firma al metodo casarseCon del objeto Hombre pasado por parametro. Caso contrario envia un mensaje al metodo casadaCon
     * @param Hombre p_hombre
     */
    public void casarseCon(Hombre p_hombre){
        if(!(this.getEstadoCivil().equals("Casada")) && p_hombre.getEsposa() == null){
            this.setEstadoCivil("Casada");
            p_hombre.casarseCon(this);
            this.setEsposo(p_hombre);
        }
    }
    /**
     * Si su estado civil es igual a Casada, entonces se le asigna su nuevo estado civil y le pide el divorcio al Esposo (manda un mensaje al
     * metodo divorcio del objeto Hombre).
     */
    public void divorcio(){
        if(this.getEstadoCivil().equals("Casada")){
            this.setEstadoCivil("Divorciada");
            this.getEsposo().divorcio();
            System.out.println(this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años " + " Se ha divorciado");
            this.setEsposo(null);
        }
    }
    /**
     * @return Devuelve una cadena de datos con el nombre, apellido y edad.
     */
    public String datos(){
        return (this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años ");
    }
    public void mostrarEstadoCivil(){
        System.out.println(this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años " + " - "+ this.getEstadoCivil());
    }
    /**
     * Hace una verificacion, si su estado civil es igual a Casada, entonces muestra los datos del esposo, caso contrario emite el mensaje
     * que no se encuentra casada.
     */
    public void casadaCon(){
        if(this.getEstadoCivil().equals("Casada")){
            System.out.println(this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años" + " Esta casada con " + this.getEsposo().getNombre() + " " + this.getEsposo().getApellido() + " de " + this.getEsposo().getEdad() + " años ");
        }else{
            System.out.println("Usted no se encuentra casada");
        }
    }
}

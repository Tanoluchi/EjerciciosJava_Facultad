
/**
 * Write a description of class Hombre here.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class Hombre
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    /**
     * constructor sobrecargado
     * @param String nombre, String apellido, int edad
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad){
        setNombre(p_nombre);
        setApellido(p_apellido);
        setEdad(p_edad);
        setEstadoCivil("Soltero");
        setEsposa(null);
    }
    /**
     * constructor sobrecargado
     * @param String nombre, Strin apellido, int edad, Mujer esposa
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa){
        setNombre(p_nombre);
        setApellido(p_apellido);
        setEdad(p_edad);
        setEsposa(p_esposa);
        setEstadoCivil("Soltero");
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
    private void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
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
    public Mujer getEsposa(){
        return this.esposa;
    }
    /**
     * Realiza una verificacion, si el estado civil de la persona es distinta a Casado entonces se le asigna su nuevo estado civil, se le asigna la esposa
     * y manda un mensaje con su firma al metodo casarseCon del objeto Mujer pasado por parametro. Caso contrario envia un mensaje al metodo casadoCon
     * @param Mujer p_mujer
     */
    public void casarseCon(Mujer p_mujer){
         if(!(this.getEstadoCivil().equals("Casado")) && p_mujer.getEsposo() == null){
                this.setEstadoCivil("Casado");
                p_mujer.casarseCon(this);
                this.setEsposa(p_mujer);
        }
    }
    /**
     * Si su estado civil es igual a Casado, entonces se le asigna su nuevo estado civil y le pide el divorcio a la Esposa (manda un mensaje al
     * metodo divorcio del objeto Mujer).
     */
    public void divorcio(){
        if(this.getEstadoCivil().equals("Casado")){
            this.setEstadoCivil("Divorciado");
            this.getEsposa().divorcio();
            System.out.println(this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años " + " Se ha divorciado");
            this.setEsposa(null);
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
     * Hace una verificacion, si su estado civil es igual a Casado, entonces muestra los datos de la esposa, caso contrario emite el mensaje
     * que no se encuentra casado.
     */
    public void casadoCon(){
        if(this.getEstadoCivil().equals("Casado")){
            System.out.println(this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años" + " Esta casado con " + this.getEsposa().getNombre() + " " + this.getEsposa().getApellido() + " de " + this.getEsposa().getEdad() + " años ");
        }else{
            System.out.println("Usted no se encuentra casado");
        }
    }
}

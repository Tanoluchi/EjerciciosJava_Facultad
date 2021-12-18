/**
 * Clase Laboratorio muestra los datos principales de los laboratorios con quién comercia una drogueria.
 * @author Valenzuela Luciano
 */
public class Laboratorio{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    /**
     * Constructores (Sobrecargado)
     * @param String nombre, String domicilio, String telefono, int compraMinima, int diaEntrega
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt){
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
        setCompraMin(p_compraMin);
        setDiaEntrega(p_diaEnt);
    }
    /**
     * @param String nombre, String domicilio, String telefono
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
        compraMinima = 0;
        diaEntrega = 0;
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    private void setCompraMin(int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    private void setDiaEntrega(int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public int getCompraMin(){
        return this.compraMinima;
    }
    public int getDiaEntrega(){
        return this.diaEntrega;
    }

    public void nuevaCompraMinima(int p_compraMin){
        this.setCompraMin(p_compraMin);
    }
    public void nuevoDiaEntrega(int p_diaEnt){
        this.setDiaEntrega(p_diaEnt);
    }
    public String mostrar(){
        return "Laboratorio: " + getNombre() + "\nDomicilio: " + getDomicilio() + " - " + "Telefono: " + getTelefono();
    }
}
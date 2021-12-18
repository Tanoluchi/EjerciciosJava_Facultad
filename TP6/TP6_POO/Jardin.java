import java.util.*;

/**
 * Clase Jardin retorna la cantidad de latas a utilizar, la cantidad de litros a utilizar y la cantidad de metros a cubrir.
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Jardin
{
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;
    /**
     * Constructor sobrecargado
     * @param String nombre, ArrayList<FiguraGeometrica> figuras
     */
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras){
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }
    /**
     * Constructor
     * @param String nombre
     */
    public Jardin(String p_nombre){
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<FiguraGeometrica>());
    }
    /**
     * Setters
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras){
        this.figuras = p_figuras;
    }
    /**
     * Getters
     */
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<FiguraGeometrica> getFiguras(){
        return this.figuras;
    }
    /**
     * Agrega una figura a la coleccion
     * @param FiguraGeometrica figura
     * @return true o false
     */
    public boolean agregarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().add(p_figura);
    }
    /**
     * Quita una figura de la coleccion
     * @param FiguraGeometrica figura
     * @return true o false
     */
    public boolean quitarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().remove(p_figura);
    }
    /**
     * Calcula la cantidad de litros a utilizar, sabiendo que cada lata tiene 4 litros.
     * @return el total de los litros de latas a utilizar.
     */
    private double cuantosLitros(){
        return 4 * this.cuantasLatas();
    }
    /**
     * Calcula la cantidad de latas utilizadas, sabiendo que cada lata de 4 litros cubre 20m realizamos un bucle
     * mientras que los metros a cubrir sea mayor a los litros que cubre una lata, va aumentando en 1 la cantidad de latas y en 20 la cantidad
     * a metros por cubrir y realiza nuevamente la verificacion. Asi sucesivamente hasta que ya no sea menor y retorne la cantidad de latas.
     * @return cantidad de latas utilizadas.
     */
    public int cuantasLatas(){
        int lts = 20;
        int latas = 1;
        while(lts < this.cuantosMetros()){
            lts += 20;
            latas += 1;
        }
        return latas;
    }
    /**
     * Creamos una variable temporal para acumular la superficie de cada figura que se va a pintar.
     * @return total de metros a cubrir.
     */
    public double cuantosMetros(){
        double total = 0;
        for(FiguraGeometrica f: this.getFiguras()){
           total += f.superficie();
        }
        return total;
    }
    public void detalleFiguras(){
        /*
         *Presupuesto: Bichito de Luz
            ****** Cuadrado ******
            Superficie: 25.0
            ****** Triángulo ******
            Superficie: 1.28
            ****** Circulo ******
            Superficie: 12.57
            ****** Elipse ******
            Superficie: 47.12
            ----------------------------------
             Total a cubrir: 85.97
             Comprar 5 latas
         */
        System.out.println("Presupuesto: " + this.getNombre());
        for(FiguraGeometrica f: this.getFiguras()){
            f.mostrarSuperficie();
        }
        System.out.println("----------------------------------");
        System.out.println("Total a cubrir: " + this.cuantosMetros());
        System.out.println("Comprar " + this.cuantasLatas() + " latas");
    }
}

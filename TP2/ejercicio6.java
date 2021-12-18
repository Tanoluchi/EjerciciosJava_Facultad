/**
 * Clase punto que asigna y muestra su coordenada x, coordenada y. 
 * @author Valenzuela Luciano
 */
public class Punto{
	private double x;
	private double y;

	/**
	 * Constructores de la clase Punto (sobrecargado)
	 */
	public Punto(){
		x = 0;
		y = 0;
	}
	/**
	 * @param double x, double y
	 */
	public Punto(double p_x, double p_y){
		setX(p_x);
		setY(p_y);
	}
	/**
	 * Setters
	 */
	private void setX(double p_x){
		this.x = p_x;
	}
	private void setY(double p_y){
		this.y = p_y;
	}
	/**
	 * Getters
	 */
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	/** Método que desplaza el punto (x,y) a (x + dx, y + dy)
	 * @param double dx, double dy
	 */
	public void desplazar(double p_dx, double p_dy){
		this.x = (getX() + p_dx);
		this.y = (getY() + p_dy);
	}
	public String coordenadas(){
		return (getX() + ", " + getY());
	}
	public void mostrar(){
		System.out.println("Punto. X:" + getX() + ", Y:" + getY());
	}
	// Ejecutable
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	/**
	 * Clase CrearPunto donde realizamos la instanciación de los objetos de la clase Punto 
	 * y recibimos los parametros por teclado utilizando BufferedReader, para luego probar los métodos.
	 */ 
	public class CrearPunto{
		public static void main(String[] args) throws IOException {
			BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Ingresar abscisa X: ");
			String entrada = bufer.readLine();
			double x = Double.valueOf(entrada);
			System.out.print("\nIngresar ordenada Y: ");
			entrada = bufer.readLine();
			double y = Double.valueOf(entrada);
			
			/**
			 * Instanciación del objeto 
			 */
			Punto unPunto = new Punto(x, y);

			unPunto.coordenadas();
			unPunto.desplazar(7, 2);
			unPunto.mostrar(); 

			Punto otroPunto = new Punto();
			otroPunto.desplazar(5, 3);
			otroPunto.coordenadas();
			otroPunto.mostrar();
		}
	}
}
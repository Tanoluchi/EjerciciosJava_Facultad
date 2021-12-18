/**
 * Clase Empleado toma el sueldo basico de un empleado y calcula su sueldo neto, por otro lado también
 * calcula sus años de antiguedad en la empresa. 
 * @author Valenzuela Luciano
 */
public class Empleado{
	private long cuil;
	private String apellido;
	private String nombre;
	private double sueldoBasico;
	private int anioIngreso;

	public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
		setCuil(p_cuil);
		setApellido(p_apellido);
		setNombre(p_nombre);
		setSueldo(p_importe);
		setAnio(p_anio);
	}

	private void setCuil(p_cuil){
		this.cuil = p_cuil;
	}
	private void setApellido(p_apellido){
		this.apellido = p_apellido;
	}
	private void setNombre(p_nombre){
		this.nombre = p_nombre;
	}
	private void setSueldo(p_importe){
		this.sueldoBasico = p_importe;
	}
	private void setAnio(p_anio){
		this.anioIngreso = p_anio;
	}

	public long getCuil(){
		return this.cuil;
	}
	public String getApellido(){
		return this.apellido;
	}
	public String getNombre(){
		return this.nombre;
	}
	public double getSueldo(){
		return this.sueldoBasico;
	}
	public int getAnioIngreso(){
		return this.anio;
	}

	public int antiguedad(){
		Calendar fechaHoy = new GregorianCalendar();
		int anioHoy = fechaHoy.get(Calendar.YEAR);

		return (anioHoy - getAnioIngreso());
	}
	private double descuento(){
		return ((2 * getSueldo()) / 100) + 12;
	}
	private double adicional(){
		if((antiguedad() >= 2) && (antiguedad() < 10) ){
			return (4 * getSueldo()) / 100;
		}
		else if(antiguedad >= 10){
			return (6 * getSueldo()) / 100;
		}
		else{
			return (2 * getSueldo()) / 100;
		}
	}
	public double sueldoNeto(){
		return (getSueldo() + adicional()) - descuento();
	}
	public String apeYNom(){
		return getApellido() + " " + getNombre();
	}
	public String nomYApe(){
		return getNombre() + " " + getApellido();
	}
	public void mostrarLinea(){
		System.out.println(getCuil() + "\t" + apeYNom() + "\t" + sueldoNeto());
	}
	public void mostrar(){
		System.out.println("Nombre y Apellido: " + nomYApe());
		System.out.println("CUIL: " + getCuil() + " " + "Antigüedad: " + antiguedad());
		System.out.println("Sueldo Neto: " + sueldoNeto());
	}

	// Ejecutable
	import java.util.*;
	public class CrearEmpleado{
		public static void main(String[] args) {
			Scanner valor = new Scanner(System.in);
			System.out.print("Ingrese Cuil: ");
			long cuil = valor.nextLong();
			System.out.print("\nIngresar Apellido: ");
			String apellido = valor.next();
			System.out.print("\nIngresar Nombre: ");
			String nombre = valor.next();
			System.out.print("\nIngresar Sueldo Basico: ");
			double sueldoBasico = valor.nextDouble();
			System.out.print("\nIngresar anio de ingreso a la empresa: ");
			int anioIngreso = valor.nextInt();

			Empleado unEmpleado = new Empleado(cuil, apellido, nombre, sueldoBasico, anioIngreso);

			unEmpleado.mostrar();
			unEmpleado.mostrarLinea();
		}
	}
}
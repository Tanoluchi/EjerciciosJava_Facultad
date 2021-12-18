/**
 * Clase Persona muestra los datos prinpales de una persona: DNI, nombre, apellido y año de nacimiento.
 * @author Valenzuela Luciano
 */
// Clase que define un conjunto de objetos que comparten caracteristicas en común.
public class Persona { 
	// Atributos: Caracteristicas del Objeto.
	private int nroDni;
	private String nombre;
	private String apellido;
	private int anioNacimiento;
	/**
	 * Constructor - Inicializa el objeto
	 * @param int dni, String nombre, String apellido, int anioNacimiento
	 */
	public Persona (int p_dni, String p_nombre, String p_apellido, int p_anio){
		setDNI(p_dni);
		setNombre(p_nombre);
		setApellido(p_apellido);
		setAnioNacimiento(p_anio);
	}
	/**
	 * Setters
	 */
	private void setDNI(int p_dni){
		this.nroDni = p_dni;
	}
	private void setNombre(String p_nombre){
		this.nombre = p_nombre;
	}
	private void setApellido(String p_apellido){
		this.apellido = p_apellido;
	}
	private void setAnioNacimiento(int p_anio){
		this.anioNacimiento = p_anio;
	}
	/**
	 * Getters
	 */
	public int getDNI(){
		return this.nroDni;
	}
	public String getNombre(){
		return this.nombre;
	}
	public String getApellido(){
		return this.apellido;
	}
	public int getAnioNacimiento(){
		return this.anioNacimiento;
	}
	/**
	 *	Método que obtiene la fecha actual y calcula la edad.
	 * @return edad de la persona
	 */ 
	public int edad(){
		Calendar fechaHoy = new GregorianCalendar();
		int anioHoy = fechaHoy.get(Calendar.YEAR);

		return (anioHoy - getAnioNacimiento());
	}
	public String nomYApe(){
		return (this.getNombre() + getApellido()); 
	}
	public String apeYNom(){
		return (getApellido() + getNombre()); 
	}
	public void mostrar(){
		System.out.println("Nombre y Apellido: " + nomYApe());
		System.out.print("DNI: " + getDNI() + "\tEdad: " + edad());
	}
}

// Ejecutable
public class CrearPersona {
	public static void main(String[] args) {
		Persona unaPersona = new Persona(234765123, "Denise", "Grat", 2000);
		unaPersona.mostrar();
	}
}
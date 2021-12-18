/**
 * Clase Cliente crea la cuenta de un usuario con sus datos principales y realiza la asignación o el agregado de saldo.
 * @author Valenzuela Luciano
 */
public class Cliente{
	private int nroDni;
	private String apellido;
	private String nombre;
	private double saldo;

	/**
	 * Contructor
	 * @param int dni, String apellido, String nombre, double importe
	 */
	public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe){
		setDni(p_dni);
		setApellido(p_apellido);
		setNombre(p_apellido);
		setSaldo(p_importe);
	}
	/**
	 * Setters
	 */
	private void setDNI(int p_dni){
		this.nroDni = p_dni;
	}
	private void setApellido(String p_apellido){
		this.apellido = p_apellido;
	}
	private void setNombre(String p_nombre){
		this.nombre = p_nombre;
	}
	private void setSaldo(double p_importe){
		this.saldo = p_importe;
	}
	/**
	 * Getters
	 */
	public int getDni(){
		return this.nroDni;
	}
	public String getApellido(){
		return this.apellido;
	}
	public String getNombre(){
		return this.nombre;
	}
	public double getSaldo(){
		return this.saldo;
	}
	/**
	 * Método que manda mensaje a setSaldo con importe para reasignar el valor de Saldo.
	 * @param double importe
	 */
	public double nuevoSaldo(double p_importe){
		return setSaldo(p_importe);
	}
	/**
	 * Método que manda mensaje a setSaldo con la suma del saldo actual más el importe pasado por parametro para asignar el agregado a saldo.
	 * @param double importe
	 */
	public double agregaSaldo(double p_importe){
		this.setSaldo(getSaldo() + p_importe);
		return this.getSaldo();
	}
	public String apeYNom(){
		return getApellido() + " " + getNombre();
	}
	public String nomYApe(){
		return getNombre() + " " + getApellido();
	}
	public void mostrar(){
		System.out.println("- Cliente -");
		System.out.println("Nombre y Apellido: " + nomYApe() + "(" + getDNI() + ")");
		System.out.println("Saldo: " + )
	}

	// Ejecutar
	public class CrearCliente{
		public static void main(String[] args) {
			int nroDni = Integer.valueOf(args[0]);
			String apellido = args[1];
			String nombre = args[2];
			double saldo = Double.valueOf(args[3]);

			Cliente unCliente = new Cliente(nroDni, apellido, nombre, saldo);

			unCliente.mostrar();
			unCliente.agregaSaldo(500);
			unCliente.mostrar();
			unCliente.nuevoSaldo(132);
			unCliente.mostrar();
		}
	}
}
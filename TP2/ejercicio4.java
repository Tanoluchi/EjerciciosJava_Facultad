/**
 * Clase Alumno toma las notas de un alumno, evalua si aprobo, calcula y muestra su promedio.
 * @author Valenzuela Luciano
 */
public class Alumno{
	private int lu;
	private String nombre;
	private String apellido;
	private double nota1;
	private double nota2;

	public Alumno(int p_lu, String p_nombre, String p_apellido){
		setLU(p_lu);
		setNombre(p_nombre);
		setApellido(p_apellido);
		nota1 = 0;
		nota2 = 0;
	}

	private void setLU(int p_lu){
		this.lu = p_lu;
	}
	private void setNombre(String p_nombre){
		this.nombre = p_nombre;
	}
	private void setApellido(String p_apellido){
		this.apellido = p_apellido;
	}

	public void setNota1(double p_nota1){
		this.nota1 = p_nota1;
	}
	public void setNota2(double p_nota2){
		this.nota2 = p_nota2;
	}

	public int getLU(){
		return this.lu;
	}
	public String getNombre(){
		return this.nombre;
	}
	public String getApellido(){
		return this.apellido;
	}
	public double getNota1(){
		return this.nota1;
	}
	public double getNota2(){
		return this.nota2;
	}

	private boolean aprueba(){
		if ((getNota1() >= 6) && (getNota2() >= 6)) {
			return true;	
		}
		return false;
	}
	private String leyendaAprueba(){
		if (aprueba()) {
			return "APROBADO"
		}
		return "DESAPROBADO"
	}
	public double promedio(){
		return	(getNota1() + getNota2()) / 2;
	}
	public String nomYApe(){
		return (getNombre() + " " + getApellido());
	}
	public String apeYNom(){
		return (getApellido() + " " + getNombre());
	}
	public void mostrar(){
		System.out.println("Nombre y Apellido: " + nomYApe());
		System.out.println("LU: " + getLU() + "\tNotas: " + getNota1() + " - " + getNota2());
		System.out.println("Promedio: " + promedio() + "--" + leyendaAprueba());
	}

	// Ejecutable
	public class CrearAlumno{
		public static void main(String[] args) {
			int lu = Integer.valueOf(args[0]);
			String nombre = args[1];
			String apellido = args[2];

			Alumno unAlumno = new Alumno(lu, nombre, apellido);

			unAlumno.setNota1(6);
			unAlumno.setNota2(6);
			unAlumno.mostrar();
		}
	}
}
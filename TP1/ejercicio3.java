public class Circunferencia{
	public static void main(String[] args) {
		int radio = Integer.valueOf(args[0]);
		float circunferencia = 2 * Math.PI * radio;

		System.out.println("El perimetro de la circunferencia es de: " + circunferencia);
	}
}
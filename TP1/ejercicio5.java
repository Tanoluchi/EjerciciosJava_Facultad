public class Ecuacion{
	public static void main(String[] args) {
		double a = Double.valueOf(args[0]);
		double b = Double.valueOf(args[1]);
		double c = Double.valueOf(args[2]);

		if(a == 0){
			System.out.println("El coeficiente a no puede ser 0");
		}else{
			double discriminante = Math.pow(b, 2) - 4 * a * c;
			if(discriminante >= 0){
				if(discriminante == 0){
					double x = -b / (2 * a);
					System.out.println("La raíz única es: " + x);
				}
				else{
					double x1, x2;
					x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
					x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
					System.out.println("La raíz real de x1 es: " + x1);
					System.out.println("La raíz real de x2 es: " + x2);
				}
			}
			else{
				System.out.println("Nos encontramos con una solución compleja");
			}
		}
	}
}
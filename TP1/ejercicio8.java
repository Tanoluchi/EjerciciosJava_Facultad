import java.util.Scanner;

public class OperarVector{
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);

		int notas[];
		notas = new int[5];
		int total = 0;
		int mayorNota = Integer.MIN_VALUE;
		float promedio = 0.0F;

		for(int i = 0; i < 5; i++){
			System.out.println("Ingrese la nota " + (i + 1) + ":");
			notas[i] = valor.nextInt();
			total += (float)notas[i];
			if(mayorNota < notas[i]){
				mayorNota = notas[i];
			}
		}
		System.out.println("Las notas ingresas son:");

		for(int i = 0; i < 5; i++){
			System.out.println("\t" + notas[i]);
		}
		promedio = (float)total / notas.length;

		System.out.println("El promedio es de: " + promedio);
		System.out.println("La mayor nota fue de: " + mayorNota); 
	}
}
import java.util.Scanner;

public class OrdenVector{
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);

		double vector[];
		double aux = 0;
		vector = new double[4];
		
		// Ingreso de valores
		for(int i = 0; i < 4; i++){
			System.out.print("\nIngrese el valor " + (i + 1) + ": ");
			vector[i] = valor.nextDouble();
		}

		// Ordenamiento con el metodo burbuja
		for(int i = 0; i < vector.length - 1; i++){
			for(int j = 0; j < vector.length - i - 1; j++){
				if(vector[j + 1] < vector[j]){
					aux = vector[j + 1];
					vector[j + 1] = vector[j];
					vector[j] = aux;
				}
			}
		}

		System.out.print("\nEl vector ordenado de menor a mayor:");
		for(int i = 0; i < vector.length; i++){
			System.out.print("\t" + vector[i]);
		}
		System.out.println("\nEl minimo valor es de: " + vector[0]);
	}
}
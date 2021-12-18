import java.util.Scanner;

public class Circunferencia2{
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		boolean continuar = true;

		while(continuar){
			System.out.println("Ingrese el valor del radio: ");
			int radio = valor.nextInt(); 
			float circunferencia = 2 *(float) Math.PI * radio;

			System.out.println("El perimetro de la circunferencia es de: " + circunferencia);
			System.out.println("¿Desea calcular el perimetro de otra circunferencia? (1 = Si/0 = No)");
			int respuesta = valor.nextInt();
			if(respuesta == 0){
				continuar = false;
			}
		}
	}
}
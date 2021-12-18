public class TrianguloRectangulo{
	public static void main(String[] args) {
		int hipotenusa = Integer.valueOf(args[0]);
		int cateto1 = Integer.valueOf(args[1]);
		int cateto2 = Integer.valueOf(args[2]);

		if(hipotenusa > cateto1 && hipotenusa > cateto2){
			if (Math.pow(hipotenusa, 2) == (Math.pow(cateto1, 2) + Math.pow(cateto2, 2))) {
				System.out.println("Es un triangulo rectángulo");
			}
			else{
				System.out.println("No es un triangulo rectangulo");
			}
		}
		else{
			System.out.println("La hipotenusa no puede ser menor a un cateto");
		}
	}
}
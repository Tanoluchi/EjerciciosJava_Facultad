public class Multiplo4{
	public static void main(String[] args) {
		System.out.println("Los multiplos de 4 (del 42 al 150) son:");
		for(int i = 42; i <= 150; i++){
			if(i % 4 == 0){
				System.out.println(i);
			}
		}
	}
}
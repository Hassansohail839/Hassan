import java.util.Scanner;

public class Ejercicio03App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero= sc.nextInt();
		
		
		if (numero % 1 == 0 ) {
			System.out.println("El número " + numero + " es un numero primo.");
			
		} else {
			System.out.println("El número " + numero + " no es un numero primo.");
			
		}
		sc.close();
		
	}

}

import java.util.Scanner;

public class Ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entero");
		int numero = sc.nextInt();

		System.out.println("El numero indicado es " + numero);

		if (numero % 2 == 0) {
			System.out.println("El número " + numero + " es divisible entre 2.");
		} else {
			System.out.println("El número " + numero + " no es divisible entre 2.");
		}

		sc.close();

	}
}

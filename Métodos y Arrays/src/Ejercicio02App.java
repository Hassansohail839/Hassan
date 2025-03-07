import java.util.Random;
import java.util.Scanner;

public class Ejercicio02App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		Random rand=new Random();
		System.out.println("Introduce el rango minimo: ");
		int min=sc.nextInt();
		System.out.println("Introduce el rango maximo: ");
		int max=sc.nextInt();
		
		int numAleatorioEnRango=rand.nextInt(min,max);
		System.out.println("El numero aleatorio es : " + numAleatorioEnRango);
		
		
		
		
	}

}

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("Introduce el numero: ");
		long numero= sc.nextInt();
		
		if (numero < 0) {
		System.out.println("No se puede calcular factorial de este numero. ");
	
		} else {
			long resultado = calcularFactorial(numero);
		}
		 
	
		
	}

	 public static long calcularFactorial (numero) {
	
	long factorial = 1;
	for (int i=1; numero>0; i++) {
		factorial*= i;
		 return factorial;
	}	
}

	 
}
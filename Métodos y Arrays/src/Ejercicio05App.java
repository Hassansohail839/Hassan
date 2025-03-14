import java.util.Scanner;

public class Ejercicio05App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero decimal: ");
		int numeroDecimal=sc.nextInt();
		
		String numeroBinario= convertirABinario(numeroDecimal);
		
		System.out.println("El numero " + numeroDecimal + " en binario es: " + numeroBinario );
		
	}

	
	public static String convertirABinario(int numeroDecimal) {
		
		if(numeroDecimal==0) {
			return "0";
			
		
	}
		
		StringBuilder binario = new StringBuilder();
		while (numeroDecimal>0) {
			int resto=numeroDecimal %2;
			binario.insert(0, resto);
			numeroDecimal=numeroDecimal/2;
			
		}
		return binario.toString();
}

}

import java.util.Scanner;

public class Ejercicio06App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero entero positivo: ");
		
		int numeroEntero=sc.nextInt();
		
		if(numeroEntero<=0) {
			System.out.println("Porfavor introduce un numero positivo entero. ");
		} else {
			int cantidadCifras=contarCifras(numeroEntero);
			System.out.println("El numero " + numeroEntero +  " tiene " + cantidadCifras + " cifras."  );
		}
		
		sc.close();
	}

	public static int contarCifras(int numeroEntero) {
		int contador=0;
		while (numeroEntero>0) {
			numeroEntero=numeroEntero/10;
			contador++;
		}
		return contador;
	}
	
}

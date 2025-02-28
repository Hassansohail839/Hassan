public class Ejercicio10App {

	public static void main(String[] args) {
		// Realiza una aplicación que nos pida un número de ventas a introducir. 
		//Después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
		//Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Introduce el número de ventas: ");
		int numeroVentas = sc.nextInt();
		int sumaVentas=0;
		for (int i = 1; i <= numeroVentas; i++) {
			System.out.println("Introduce el precio de la venta " + i);
			int venta = sc.nextInt();
			sumaVentas += venta;
			System.out.println("La suma de las ventas es " + sumaVentas);
	
		}
		
		
	

	}

}

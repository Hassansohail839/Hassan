import java.util.Scanner;

public class Ejercicio08App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por
//		consola el indice y el valor al que corresponde. 
//		Haz dos métodos, uno para rellenar valores y otro para mostrar.

		int num[]=new int [10];
		
		rellenarArray(num);
		mostrarArray(num);
			
	}
	public static void rellenarArray(int[] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 10 números:");

        // Recorrer el array y pedir los valores
        for (int i = 0; i < array.length; i++) {
            System.out.print("Número en la posición " + i + ": ");
            array[i] = scanner.nextInt();  // Guardar el valor en el array
        }
    }

    
    public static void mostrarArray(int[] array) {
        System.out.println("\nIndice - Valor:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indice " + i + ": " + array[i]);
        }
    }
}

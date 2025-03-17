import java.util.Random;
import java.util.Scanner;

public class Ejercicio10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Crea un array de números de un tamaño pasado por teclado. 
//		El array contendrá números aleatorios primos entre los números deseados. 
//		Por último nos indicar cual es el mayor de todos.
//		Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo
//		métodos que necesites

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el tamaño del array: ");
		int size=sc.nextInt();
		System.out.println("Introdcue el valor minimo: ");
		int min=sc.nextInt();
		System.out.println("Introduce el valor maximo: ");
		int max=sc.nextInt();
		int[] arrayPrimos=new int[size];
		Random rand= new Random();
		for (int i = 0; i <size; i++) {
            int numeroAleatorio;
            do {
                // Genera un número aleatorio dentro del rango
                numeroAleatorio = rand.nextInt(max - min + 1) + min;
            } while (!esNumeroPrimo(numeroAleatorio));  // Verifica que el número sea primo
            arrayPrimos[i] = numeroAleatorio;
        }

        // Imprimir el array de números primos
        System.out.print("Array de números primos: ");
        for (int numero : arrayPrimos) {
            System.out.print(numero + " ");
        }

        // Buscar el mayor número primo en el array
        int mayorPrimo = encontrarMayorPrimo(arrayPrimos);
        System.out.println("\nEl mayor número primo en el array es: " + mayorPrimo);

//        // Cerrar el scanner
//        Scanner.close();
    }

    // Método para verificar si un número es primo
    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;  // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;  // Si encuentra un divisor, no es primo
            }
        }
        return true;  // Si no se encuentra divisor, es primo
    }

    // Método para encontrar el mayor número primo en el array
    public static int encontrarMayorPrimo(int[] array) {
        int mayor = array[0];
        for (int numero : array) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }

		
	}


 

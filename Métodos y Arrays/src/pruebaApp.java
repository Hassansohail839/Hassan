import java.util.Random;
import java.util.Scanner;

public class pruebaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el tamaño del array: ");

		int size = scanner.nextInt();
		System.out.print("Introduce el rango máximo del random: ");
		int range = scanner.nextInt();
		
		int[] randomArray1 = generarRandomArray(size, range);
		
		int[] randomArray2 = generarArray2(randomArray1);

		System.out.println("Array random 1: ");
		printArray1(randomArray1);
		System.out.println("Array random 2: ");
		printArray2(randomArray1);

		scanner.close();
	}

	private static int[] generarArray2(int[] randomArray1) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int[] generarRandomArray(int size, int max) {

		int[] array1 = new int[size];

		for (int i = 0; i < size; i++) {
			array1[i] = (int) (Math.random() * max);
		}
		return array1;

	}

	public static int[] generarArray2(int size, int max) {
		
		//Recorrer array1 para igualar array2
		
		
		//Randomizar array2
		

		int[] array2 = new int[size];

		for (int i = 0; i < size; i++) {
			array2[i] = (int) (Math.random() * max);
		}
		 return array2;
	}

	public static void printArray1(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void printArray2(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
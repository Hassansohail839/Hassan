import java.util.Scanner;

public class Ejercicio11App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Introduce el tamaño del array: ");
		        int size = scanner.nextInt();
		        System.out.print("Introduce el rango máximo del random: ");
		        int range = scanner.nextInt();

		        // Generar el primer y segundo array con valores aleatorios
		        int[] randomArray1 = generarArray(size, range);
		        int[] randomArray2 = generarArray(size, range);

		        // Multiplicar los arrays
		        int[] randomArray3 = multiplicarArrays(randomArray1, randomArray2);

		        // Imprimir los arrays
		        System.out.println("Array random 1: ");
		        printArray(randomArray1);
		        System.out.println("Array random 2: ");
		        printArray(randomArray2);
		        System.out.println("Multiplicación de los arrays: ");
		        printArray(randomArray3);

		        scanner.close();
		    }

		    // Método para generar un array de tamaño 'size' con valores aleatorios en el rango [0, max)
		    public static int[] generarArray(int size, int max) {
		        int[] array = new int[size];
		        for (int i = 0; i < size; i++) {
		            array[i] = (int) (Math.random() * max);
		        }
		        return array;
		    }

		    // Método para imprimir un array
		    public static void printArray(int[] array) {
		        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
		        }
		        System.out.println(); // Para un salto de línea al final
		    }

		    // Método para multiplicar los elementos correspondientes de dos arrays
		    public static int[] multiplicarArrays(int[] array1, int[] array2) {
		        int[] array3 = new int[array1.length];
		        for (int i = 0; i < array1.length; i++) {
		            array3[i] = array1[i] * array2[i];
		        }
		        return array3;
		    }
		}

import java.util.Random;
import java.util.Scanner;

public class Ejercicio09App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la dimension del array: ");
		int size=sc.nextInt();
		int[] num=new int[size];
		
		
		rellenarArray(num,0,9);
		mostrarArrayYSumar(num);
		
		
	}
	
	 public static void rellenarArray(int[]array, int min, int max) {
		  Random rand= new Random();
		  for (int i = 0; i < array.length; i++) {
	            array[i] = rand.nextInt(max - min + 1) + min;
		  }
		  
	 }
	
	 public static void mostrarArrayYSumar(int[]array) {
		 
		 int suma=0;
		
		 System.out.println("Contenido del array:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.println("Posición " + i + ": " + array[i]);
	            suma+= array[i];
	        }
	        
	        System.out.println("\nLa suma total de los valores es: " + suma);
	 }
}
	
 

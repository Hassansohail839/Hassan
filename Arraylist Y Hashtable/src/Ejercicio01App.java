import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio01App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Crea una aplicación que calcule la nota media de los alumnos pertenecientes al curso de programación. 
//		Una vez calculada la nota media se guardara esta información en un diccionario de datos que almacene la nota media de cada
//		alumno.
//		Todos estos datos se han de proporcionar por pantalla
//		
		Scanner sc= new Scanner(System.in);
		//Crear un hashtable para guardar el nombre y las notas de cada alumno.
		Hashtable<String, Double>notasAlumnos= new Hashtable<>();
		
		//Pedir el numero de alumnos.
		System.out.println("Introduce el numero de alumonos: ");
		int numAlumnos=sc.nextInt();
		// Bucle para ingresar los datos de cada alumno.
		 for (int i = 0; i < numAlumnos; i++) {
	            // Pedir el nombre del alumno
	            System.out.print("Introduce el nombre del alumno: ");
	            String nombre = sc.next();
	            
	            // Pedir numero de preguntas.
	            System.out.println("Introduce el numero de asiganturas: ");
	            int numAsignaturas=sc.nextInt();
	            
	            // Pedir las calificaciones de las asignaturas
	            double sumaNotas = 0;
	            for (int j = 0; j < numAsignaturas; j++) {
	                System.out.print("Introduce la calificación de la asignatura " + (j + 1) + ": ");
	                sumaNotas += sc.nextDouble();
	            }

	         // Calcular la nota media
	            double notaMedia = sumaNotas / numAsignaturas;
	            
	         // Almacenar el nombre y la nota media en el Hashtable
	            notasAlumnos.put(nombre, notaMedia);
	        }
		
		// Mostrar las notas medias de los alumnos
	        System.out.println("\nNotas medias de los alumnos:");
	        for (String nombre : notasAlumnos.keySet()) {
	            System.out.println("Alumno: " + nombre + " - Nota media: " + notasAlumnos.get(nombre));
	        }

	        // Cerrar el scanner
	        sc.close();
	    }
	
		
		

		
	}

	
	


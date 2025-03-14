import java.util.Scanner;

public class Ejercicio04App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("Introduce el numero: ");
		int numero= sc.nextInt();
		
		  // Llamar al método para calcular el factorial
        long factorial = calcularFactorial(numero);	
        
     // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);

        

	}
	
	// Método para calcular el factorial de un número
	 public static long calcularFactorial (int numero) {
		 
		 // Si el número es 0 o 1, el factorial es 1	
		 if (numero==0 || numero==1) {
			 return 1;
			} 
		 
		 // Variable para almacenar el resultado del factorial
	long resultado = 1;
	  // Multiplicar los números desde 1 hasta el número ingresado
	for (int i=2; i<=numero; i++) {
		resultado=resultado*i;
		
	}
	return resultado;
}

	 
}
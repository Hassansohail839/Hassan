import java.util.Scanner;

public class Ejercicio03App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Introduce un número para verificar si es primo: ");
        int numero = scanner.nextInt();

        // Llamar al método para verificar si el número es primo
        boolean esPrimo = esNumeroPrimo(numero);

        // Mostrar el resultado
        if (esPrimo) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Método para verificar si un número es primo
    public static boolean esNumeroPrimo(int numero) {
        // Un número menor o igual a 1 no es primo
        if (numero <= 1) {
            return false;
        }

        // Verificar si el número tiene divisores distintos de 1 y él mismo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si encuentra un divisor, no es primo
            }
        }

        return true; // Si no encontró divisores, es primo
    }
}
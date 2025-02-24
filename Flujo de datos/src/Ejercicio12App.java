
public class Ejercicio12App {

	public static void main(String[] args) {
//		 Escribe una aplicación con un String que contenga una contraseña cualquiera. 
//		Después se te pedirá que introduzcas la contraseña, con 3 intentos. 
//        Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”. 
//		Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).

		java.util.Scanner sc = new java.util.Scanner(System.in);
		String password = "1234";
		int intentos = 3;
		boolean acertado = false;
		while (intentos > 0 && !acertado) {
			System.out.println("Introduce la contraseña: ");
			String pass = sc.nextLine();
			if (pass.equals(password)) {
				acertado = true;
				System.out.println("Enhorabuena.");
			} else {
				intentos--;
				System.out.println("Contraseña incorrecta. Te quedan " + intentos + " intentos.");
			}
		}
		if (!acertado) {
			System.out.println("Has agotado los intentos.");
		}

	}

}

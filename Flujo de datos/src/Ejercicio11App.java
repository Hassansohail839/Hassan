
public class Ejercicio11App {

	public static void main(String[] args) {
		// Crea una aplicación que nos pida un día de la semana.
		//y que nos diga si es un día laboral o no. 
		//Usa un switch para ello.
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Introduce un día de la semana: ");
		String dia = sc.nextLine();
		switch (dia) {
		case "lunes":
			case "martes":
				case "miércoles":
				case "jueves":
				case "viernes":
					System.out.println("Es un día laboral.");
					break;
					case "sábado":
					case "domingo":
						System.out.println("No es un día laboral.");
						break;
					default:
						System.out.println("El día introducido no es válido.");
						break;
						
		}

	}

}

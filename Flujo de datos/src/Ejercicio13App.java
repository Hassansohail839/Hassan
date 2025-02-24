import java.util.Scanner;

public class Ejercicio13App {

	public static void main(String[] args) {
//	    Crea una aplicación llamada CalculadoraInversa. 
//		Nos pedirá 2 operandos (int) y un signo aritmético (String). 
//		Según este último se realizara la operación correspondiente. Al final mostrara el resultado en un cuadro de dialogo.
//		Los signos aritméticos disponibles son:
//		+: suma los dos operandos.
//		-: resta los operandos.
//		*: multiplica los operandos.
//		/: divide los operandos, este debe dar un resultado con decimales (double)
//		^: 1º operando como base y 2º como exponente.
//		%: módulo, resto de la división entre operando1 y operando2.
		
		int operando1, operando2;
		String operacion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer operando: ");
		operando1 = sc.nextInt();
		System.out.println("Introduce el segundo operando: ");
		operando2 = sc.nextInt();
		System.out.println("Introduce la operación a realizar (+, -, *, /, ^, %): ");
		operacion = sc.next();
		sc.close();
		double resultado = 0;
		switch (operacion) {
		case "+":
			resultado = operando1 + operando2;
			System.out.println("El resultado de la suma es: " + resultado);
			break;
			case "-":
				resultado = operando1 - operando2;
				System.out.println("El resultado de la resta es: " + resultado);
				break;
			case "*":
				resultado = operando1 * operando2;
				System.out.println("El resultado de la multiplicación es: " + resultado);
				break;
			case "/":
				resultado = (double) operando1 / operando2;
				System.out.println("El resultado de la división es: " + resultado);
				break;
			case "^":
				resultado = Math.pow(operando1, operando2);
				System.out.println("El resultado de la potencia es: " + resultado);
				break;
			case "%":
				resultado = operando1 % operando2;
				System.out.println("El resultado del módulo es: " + resultado);
			    break;
			default:
				System.out.println("Operación no válida.");
				
				break;
				
		}
		


	}

}

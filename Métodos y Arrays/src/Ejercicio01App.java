import java.util.Scanner;

public class Ejercicio01App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. Pediremos
//		que figura queremos calcular su área y según lo introducido pedirá los valores necesarios
//		para calcular el área.
//      Crea un método por cada figura para calcular cada área, este devolverá
//		un número real. Muestra el resultado por pantalla.
//		Aquí te mostramos que necesita cada figura:
//		Circulo: (radio^2)*PI
//		Triangulo: (base * altura) / 2
//		Cuadrado: lado * lado
		
		Scanner sc= new Scanner(System.in);
	System.out.println("Introduce el nombre de la figura: ");
	String Figura= sc.next();
		
		switch (Figura) {
		case "circulo":
			System.out.println("Introduce el radio del circulo: ");
			double radio=sc.nextDouble();
			System.out.println("La area del circulo es: " +calcularAreaCirculo (radio) + "\n"+"\n");
			break;
		
		case "triangulo":
			System.out.println("Introduce el base del triangulo: ");
			double base=sc.nextDouble();
			System.out.println("Introduce la altura del triangulo: ");
			double altura=sc.nextDouble();
			System.out.println("La area del triangulo es :" + calcularAreaTriangulo (base, altura) + "\n"+"\n"  );
			break;
			
		case "cuadrado":
				System.out.println("Introduce el lado del cuadrado: ");
			double lado=sc.nextDouble();
			System.out.println("La area del cuadrado es "+ calcularAreaCuadrado (lado) + "\n" );
			break;
		}
		
		}
 public static double calcularAreaCirculo (double radio) {
	return Math.PI * Math.pow(radio, 2);
 
 }
 
 public static double calcularAreaTriangulo (double base, double altura) {
	 return (base*altura)/2;
	 
	 
 }
 
 public static double calcularAreaCuadrado (double lado) {
	 return lado*lado;
 }
}



package ejercicios;

public class Ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 5;
		int B = 10;
		int B1 = B;
		int C = 15;
		int D = 20;
		System.out.println("Valor de A es " + A); //5
		System.out.println("Valor de B es " + B); //10
		System.out.println("Valor de C es " + C); //15
		System.out.println("Valor de D es " + D); //20
//		B1 contiene 10

		System.out.println("B tome el valor de C = " + (B = C)); // 15
		System.out.println("C tome el valor de A = " + (C = A)); // 5
		System.out.println("A tome el valor de D = " + (A = D)); // 20
//		B1 contiene 10	
		System.out.println("D tome el valor de B = " + (D = B1)); // 10

	}

}

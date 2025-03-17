import java.util.Scanner;

public class Ejercicio07App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce la cantidad de Euros(€) que deseas cambiar: ");
		double cantidadEuros=sc.nextInt();
		System.out.println("Introduce la moneda de cambio: ");
		System.out.println("1) dolares".toLowerCase());
		System.out.println("2) yenes".toLowerCase());
		System.out.println("3) libras".toLowerCase());
		String moneda=sc.next();
		cambioMoneda(cantidadEuros, moneda);
			
		}
		
		
	
    public static void cambioMoneda(double cantidadEuros, String moneda) {
    	double resultado;
    	if (moneda.equals("libras")) {
            resultado = cantidadEuros * 0.86;
            System.out.println(cantidadEuros + "€ son " + resultado + "£.");
        } else if (moneda.equals("dolares")) {
            resultado = cantidadEuros * 1.28611;
            System.out.println(cantidadEuros + "€ son " + resultado + "$.");
        } else if (moneda.equals("yenes")) {
            resultado = cantidadEuros * 129.852;
            System.out.println(cantidadEuros + "€ son " + resultado + "¥.");
        } else {
          
            System.out.println("Moneda no válida. Por favor elige entre 'libras', 'dolares' o 'yenes'.");
        }
	
	
	
}
	
}

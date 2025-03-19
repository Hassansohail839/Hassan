import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> carritoCompra = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce la cantidad de productos: ");
		int cantidadProductos=sc.nextInt();
		
		for(int i=1; i<=cantidadProductos; i++) {
			System.out.println("Introduce el precio del producto " +i+": ");
			double precioProductos=sc.nextDouble();
			}
		
		System.out.println("Que tipo de IVA quieres aplicar? (21% o 4%)");
		double IVA=sc.nextDouble()/100;
		double Iva1=0.21;
		double Iva2=0.04;
		
	if(IVA==21){
		System.out.println();
	}
		
//		double totalBruto = 0;
//        for (double precio: carritoCompra) {
//            totalBruto += precio;
//        }
//        
        
		
		
	}

}

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
			carritoCompra.add(precioProductos);
			}
		
		System.out.println("Que tipo de IVA quieres aplicar? (21% o 4%)");
		double IVA=sc.nextDouble();
		// Calcular el precio total bruto (sin IVA)
		
        double totalBruto=0;
        for (double precio : carritoCompra) {
            totalBruto += precio;
        }

        // Calcular el precio total con IVA
        double totalConIva = totalBruto + (totalBruto * IVA / 100);

        // Mostrar detalles de la venta
        System.out.println("\nResumen de la compra:");
        System.out.println("Número de artículos comprados: " + cantidadProductos);
        System.out.println("Precio total bruto (sin IVA): " + totalBruto);
        System.out.println("IVA aplicado: " + IVA + "%");
        System.out.println("Precio total con IVA: " + totalConIva);

        // Pedir la cantidad pagada por el cliente
        System.out.print("Introduce la cantidad pagada por el cliente: ");
        double cantidadPagada = sc.nextDouble();

        // Calcular el cambio a devolver
        double cambio = cantidadPagada - totalConIva;

        // Mostrar el cambio a devolver al cliente
        if (cambio >= 0) {
            System.out.println("Cambio a devolver al cliente: " + cambio);
        } else {
            System.out.println("La cantidad pagada es insuficiente.");
        }

        // Cerrar el scanner
        sc.close();
    }

	
	
	
      
        
		
		
	}



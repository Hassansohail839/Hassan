import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class PruebaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String, Double> stock = new HashMap<String, Double>();

		stock.put("camiseta", 16.99);
		stock.put("pantalon", 20.00);
		stock.put("manzana", 2.00);
		stock.put("platano", 0.99);
		stock.put("limon", 2.50);
		stock.put("jaqueta", 35.00);
		stock.put("tomate", 1.00);
		stock.put("melon", 2.00);
		stock.put("cebolla", 1.50);
		stock.put("aguacate", 3.00);

		Scanner sc = new Scanner(System.in);
		boolean salir = false;

		while (!salir) {
			System.out.println("\nMenú de opciones:");
			System.out.println("1. Agregar un artículo nuevo en el carrito");
			System.out.println("2. Consultar un artículo del carrito");
			System.out.println("3. Listar todos los artículos del carrito");
			System.out.println("4. Salir");
			System.out.print("Elija una opción: ");

			int opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				agregarArticulo(stock, sc);
				break;

			case 2:
				consultarArticulo(stock, sc);
				break;
//            
			case 3:
				listarArticulos(stock, sc);
				break;

			case 4:
				System.out.println("Saliendo...");
				salir = true;
				break;

			default:
				System.out.println("Opcion invalida, intente de nuevo.");
			}
//			sc.close();
		}
	}

	// Metodo para añadir articulos.

	private static void agregarArticulo(HashMap<String, Double> stock, Scanner sc) {
//	    Scanner sc=new Scanner(System.in);
		System.out.print("Introduce el nombre del producto: ");
		String nombre = sc.nextLine();
		System.out.print("Introduce el precio del producto: ");
		double precio = sc.nextDouble();
		sc.nextLine();

		stock.put(nombre, precio);
		System.out.println("Artículo añadido: " + nombre + " - Precio: " + precio);
//        return;

	}

//	Metodo para consultar un producto.

	private static void consultarArticulo(HashMap<String, Double> stock, Scanner sc) {
//		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el nombre del producto que deseas consultar: ");
		String nombre = sc.nextLine();
		if (stock.containsKey(nombre)) {
			System.out.println("Producto encontrado: " + nombre + " - Precio: " + stock.get(nombre));
		} else {
			System.out.println("Producto no encontrado. ");
		}

//		return;

	}

//	
//	Metodo para listar todos los productos en el carrito de compra.
	public static void listarArticulos(HashMap<String, Double> stock, Scanner sc) {
//		 System.out.println("\nInventario:" + "\n" + stock +  " -€");
		double producto = 0;
		for (Entry<String, Double> lista : stock.entrySet()) {
//			System.out.println(producto + " - €" + stock.containsKey(producto) + stock.get(producto));
			System.out.println(lista + "€");
		}
	}

	}



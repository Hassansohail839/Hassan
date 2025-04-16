package Ejercicio01;

public class ElectrodomesticoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico electro[] = new Electrodomestico[10];

		electro[0] = new Television(300, 40, "Negro", 'A', 40, 45, true); // (precio, peso, color, consumo, carga, resolucion, TDT)
        electro[1]=new Lavadora(250, 35, "Blanco", 'B', 30); // (precio, peso, color, consumo, carga)
        electro[2]= new Electrodomestico(450, 50, "Rojo", 'A'); // (Precio, peso, color, consumo)
        electro[3] = new Television(350, 30, "Negro", 'C', 40, 50, false);
        electro[4]=new Lavadora(250, 35, "Blanco", 'B', 30);
        electro[5]= new Electrodomestico(450, 50, "Rojo", 'A');
        electro[6] = new Television(400, 20, "Blanco", 'D', 45, 40, true);
        electro[7]=new Lavadora(250, 35, "Blanco", 'B', 30);
        electro[8]= new Electrodomestico(450, 50, "Rojo", 'A');
        electro[9] = new Television(320, 35, "Negro", 'A', 40, 45, false);
        
        // 3. Variables para los totales
        double totalElectrodomesticos = 0;
        double totalLavadoras = 0;
        double totalTelevisiones = 0;

        // 4. Recorrer el array
        for (Electrodomestico e : electro) {
            double precio = e.precioFinal(); // Ejecutamos el método precioFinal

            totalElectrodomesticos += precio;

            // Usamos instanceof para identificar el tipo
            if (e instanceof Lavadora) {
                totalLavadoras += precio;
            } else if (e instanceof Television) {
                totalTelevisiones += precio;
            }
        }

        // 5. Mostrar resultados
        System.out.println("Total Electrodomésticos: " + totalElectrodomesticos);
        System.out.println("Total Lavadoras: " + totalLavadoras);
        System.out.println("Total Televisiones: " + totalTelevisiones);
        System.out.println("Total Electro: "+ (totalElectrodomesticos+totalLavadoras+totalTelevisiones));
    }

	}



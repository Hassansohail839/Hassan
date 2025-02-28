import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio06App {

	public static void main(String[] args) {
		// Lee un número por teclado que pida el precio de un producto
				//(puede tener decimales) 
				//y calcule el precio final con IVA. 
				//El IVA sera una constante que sera del 21%
				
		double iva =0.21;
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto"));
		double precioFinal = precio + (precio*iva);
		JOptionPane.showMessageDialog(null, "El precio final con IVA es de " + precioFinal);

	}

}

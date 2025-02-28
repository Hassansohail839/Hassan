import javax.swing.JOptionPane;

public class Ejercicio04App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final double PI = 3.14159;
//		String texto_num = JOptionPane.showInputDialog("Introduce el radio del circulo");
//		int radio = Integer.parseInt(texto_num);
//		JOptionPane.showMessageDialog(null,
//				"El circulo tiene un radio de " + radio + " y su area es " + (PI * (radio * 2)));

//		Opción con Math.pow
		String input = JOptionPane.showInputDialog("Introduce el radio del circulo");
		double radio = Double.parseDouble(input);
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println(" El area del circulo es: " + area);

	}

}

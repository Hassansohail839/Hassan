import javax.swing.JOptionPane;

public class pruebaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto_num = JOptionPane.showInputDialog("Introduce un numero entero");
		int radio = Integer.parseInt(texto_num);
		JOptionPane.showMessageDialog(null,
				"El circulo tiene un radio de " + radio + " y su area es " + (PI * (radio * 2)));

		
	}

}

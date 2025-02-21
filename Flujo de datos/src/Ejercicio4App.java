import javax.swing.JOptionPane;

public class Ejercicio4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double Pi=3.1412;
		String texto_num=JOptionPane.showInputDialog("Introduce el radio del circulo");
		int radio=Integer.parseInt(texto_num);
		JOptionPane.showMessageDialog(null, "El circulo tiene un radio de " +radio+ " y su area es "+(3.141*(radio*2)));
		
		
	}

}

package Ejercicio04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Raices ecuacion1 = new Raices(1, -3, 2);  // x² - 3x + 2 = 0
        ecuacion1.calcular();

        Raices ecuacion2 = new Raices(1, 2, 1);   // x² + 2x + 1 = 0
        ecuacion2.calcular();

        Raices ecuacion3 = new Raices(1, 1, 1);   // x² + x + 1 = 0
        ecuacion3.calcular();
		
	}

}

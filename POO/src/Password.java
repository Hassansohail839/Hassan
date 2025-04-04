import java.util.Random;

public class Password {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	// Atributos
	private int longitud = 8;
	private String passcode = "";

	// Constructor por defecto
	public Password() {
		this.longitud = 8;
		this.passcode = generatePassword(longitud);
	}

    //	
	private String
	generatePassword(int longitud) {
		// TODO Auto-generated method stub
		String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
		Random random = new Random();
		StringBuilder contraseñaGenerada = new StringBuilder();

		for (int i = 0; i < longitud; i++) {
			int indiceAleatorio = random.nextInt(caracteresPermitidos.length());
			contraseñaGenerada.append(caracteresPermitidos.charAt(indiceAleatorio));
			

		}
		return contraseñaGenerada.toString();
	}


}


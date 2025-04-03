
public class Persona {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	// Atributos
	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private double peso;
	private double altura;

	// Constructor por defecto.
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = "";
		this.DNI = "";
		this.peso = 0;

	}

	// Constructor con nombre edad y sexo.
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;

	}

	// Constructor de todos los atributos como parametros.
	public Persona(String nombre, int edad, String DNI, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;

	}

}

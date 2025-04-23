package Ejercicio02;

public class Videojuego implements Entregable {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	// Atributos

	private String titulo;
	private int horasEstimadas;
	private String compania;
	private boolean entregado;

	private final int HORASESTIMADAS_DEFECTO = 10;
	private final boolean ENTREGADO_DEFECTO = false;

	// Constructor por defecto
	public Videojuego() {
		super();
		this.horasEstimadas = HORASESTIMADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.compania = compania;
	}

	// Constructor con titulo y creador

	public Videojuego(String titulo, int horasEstimadas) {
		super();
		this.horasEstimadas = HORASESTIMADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.compania = compania;
	}

	// Constructor con todos los atributos menos el entregado

	public Videojuego(String titulo, int numeroTemporadas, 
			boolean entregado, String genero, String creador,
			int horasEstimadas, String compania) {
		
		this.horasEstimadas = horasEstimadas;
		this.entregado = entregado;
		this.compania = compania;

	}

	
	// Getters y Setters 
	
	public int gethorasEstimadas() {
		return horasEstimadas;
	}

	public void sethorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	
	
	public String getcompania() {
		return compania;
		
	}

	public void setcompania(String compania) {
		this.compania=compania;
		
	}
	
}

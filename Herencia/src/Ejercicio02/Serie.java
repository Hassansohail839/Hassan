package Ejercicio02;

public class Serie {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub

	// Atributos
	protected String titulo;
	protected int numeroTemporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;

	protected final static int NUMEROTEMPORADAS_DEFECTO = 3;
	protected final boolean ENTREGADO_DEFECTO = false;
	protected final String GENERO_DEFECTO = "";

	// Constructor por defecto

	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";

	}

	// Constructor con titulo y creador

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numeroTemporadas = NUMEROTEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = GENERO_DEFECTO;

	}

	// Constructor con todos los atributos excepto el entregado

	public Serie(String titulo, String creador, int numeroTemporadas, String genero) {

		this.titulo = titulo;
		this.creador = creador;
		this.numeroTemporadas = NUMEROTEMPORADAS_DEFECTO;
		this.genero = GENERO_DEFECTO;

	}

	// Getters y Setters, excepto el entregado

	public String gettitulo() {
		return titulo;
	}

	public void settitulo(String titulo) {
		this.titulo = titulo;

	}

	public int getnumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setnumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;

	}

	public String getgenero() {
		return genero;

	}

	public void setgenero(String genero) {
		this.genero = genero;

	}

	public String getcreador() {
		return genero;

	}

	public void setcreador(String creador) {
		this.creador = creador;

	}
	
	
}

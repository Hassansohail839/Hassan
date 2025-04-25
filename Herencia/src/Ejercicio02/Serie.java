package Ejercicio02;

public class Serie implements Entregable {

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
	
	public Serie(String titulo, int numeroTemporadas) {
		this.titulo = titulo;
		this.creador = "";
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = GENERO_DEFECTO;

	}

	// Constructor con todos los atributos excepto el entregado

	public Serie(String titulo, String creador, int numeroTemporadas, String genero) {

		this.titulo = titulo;
		this.creador = creador;
		this.numeroTemporadas = NUMEROTEMPORADAS_DEFECTO;
		this.genero = GENERO_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		

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

	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int compareTo(Object a) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

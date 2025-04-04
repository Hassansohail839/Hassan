
public class Serie {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	}

	// Atributos

	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	// Constructor por defecto
	public Serie() {
			this.titulo="";
			this.temporadas=3;
			this.entregado=false;
			this.genero="";
			this.creador="";
			
	}
	// Constructor con titulo y creador 
	public Serie(String titulo, String creador) {
				this.titulo=titulo;
				this.temporadas=3;
				this.entregado=false;
				this.genero="";
				this.creador=creador;
				
			}
	
	//Constructor con todos atributos como parametros excepto entregado
	
	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo=titulo;
		this.temporadas=3;
		this.genero="";
		this.creador=creador;
		
	}
	
		}



package Ejercicio03;

public class Libro {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	// Atributos

	protected String ISBN;
	protected String titulo;
	protected String autor;
	protected int numeroPaginas;
	 // Constructor
    public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Getters
    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    // Setters
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // Método toString
    @Override
    public String toString() {
        return "El libro " + titulo + " con ISBN " + ISBN +
               " creado por " + autor + " tiene " + numeroPaginas + " páginas.";
    }
}


package Ejercicio03;

public class Main {
    public static void main(String[] args) {
        // Crear dos objetos Libro
        Libro libro1 = new Libro("978-3-16-148410-0", "El código Da Vinci", " Dan Brown", 380);
        Libro libro2 = new Libro("978-84-376-0494-7", "El Señor de los anillos", "Alan Lee", 863);

        // Mostrar los libros
        System.out.println(libro1);
        System.out.println(libro2);

        // Comparar número de páginas
        if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
            System.out.println("El libro: \"" + libro1.getTitulo() + "\" tiene más páginas.");
        } else if (libro1.getNumeroPaginas() < libro2.getNumeroPaginas()) {
            System.out.println("El libro: \"" + libro2.getTitulo() + "\" tiene más páginas.");
        } else {
            System.out.println("Ambos libros tienen el mismo número de páginas.");
        }
    }
}


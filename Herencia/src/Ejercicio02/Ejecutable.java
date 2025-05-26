package Ejercicio02;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear dos arrays
		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];

		
		//Llenar los arrays 
		series[0] = new Serie("Breaking Bad", 5);
        series[1] = new Serie("Dark", 3);
        series[2] = new Serie("Stranger Things", 4);
        series[3] = new Serie("Friends", 10);
        series[4] = new Serie("The Office",  9);

        videojuegos[0] = new Videojuego("Zelda", 50);
        videojuegos[1] = new Videojuego("Mario Kart", 25);
        videojuegos[2] = new Videojuego("The Witcher", 60);
        videojuegos[3] = new Videojuego("Minecraft", 40);
        videojuegos[4] = new Videojuego("FIFA", 30);
        
        
        // Entregar algunos videojuegos y series
        series[1].entregar();
        series[3].entregar();
        videojuegos[0].entregar();ww
        videojuegos[2].entregar();
        
        
        System.out.println("Series Disponible: ");
        for (Serie serie:Serie) {
        	
        }
        
        int seriesEntregadas = 0;
        int videojuegosEntregados = 0;

        for (Serie s : series) {
            if (s.isEntregado()) {
                seriesEntregadas++;
                s.devolver(); // devolver después de contar
            }
        }

        for (Videojuego v : videojuegos) {
            if (v.isEntregado()) {
                videojuegosEntregados++;
                v.devolver(); // devolver después de contar
            }
        }

        System.out.println("Series entregadas: " + seriesEntregadas);
        System.out.println("Videojuegos entregados: " + videojuegosEntregados);

        
        
        Videojuego videojuegoMax = videojuegos[0];
        Serie serieMax = series[0];

        for (int i = 1; i < videojuegos.length; i++) {
            if (videojuegos[i].compareTo(videojuegoMax) > 0) {
                videojuegoMax = videojuegos[i];
            }
        }

        for (int i = 1; i < series.length; i++) {
            if (series[i].compareTo(serieMax) > 0) {
                serieMax = series[i];
            }
        }

        System.out.println("\nVideojuego con más horas estimadas:");
        System.out.println(videojuegoMax);

        System.out.println("\nSerie con más temporadas:");
        System.out.println(serieMax);
    }


	}



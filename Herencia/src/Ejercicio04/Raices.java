package Ejercicio04;

public class Raices {
    private double a;
    private double b;
    private double c;

    // Constructor
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    
    public boolean tieneRaices() {
        return getDiscriminante() > 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    
    public void obtenerRaices() {
        if (tieneRaices()) {
            double discriminante = Math.sqrt(getDiscriminante());
            double x1 = (-b + discriminante) / (2 * a);
            double x2 = (-b - discriminante) / (2 * a);
            System.out.println("Solución 1: " + x1);
            System.out.println("Solución 2: " + x2);
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double x = -b / (2 * a);
            System.out.println("Única solución: " + x);
        }
    }
    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No hay soluciones reales.");
        }
    }
}

    


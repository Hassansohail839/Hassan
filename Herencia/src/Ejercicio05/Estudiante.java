package Ejercicio05;


public class Estudiante extends Persona {
    private double calificacion;

    public Estudiante(String nombre, int edad, String sexo, double calificacion) {
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
    }

    // 50% de probabilidad de no asistir
    public boolean estaDisponible() {
        return Math.random() > 0.5;
    }

    public boolean estaAprobado() {
        return calificacion >= 5;
    }

    public double getCalificacion() {
        return calificacion;
    }
}

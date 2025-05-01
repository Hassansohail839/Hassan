package Ejercicio05;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, int edad, String sexo, String materia) {
        super(nombre, edad, sexo);
        this.materia = materia;
    }

    // 80% de probabilidad de estar disponible
    public boolean estaDisponible() {
        return Math.random() > 0.2;
    }

    public String getMateria() {
        return materia;
    }
}

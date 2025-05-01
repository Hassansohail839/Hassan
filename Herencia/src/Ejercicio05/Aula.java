package Ejercicio05;

import java.util.ArrayList;

public class Aula {
    private int id;
    private int maxEstudiantes;
    private String materia;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

    public Aula(int id, int maxEstudiantes, String materia) {
        this.id = id;
        this.maxEstudiantes = maxEstudiantes;
        this.materia = materia;
        this.estudiantes = new ArrayList<>();
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarEstudiante(Estudiante e) {
        if (estudiantes.size() < maxEstudiantes) {
            estudiantes.add(e);
        }
    }

    public boolean puedeDarseClase() {
        if (profesor == null) {
            System.out.println("No hay profesor asignado.");
            return false;
        }

        if (!profesor.estaDisponible()) {
            System.out.println("El profesor no está disponible.");
            return false;
        }

        if (!profesor.getMateria().equalsIgnoreCase(materia)) {
            System.out.println("La materia del profesor no coincide con la del aula.");
            return false;
        }

        int estudiantesPresentes = 0;
        for (Estudiante e : estudiantes) {
            if (e.estaDisponible()) {
                estudiantesPresentes++;
            }
        }

        if (estudiantesPresentes <= estudiantes.size() / 2) {
            System.out.println("No hay suficientes estudiantes presentes.");
            return false;
        }

        return true;
    }

    public void mostrarAprobados() {
        if (!puedeDarseClase()) {
            System.out.println("No se puede dar la clase.");
            return;
        }

        int aprobadosHombres = 0;
        int aprobadasMujeres = 0;

        for (Estudiante e : estudiantes) {
            if (e.estaDisponible() && e.estaAprobado()) {
                if (e.getSexo().equalsIgnoreCase("M")) {
                    aprobadosHombres++;
                } else if (e.getSexo().equalsIgnoreCase("F")) {
                    aprobadasMujeres++;
                }
            }
        }

        System.out.println("Clase impartida correctamente.");
        System.out.println("Aprobados hombres: " + aprobadosHombres);
        System.out.println("Aprobadas mujeres: " + aprobadasMujeres);
    }
}

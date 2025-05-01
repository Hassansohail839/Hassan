package Ejercicio05;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear aula
        Aula aula = new Aula(1, 20, "Matemáticas");

        // Crear y asignar profesor
        Profesor profe = new Profesor("Carlos", 45, "M", "Matemáticas");
        aula.asignarProfesor(profe);

        // Crear y añadir estudiantes con datos aleatorios
        for (int i = 1; i <= 20; i++) {
            String nombre = "Alumno" + i;
            int edad = 18 + new Random().nextInt(5); // 18 a 22 años
            String sexo = (i % 2 == 0) ? "M" : "F";
            double nota = Math.round((Math.random() * 10) * 10.0) / 10.0;
            Estudiante e = new Estudiante(nombre, edad, sexo, nota);
            aula.agregarEstudiante(e);
        }

        // Mostrar resultados
        aula.mostrarAprobados();
    }
}

package Ejercicio05;

public class Persona {
    protected String nombre;
    protected int edad;
    protected String sexo; // "M" o "F"

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNombre() {
        return nombre;
    }
}


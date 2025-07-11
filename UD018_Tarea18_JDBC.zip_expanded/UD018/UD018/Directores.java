package UD018;

import java.sql.Connection;
import java.sql.Statement;
import conexion.Conexion;

public class Directores {
    public static void main(String[] args) {
        Connection con = Conexion.conectar("directores");
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO despachos (capacidad) VALUES (10), (5)");
            stmt.executeUpdate("INSERT INTO directores (dni, nom_apels, despacho)"
            		+ "VALUES ('34215768P', 'Ana Lóiez', 4)");
            stmt.executeUpdate("INSERT INTO directores (dni, nom_apels, despacho, dni_jefe) VALUES ('98789321B', 'Luis Pérez', 2, '12345678A')");
            System.out.println("Registros insertados en directores correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

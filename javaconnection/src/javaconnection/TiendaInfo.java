package javaconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TiendaInfo {
    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/TiendaInformatica", // Cambia si tu puerto es distinto
                "root",    // usuario de MySQL
                ""         // contraseña (vacía si estás usando XAMPP por defecto)
            );
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}


package javaconnection;

public class tiendainformatica {
	 Connection con = Conexion.conectar("tiendainformatica");
     try {
         Statement stmt = con.createStatement();
         stmt.executeUpdate("INSERT INTO fabricantes (nombre) VALUES ('Samsung'), ('Sony')");
         stmt.executeUpdate("INSERT INTO articulos (nombre, precio, fabricante) VALUES ('TV', 500, 1), ('Cámara', 300, 2)");
         System.out.println("Registros insertados en tiendainfo correctamente.");
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}



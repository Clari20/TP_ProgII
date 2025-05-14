package org.example;

import java.sql.*;

public class DatabaseManager {

    private static final String URL = "jdbc:h2:~/test;AUTO_SERVER=TRUE";
    private static final String USER = "sa";
    private static final String PASSWORD = "";


    //al hacer este metodo, te conectas a la base de datos
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }


    //crea tabla
    //se pued eponer un update, un delete, lo que sea
    public static void createTable(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS Persona (" +
                "ID INT PRIMARY KEY, " +
                "Nombre VARCHAR(255) NOT NULL)";
        try (
                //statement es una instruccion
                Statement stmt = conn.createStatement()) {
            //ejecutar
            stmt.execute(sql);
            System.out.println("Tabla 'Persona' creada exitosamente.");
        }catch (SQLException e){

            System.out.println("No se pudo crear la tabla");
            e. printStackTrace();
        }
    }

    /**
     * Inserta una nueva persona en la tabla 'Persona'.
     *
     * @param persona El objeto Persona a insertar.
     * @throws SQLException si ocurre un error al insertar la persona.
     */
    public static void insertPersona(Persona persona) throws SQLException {
        String sql = "INSERT INTO Persona (ID, Nombre) VALUES (?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            //primer campo de la tabla
            pstmt.setInt(1, persona.getId());
            //segundo campo de tabla
            pstmt.setString(2, persona.getNombre());
            //ejecutar el metodo
            pstmt.executeUpdate();
            System.out.println("Persona insertada correctamente: " + persona.getNombre());
        } catch (SQLException e) {

            System.out.println("No se pudo insertar la persona a la tabla");
            e.printStackTrace();
        }



    }


    // Otros métodos según sea necesario


    public void disconnect(){

    }
}


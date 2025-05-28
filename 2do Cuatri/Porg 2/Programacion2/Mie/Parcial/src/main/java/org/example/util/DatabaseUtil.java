package org.example.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DatabaseUtil {

    private static final Logger logger = LogManager.getLogger(DatabaseUtil.class);
    private static final String URL = "jdbc:h2:~/test"; // Base en archivo, carpeta 'data'
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    static {
        try {
            // Esto ya no es necesario en JDBC 4+, pero si se desea mantener:
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            logger.error("No se encontró el driver de H2", e);
        }
    }

    public static Connection getConnection() {
        try {
            logger.info("Estableciendo conexión con la base de datos H2...");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            logger.error("Error al obtener la conexión a la base de datos", e);
            throw new RuntimeException("No se pudo conectar a la base de datos", e);
        }
    }

    public static void inicializarDB(Connection conn) {
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS autor (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nombre VARCHAR(255) NOT NULL)");

            stmt.execute("CREATE TABLE IF NOT EXISTS libro (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "titulo VARCHAR(255) NOT NULL, " +
                    "autor_id INT, " +
                    "FOREIGN KEY (autor_id) REFERENCES autor(id))");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void actualizarEstructuraDB(Connection conn) {
        try (Statement stmt = conn.createStatement()) {
            // Intentá agregar cada columna si no existe (H2 lo permite si no hay conflicto)
            stmt.execute("ALTER TABLE autor ADD COLUMN IF NOT EXISTS apellido VARCHAR(100)");
            stmt.execute("ALTER TABLE autor ADD COLUMN IF NOT EXISTS nacionalidad VARCHAR(100)");
            stmt.execute("ALTER TABLE autor ADD COLUMN IF NOT EXISTS fechaNacimiento DATE");
            stmt.execute("ALTER TABLE libro ADD COLUMN IF NOT EXISTS disponible BOOLEAN");
            stmt.execute("ALTER TABLE libro ADD COLUMN IF NOT EXISTS autor_id INT");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void reiniciarBaseDeDatos(Connection conn) {
        try (Statement stmt = conn.createStatement()) {
            // Eliminar primero la tabla con clave foránea
            stmt.execute("DROP TABLE IF EXISTS libro");
            stmt.execute("DROP TABLE IF EXISTS autor");

            // Crear la tabla autor nuevamente
            stmt.execute("""
            CREATE TABLE autor (
                id INT AUTO_INCREMENT PRIMARY KEY,
                nombre VARCHAR(100),
                apellido VARCHAR(100),
                nacionalidad VARCHAR(100),
                fechaNacimiento DATE
            )
        """);

            // Crear la tabla libro nuevamente
            stmt.execute("""
            CREATE TABLE libro (
                id INT AUTO_INCREMENT PRIMARY KEY,
                titulo VARCHAR(100),
                disponible BOOLEAN,
                autor_id INT,
                FOREIGN KEY (autor_id) REFERENCES autor(id)
            )
        """);

            System.out.println("Base de datos reiniciada desde Java.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }





}

package org.example.main;



import org.example.dao.AutorDAO;
import org.example.dao.AutorDAOImpl;
import org.example.dao.LibroDAO;
import org.example.dao.LibroDAOImpl;
import org.example.model.Autor;
import org.example.model.Libro;
import org.example.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try (Connection conn = DatabaseUtil.getConnection();
             Scanner scanner = new Scanner(System.in)) {





            AutorDAO autorDAO = new AutorDAOImpl(conn);
            LibroDAO libroDAO = new LibroDAOImpl(conn);


            boolean running = true;

            while (running) {
                System.out.println("\n---- Menú ----");
                System.out.println("1. Crear autor");
                System.out.println("2. Listar autores");
                System.out.println("3. Crear libro");
                System.out.println("4. Listar libros");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");

                String input = scanner.nextLine();

                switch (input) {
                    case "1":
                        System.out.print("Nombre del autor: ");
                        String nombre = scanner.nextLine().trim();

                        System.out.print("Apellido: ");
                        String apellido = scanner.nextLine().trim();

                        System.out.print("Nacionalidad: ");
                        String nacionalidad = scanner.nextLine().trim();

                        System.out.print("Fecha de nacimiento (yyyy-mm-dd): ");
                        String fechaStr = scanner.nextLine().trim();
                        LocalDate fechaNacimiento = null;
                        try {
                            fechaNacimiento = LocalDate.parse(fechaStr);
                        } catch (DateTimeParseException e) {
                            System.out.println("Fecha inválida, se asignará null.");
                        }

                        Autor autor = new Autor(nombre, apellido, nacionalidad, fechaNacimiento);
                        autorDAO.insert(autor);
                        System.out.println("Autor creado.");
                        break;


                    case "2":
                        System.out.println("Lista de autores:");
                        for (Autor a : autorDAO.getAll()) {
                            System.out.println(a);
                        }
                        break;

                    case "3":
                        System.out.print("Título del libro: ");
                        String titulo = scanner.nextLine().trim();

                        System.out.print("ID del autor: ");
                        int idAutor = Integer.parseInt(scanner.nextLine().trim());

                        Autor autorLibro = autorDAO.getById(idAutor);
                        if (autorLibro == null) {
                            System.out.println("Autor no encontrado.");
                            break;
                        }

                        System.out.print("¿Está disponible? (true/false): ");
                        boolean disponible = Boolean.parseBoolean(scanner.nextLine().trim());

                        Libro libro = new Libro(titulo, autorLibro, disponible);
                        libroDAO.insert(libro);
                        System.out.println("Libro creado.");

                        break;

                    case "4":
                        System.out.println("Lista de libros:");
                        for (Libro l : libroDAO.getAll()) {
                            System.out.println(l);
                        }
                        break;

                    case "5":
                        running = false;
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }
            }

        } catch (SQLException e) {
            logger.error("Error en la conexión o en una operación con la base de datos", e);
        } catch (Exception e) {
            logger.error("Error inesperado", e);
        }
    }
}

package org.example.dao;


import org.example.model.Autor;
import org.example.model.Libro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibroDAOImpl extends LibroDAO {

    public LibroDAOImpl(Connection connection) {
        super(connection);
    }

    @Override
    public void insert(Libro libro) {
        String sql = "INSERT INTO libro (titulo, disponible, autor_id) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, libro.getTitulo());
            stmt.setBoolean(2, libro.isDisponible());
            stmt.setInt(3, libro.getAutor().getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Libro> getAll() {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT l.id, l.titulo, l.disponible, a.id as autor_id, a.nombre, a.apellido, a.nacionalidad, a.fechaNacimiento " +
                "FROM libro l JOIN autor a ON l.autor_id = a.id";

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Autor autor = new Autor(
                        rs.getInt("autor_id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("nacionalidad"),
                        rs.getDate("fechaNacimiento") != null ? rs.getDate("fechaNacimiento").toLocalDate() : null
                );

                Libro libro = new Libro(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        autor,
                        rs.getBoolean("disponible")
                );

                libros.add(libro);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return libros;
    }

}


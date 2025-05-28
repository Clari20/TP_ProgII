package org.example.dao;


import org.example.model.Autor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AutorDAOImpl extends AutorDAO {

    public AutorDAOImpl(Connection connection) {
        super(connection);  // Usa el constructor del padre que guarda connection
    }

    @Override
    public void insert(Autor autor) {
        String sql = "INSERT INTO autor (nombre, apellido, nacionalidad, fechaNacimiento) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, autor.getNombre());
            stmt.setString(2, autor.getApellido());
            stmt.setString(3, autor.getNacionalidad());
            stmt.setDate(4, autor.getFechaNacimiento() != null ? Date.valueOf(autor.getFechaNacimiento()) : null);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Autor> getAll() {
        List<Autor> lista = new ArrayList<>();
        String sql = "SELECT * FROM autor";

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Autor autor = new Autor(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("nacionalidad"),
                        rs.getDate("fechaNacimiento") != null ? rs.getDate("fechaNacimiento").toLocalDate() : null
                );
                lista.add(autor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }


    @Override
    public Autor getById(int id) {
        String sql = "SELECT * FROM autor WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Autor(rs.getInt("id"), rs.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}

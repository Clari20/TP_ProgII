package org.example.dao;


import org.example.model.Libro;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;



public abstract class LibroDAO extends GenericDAO {
    public LibroDAO(Connection connection) {
        super(connection);
    }

    public abstract void insert(Libro libro);

    public abstract List<Libro> getAll();

}
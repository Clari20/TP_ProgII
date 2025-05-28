package org.example.dao;


import org.example.model.Autor;

import java.sql.Connection;
import java.util.List;




public abstract class AutorDAO extends GenericDAO {
    public AutorDAO(Connection connection) {
        super(connection);
    }

    public abstract void insert(Autor autor);

    public abstract List<Autor> getAll();

    public abstract Autor getById(int id);


}

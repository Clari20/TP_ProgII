package org.example.dao;



import java.sql.Connection;

public abstract class GenericDAO {
    protected Connection connection;

    public GenericDAO(Connection connection) {
        this.connection = connection;
    }
}

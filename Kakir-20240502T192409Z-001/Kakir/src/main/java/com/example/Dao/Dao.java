package com.example.Dao;
import java.sql.Connection;
import java.util.ArrayList;

public abstract class Dao<T> {
    protected Connection connection;

    public Dao(Connection connection){
        this.connection = connection;
    }
    public abstract T getById(int id);

    public abstract ArrayList<T> getAll();

//    public abstract void update(T entity, int id);
//
//    public abstract void delete(int id);
//
//    public  void add(T entity){
//
//    }

}

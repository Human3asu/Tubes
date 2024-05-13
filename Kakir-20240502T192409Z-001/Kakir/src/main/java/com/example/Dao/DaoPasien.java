package com.example.Dao;

import com.example.kasir.Pasien;
import com.example.kasir.Penyakit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoPasien extends Dao<Pasien> {
    public DaoPasien(Connection connection) {
        super(connection);
    }

    @Override
    public ArrayList<Pasien> getAll() {
        Pasien pasien;
        ArrayList<Pasien> pasienList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM pasien");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                pasien = new Pasien(result.getString("name"), new Penyakit("contoh"));
                pasienList.add(pasien);
            }
            return pasienList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Pasien getById(int id){
        //
        return null;
    }



}

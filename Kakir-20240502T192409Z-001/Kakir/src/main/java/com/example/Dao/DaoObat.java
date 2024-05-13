package com.example.Dao;

import com.example.kasir.Obat;
import com.example.kasir.Penyakit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoObat extends Dao<Obat> {
    public DaoObat(Connection connection) {
        super(connection);
    }

    @Override
    public ArrayList<Obat> getAll() {
        ArrayList<Obat> obatList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM obat");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                String namaObat = result.getString("namaObat");
                String jenisObat = result.getString("jenisObat");
                int dosis = result.getInt("Dosis");
                double harga = result.getDouble("HargaObat");
                // Buat objek Obat dari nilai yang diambil dari database
                Obat obat = new Obat(namaObat, harga, jenisObat, dosis, new Penyakit("contoh"));
                obatList.add(obat);
            }
            System.out.println(obatList);
            return obatList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public Obat getById(int id){
        return null;
    }

    public void add(Obat obat){
            try {
                PreparedStatement statement = connection.prepareStatement("INSERT INTO obat (namaObat, jenisObat, Dosis, HargaObat) VALUES (?, ?, ?, ?");
                statement.setString(1, obat.getNameObat());
                statement.setString(2, obat.getJenisObat());
                statement.setDouble(3, obat.getDosis());
                statement.setDouble(4, obat.getHarga());
                statement.executeUpdate();
                System.out.println(statement);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }


}

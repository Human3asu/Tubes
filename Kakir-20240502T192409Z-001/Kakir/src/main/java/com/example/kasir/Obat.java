package com.example.kasir;

public class Obat {
    private String nameObat;
    private double harga;
    private String jenisObat;
    private int dosis;
    private Penyakit penyakit;

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public Penyakit getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(Penyakit penyakit) {
        this.penyakit = penyakit;
    }

    public Obat(String nameObat, double harga, String jenisObat, int dosis, Penyakit penyakit) {
        this.nameObat = nameObat;
        this.harga = harga;
        this.jenisObat = jenisObat;
        this.dosis = dosis;
        this.penyakit = penyakit;
    }

    public String getNameObat() {
        return nameObat;
    }

    public void setNameObat(String nameObat) {
        this.nameObat = nameObat;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Obat{" +
                "nameObat='" + nameObat + '\'' +
                ", harga=" + harga +
                '}';
    }

    public String getJenisObat() {
        return jenisObat;
    }

    public void setJenisObat(String jenisObat) {
        this.jenisObat = jenisObat;
    }
}
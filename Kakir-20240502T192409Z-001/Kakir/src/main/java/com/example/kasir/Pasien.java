package com.example.kasir;

public class Pasien {
    private String nama;
    private Penyakit penyakit;

    public Pasien(String nama, Penyakit penyakit) {
        this.nama = nama;
        this.penyakit = penyakit;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Penyakit getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(Penyakit penyakit) {
        this.penyakit = penyakit;
    }
}
package com.example.kasir;

public class Dokter {
    private String nama;
    private Obat obat;

    public Dokter(String nama, Obat obat) {
        this.nama = nama;
        this.obat = obat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Obat getObat() {
        return obat;
    }

    public void setObat(Obat obat) {
        this.obat = obat;
    }
}
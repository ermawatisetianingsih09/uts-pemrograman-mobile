package com.example.katologmotormatic.model;



public class Motor {
    private String merek;
    private String jenis;
    private String tahun;
    private String deskripsi;
    private int drawableRes;

    public Motor(String merek, String jenis, String tahun, String deskripsi, int drawableRes) {
        this.merek= merek;
        this.jenis= jenis;
        this.tahun = tahun;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getJenis() { return jenis; }

    public void setJenis(String jenis) { this.jenis = jenis; }

    public String getTahun() { return tahun; }

    public void setTahun(String tahun) { this.tahun= tahun; }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}

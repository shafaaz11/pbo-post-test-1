/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.post.test1;

/**
 *
 * @author Asus Vivobook
 */
class PemainBola {
    private String nama;
    private String posisi;
    private int nomorPunggung;
    private String klub; 

    public PemainBola(String nama, String posisi, int nomorPunggung, String klub) {
        this.nama = nama;
        this.posisi = posisi;
        this.nomorPunggung = nomorPunggung;
        this.klub = klub;
    }

    public String getNama() {
        return nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public int getNomorPunggung() {
        return nomorPunggung;
    } 

    public String getKlub() {
        return klub;
    }

    public String toString() {
        return "Nama Pemain: " + nama + "\nPosisi: " + posisi + "\nNomor Punggung: " + nomorPunggung + "\nKlub: " + klub + "\n";
    }
}

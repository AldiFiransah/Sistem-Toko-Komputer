/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_toko_komputer;

public class Laptop extends Komputer {
    private int kapasitasBaterai;

    public Laptop(String nama, String processor, String kartuGrafis, int ram, int ssd, double harga, int kapasitasBaterai) {
        super(nama, processor, kartuGrafis, ram, ssd, harga);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public int getKapasitasBaterai() { return this.kapasitasBaterai; }
    public void setKapasitasBaterai(int kapasitasBaterai) { this.kapasitasBaterai = kapasitasBaterai; }

    @Override
    public void tampilkanInfo() {
        System.out.print("[Laptop]  ");
        super.tampilkanInfo();
        System.out.printf("          -> Spesifikasi Tambahan: Baterai %d mAh%n", this.kapasitasBaterai);
    }

    @Override
    public void caraPakai() {
        System.out.println("          -> Info Pakai: Laptop bisa digunakan tanpa dicolok listrik (portabel).");
    }
}
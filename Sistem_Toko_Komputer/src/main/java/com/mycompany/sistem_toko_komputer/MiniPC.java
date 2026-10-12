/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_toko_komputer;

public class MiniPC extends Komputer implements DapatGaransi {
    private double beratKg;

    public MiniPC(String nama, String processor, String kartuGrafis, int ram, int ssd, double harga, double beratKg) {
        super(nama, processor, kartuGrafis, ram, ssd, harga);
        this.beratKg = beratKg;
    }

    public double getBeratKg() { return this.beratKg; }
    public void setBeratKg(double beratKg) { this.beratKg = beratKg; }

    @Override
    public void tampilkanInfo() {
        System.out.print("[Mini PC] ");
        super.tampilkanInfo();
        System.out.printf("          -> Spesifikasi Tambahan: Berat %.1f Kg%n", this.beratKg);
    }

    @Override
    public void caraPakai() {
        System.out.println("          -> Info Pakai: Mini PC sangat ringan, hemat tempat, dan bisa dipasang di belakang layar monitor.");
    }

    @Override
    public void hitungBiayaLayanan() {
        System.out.println("          -> Biaya Layanan Service: Rp 100.000 / kunjungan.");
    }

    @Override
    public void klaimGaransi() {
        System.out.println("          -> [KLAIM GARANSI] Garansi Replacement 1-to-1 untuk unit Mini PC.");
    }
}
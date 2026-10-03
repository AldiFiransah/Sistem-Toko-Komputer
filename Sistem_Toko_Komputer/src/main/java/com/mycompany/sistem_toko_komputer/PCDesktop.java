/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_toko_komputer;

public class PCDesktop extends Komputer {
    private int dayaPSU;

    public PCDesktop(String nama, String processor, String kartuGrafis, int ram, int ssd, double harga, int dayaPSU) {
        super(nama, processor, kartuGrafis, ram, ssd, harga);
        this.dayaPSU = dayaPSU;
    }

    public int getDayaPSU() { return this.dayaPSU; }
    public void setDayaPSU(int dayaPSU) { this.dayaPSU = dayaPSU; }

    @Override
    public void tampilkanInfo() {
        System.out.print("[Desktop] ");
        super.tampilkanInfo();
        System.out.printf("          -> Spesifikasi Tambahan: Power Supply %d Watt%n", this.dayaPSU);
    }

    @Override
    public void caraPakai() {
        System.out.println("          -> Info Pakai: PC Desktop wajib dicolok ke sumber listrik terus-menerus.");
    }
}
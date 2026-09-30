/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_toko_komputer;

public class PCDesktop extends Komputer {
    private String kartuGrafis;
    private int dayaPSU;

    public PCDesktop(String namaPerangkat, String processor, int ramGB, double harga, String kartuGrafis, int dayaPSU) {
        super(namaPerangkat, processor, ramGB, harga);
        this.kartuGrafis = kartuGrafis;
        this.dayaPSU = dayaPSU;
    }

    public String getKartuGrafis() { return this.kartuGrafis; }
    public void setKartuGrafis(String kartuGrafis) { this.kartuGrafis = kartuGrafis; }

    public int getDayaPSU() { return this.dayaPSU; }
    public void setDayaPSU(int dayaPSU) { this.dayaPSU = dayaPSU; }

    @Override
    public void tampilkanInfo() {
        System.out.print("[DESKTOP] ");
        super.tampilkanInfo();
        System.out.printf(" | GPU: %-15s | PSU: %d W%n", this.kartuGrafis, this.dayaPSU);
    }
    
    @Override
    public void spesifikasiLayanan() {
        System.out.println("  -> Info Layanan: Gratis rakitan, kustomisasi airflow, dan garansi part distributor.");
    }
}
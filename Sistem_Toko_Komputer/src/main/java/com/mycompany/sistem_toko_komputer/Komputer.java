/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_toko_komputer;

public class Komputer {
    private String namaPerangkat;
    private String processor;
    private int ramGB;
    private double harga;

    public static int totalKomputer = 0;

    public Komputer(String namaPerangkat, String processor, int ramGB, double harga) {
        this.namaPerangkat = namaPerangkat;
        this.processor = processor;
        this.ramGB = ramGB;
        setHarga(harga);
        totalKomputer++;
    }

    public String getNamaPerangkat() { return this.namaPerangkat; }
    public void setNamaPerangkat(String namaPerangkat) { this.namaPerangkat = namaPerangkat; }

    public String getProcessor() { return this.processor; }
    public void setProcessor(String processor) { this.processor = processor; }

    public int getRamGB() { return this.ramGB; }
    public void setRamGB(int ramGB) { this.ramGB = ramGB; }

    public double getHarga() { return this.harga; }
    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("[Peringatan] Harga tidak valid! Diset ke Rp 1.000.000");
            this.harga = 1000000;
        }
    }

    public void tampilkanInfo() {
        System.out.printf("Nama: %-18s | CPU: %-18s | RAM: %2d GB | Harga: Rp %,.0f", 
                          this.namaPerangkat, this.processor, this.ramGB, this.harga);
    }
    
    public void spesifikasiLayanan() {
        System.out.println("Layanan: Garansi standar toko 1 tahun.");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_toko_komputer;

public class Laptop extends Komputer {
    private double ukuranLayar;

    public Laptop(String namaPerangkat, String processor, int ramGB, double harga, double ukuranLayar) {
        super(namaPerangkat, processor, ramGB, harga);
        this.ukuranLayar = ukuranLayar;
    }

    public double getUkuranLayar() { return this.ukuranLayar; }
    public void setUkuranLayar(double ukuranLayar) { this.ukuranLayar = ukuranLayar; }

    @Override
    public void tampilkanInfo() {
        System.out.print("[LAPTOP]  ");
        super.tampilkanInfo();
        System.out.printf(" | Layar: %.1f Inci%n", this.ukuranLayar);
    }
    
    @Override
    public void spesifikasiLayanan() {
        System.out.println("  -> Info Layanan: Garansi baterai 6 bulan & adaptor charger original.");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_toko_komputer;

public class Komputer {
    private String nama;
    private String processor;
    private String kartuGrafis;
    private int ram;
    private int ssd;
    private double harga;

    public static int totalKomputerBerhasilDibuat = 0;

    public Komputer(String nama, String processor, String kartuGrafis, int ram, int ssd, double harga) {
        this.nama = nama;
        this.processor = processor;
        this.kartuGrafis = kartuGrafis;
        this.ram = ram;
        this.ssd = ssd;
        
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak valid! Diset ke 0.");
            this.harga = 0;
        }
        
        totalKomputerBerhasilDibuat++;
    }

    public String getNama() { return this.nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getProcessor() { return this.processor; }
    public void setProcessor(String processor) { this.processor = processor; }

    public String getKartuGrafis() { return this.kartuGrafis; }
    public void setKartuGrafis(String kartuGrafis) { this.kartuGrafis = kartuGrafis; }

    public int getRam() { return this.ram; }
    public void setRam(int ram) { 
        if(ram > 0) this.ram = ram; 
    }

    public int getSsd() { return this.ssd; }
    public void setSsd(int ssd) { 
        if(ssd > 0) this.ssd = ssd; 
    }

    public double getHarga() { return this.harga; }
    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak valid!");
        }
    }

    public void tampilkanInfo() {
        System.out.printf("Nama: %-15s | CPU: %-18s | GPU: %-12s | RAM: %-2d GB | SSD: %-3d GB | Harga: Rp %,.0f%n",
                          this.nama, this.processor, this.kartuGrafis, this.ram, this.ssd, this.harga);
    }

    public void caraPakai() {
        System.out.println("Komputer dinyalakan dengan menekan tombol power.");
    }
}
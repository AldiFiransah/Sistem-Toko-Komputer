/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistem_toko_komputer;

import java.util.Scanner;

public class Sistem_Toko_Komputer {

    public static void cariKomputer(String nama, Komputer[] daftarKomputer, int jumlahKomputer) {
        System.out.println("\n--- Hasil Pencarian (Berdasarkan Nama: " + nama + ") ---");
        boolean ditemukan = false;
        for (int i = 0; i < jumlahKomputer; i++) {
            if (daftarKomputer[i].getNama().equalsIgnoreCase(nama)) {
                System.out.print("- Ditemukan: ");
                daftarKomputer[i].tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Komputer dengan nama tersebut tidak ditemukan.");
    }

    public static void cariKomputer(double harga, Komputer[] daftarKomputer, int jumlahKomputer) {
        System.out.println("\n--- Hasil Pencarian (Harga <= Rp " + String.format("%,.0f", harga) + ") ---");
        boolean ditemukan = false;
        for (int i = 0; i < jumlahKomputer; i++) {
            if (daftarKomputer[i].getHarga() <= harga) {
                System.out.print("- Ditemukan: ");
                daftarKomputer[i].tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Tidak ada komputer di bawah atau sama dengan harga tersebut.");
    }

    public static void simulasiUjiCoba(Komputer item) {
        item.caraPakai();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Komputer[] daftarKomputer = new Komputer[50];
            int jumlahKomputer = 0;
            boolean isRunning = true;

            daftarKomputer[jumlahKomputer++] = new Laptop("Asus ROG", "Core i7 Gen 13", "RTX 4060", 16, 512, 18000000, 4000);
            daftarKomputer[jumlahKomputer++] = new Laptop("Acer Swift", "Ryzen 5 Gen 7000", "Radeon", 8, 512, 9000000, 3500);
            daftarKomputer[jumlahKomputer++] = new PCDesktop("Model 1", "Core i5 Gen 12", "GTX 1650", 16, 512, 7500000, 500);
            daftarKomputer[jumlahKomputer++] = new PCDesktop("Model 2", "Core i9 Gen 14", "RTX 4090", 64, 2048, 45000000, 1000);
            daftarKomputer[jumlahKomputer++] = new MiniPC("Intel NUC 13", "Core i7 Gen 13", "Iris Xe", 16, 1000, 12000000, 0.6);
            daftarKomputer[jumlahKomputer++] = new MiniPC("Mac Mini M2", "Apple M2", "10-Core GPU", 8, 512, 11500000, 1.2);
            daftarKomputer[jumlahKomputer++] = new MiniPC("Gigabyte Brix", "Ryzen 7", "Radeon RX", 16, 512, 8500000, 0.9);

            System.out.println("<================================================>");
            System.out.println("               <<Toko Komputer>>                  ");
            System.out.println("<================================================>");

            while (isRunning) {
                System.out.println("\nMenu Utama:");
                System.out.println("1. Tambah Komputer");
                System.out.println("2. Lihat Daftar Komputer & Simulasi");
                System.out.println("3. Cari Komputer ");
                System.out.println("4. Keluar");
                System.out.print("Pilih Menu: 1-4: ");

                int pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1 -> {
                        if (jumlahKomputer < daftarKomputer.length) {
                            System.out.println("\n-- Pilih Jenis Komputer --");
                            System.out.println("1. Laptop");
                            System.out.println("2. PC Desktop");
                            System.out.println("3. Mini PC");
                            System.out.print("Pilihan (1/2/3): ");
                            
                            int jenis = scanner.nextInt();
                            scanner.nextLine();
                            
                            if (jenis == 1) {
                                System.out.print("Masukkan Merk/Nama Laptop: ");
                            } else if (jenis == 2) {
                                System.out.print("Masukkan Nama Model PC: ");
                            } else if (jenis == 3) {
                                System.out.print("Masukkan Nama/Merk Mini PC: ");
                            } else {
                                System.out.println("Pilihan tidak valid.");
                                break;
                            }
                            
                            String namaBaru = scanner.nextLine();
                            
                            System.out.print("Masukkan Processor dan generasinya: ");
                            String cpuBaru = scanner.nextLine();
                            
                            System.out.print("Masukkan Kartu Grafis: ");
                            String gpuBaru = scanner.nextLine();
                            
                            System.out.print("Masukkan RAM (GB): ");
                            int ramBaru = scanner.nextInt();
                            
                            System.out.print("Masukkan SSD (GB): ");
                            int ssdBaru = scanner.nextInt();
                            
                            System.out.print("Masukkan Harga (Rp): ");
                            double hargaBaru = scanner.nextDouble();
                            scanner.nextLine();
                            
                            if (jenis == 1) {
                                System.out.print("Masukkan Kapasitas Baterai (mAh): ");
                                int baterai = scanner.nextInt();
                                scanner.nextLine();
                                daftarKomputer[jumlahKomputer] = new Laptop(namaBaru, cpuBaru, gpuBaru, ramBaru, ssdBaru, hargaBaru, baterai);
                            } else if (jenis == 2) {
                                System.out.print("Masukkan Daya PSU (Watt): ");
                                int psu = scanner.nextInt();
                                scanner.nextLine();
                                daftarKomputer[jumlahKomputer] = new PCDesktop(namaBaru, cpuBaru, gpuBaru, ramBaru, ssdBaru, hargaBaru, psu);
                            } else if (jenis == 3) {
                                System.out.print("Masukkan Berat Casing (Kg): ");
                                double berat = scanner.nextDouble();
                                scanner.nextLine();
                                daftarKomputer[jumlahKomputer] = new MiniPC(namaBaru, cpuBaru, gpuBaru, ramBaru, ssdBaru, hargaBaru, berat);
                            }
                            
                            jumlahKomputer++;
                            System.out.println("Sukses! Spesifikasi komputer berhasil ditambahkan.");
                        } else {
                            System.out.println("Maaf, kapasitas inventaris penuh!");
                        }
                    }
                    case 2 -> {
                        System.out.println("\n--- Daftar Spesifikasi Komputer di Inventaris ---");
                        if (jumlahKomputer == 0) {
                            System.out.println("Belum ada komputer yang tersimpan.");
                        } else {
                            for (int i = 0; i < jumlahKomputer; i++) {
                                System.out.print((i + 1) + ". ");
                                daftarKomputer[i].tampilkanInfo();
                                simulasiUjiCoba(daftarKomputer[i]);
                                
                                daftarKomputer[i].hitungBiayaLayanan();
                                
                                if (daftarKomputer[i] instanceof DapatDiupgrade) {
                                    DapatDiupgrade itemUpgrade = (DapatDiupgrade) daftarKomputer[i];
                                    itemUpgrade.upgradeRAM(8);
                                }
                                
                                if (daftarKomputer[i] instanceof DapatGaransi) {
                                    DapatGaransi itemGaransi = (DapatGaransi) daftarKomputer[i];
                                    itemGaransi.klaimGaransi();
                                }
                                
                                System.out.println();
                            }
                            System.out.println("* Total Item Komputer: " + Komputer.totalKomputerBerhasilDibuat);
                        }
                        System.out.print("Tekan Enter untuk kembali");
                        scanner.nextLine();
                    }
                    case 3 -> {
                        System.out.println("\n--- Fitur Cari Komputer ---");
                        System.out.println("1. Cari berdasarkan Nama ");
                        System.out.println("2. Cari berdasarkan Batas Harga");
                        System.out.print("Pilih metode pencarian (1/2): ");
                        
                        int modeCari = scanner.nextInt();
                        scanner.nextLine();

                        if (modeCari == 1) {
                            System.out.print("Masukkan Nama/Merk: ");
                            String kataKunci = scanner.nextLine();
                            cariKomputer(kataKunci, daftarKomputer, jumlahKomputer);
                        } else if (modeCari == 2) {
                            System.out.print("Masukkan Maksimal Harga (Rp): ");
                            double angkaKunci = scanner.nextDouble();
                            scanner.nextLine();
                            cariKomputer(angkaKunci, daftarKomputer, jumlahKomputer);
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                        
                        System.out.print("\nTekan Enter untuk kembali");
                        scanner.nextLine();
                    }
                    case 4 -> {
                        System.out.println("Keluar dari sistem...");
                        isRunning = false;
                    }
                    default -> {
                        System.out.println("Pilihan tidak valid. Silakan masukkan angka 1-4.");
                    }
                }
            }
        }
    }
}
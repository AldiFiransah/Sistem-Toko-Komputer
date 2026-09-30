/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistem_toko_komputer;

import java.util.Scanner;

public class Sistem_Toko_Komputer {

    public static void cariKomputer(String nama, Komputer[] daftar, int jumlah) {
        System.out.println("\n=== Hasil Pencarian Nama/Sistem: " + nama + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < jumlah; i++) {
            if (daftar[i].getNamaPerangkat().toLowerCase().contains(nama.toLowerCase())) {
                daftar[i].tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Perangkat '" + nama + "' tidak ditemukan.");
    }

    public static void cariKomputer(double maxHarga, Komputer[] daftar, int jumlah) {
        System.out.println("\n=== Hasil Pencarian Harga <= Rp " + String.format("%,.0f", maxHarga) + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < jumlah; i++) {
            if (daftar[i].getHarga() <= maxHarga) {
                daftar[i].tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Tidak ada komputer di bawah harga tersebut.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Komputer[] daftarKomputer = new Komputer[10];
        int jumlahKomputer = 0;
        boolean isRunning = true;

        daftarKomputer[jumlahKomputer++] = new Laptop("Axioo Hype 5", "Intel Core i5", 8, 5500000, 14.0);
        daftarKomputer[jumlahKomputer++] = new Laptop("Lenovo ThinkPad", "AMD Ryzen 7", 16, 12000000, 15.6);
        daftarKomputer[jumlahKomputer++] = new PCDesktop("Build PC Budget", "Intel Core i3 12th", 16, 7500000, "GTX 1650", 500);
        daftarKomputer[jumlahKomputer++] = new PCDesktop("Build PC Gaming", "Intel Core i5 12th", 32, 14500000, "RTX 3060", 650);

        System.out.println("=================================================");
        System.out.println("  SELAMAT DATANG DI SISTEM INVENTARIS KOMPUTER   ");
        System.out.println("=================================================");

        while (isRunning) {
            System.out.println("\n--- MENU UTAMA ---");
            System.out.println("1. Tambah Stok Baru");
            System.out.println("2. Tampilkan Seluruh Stok");
            System.out.println("3. Cari Komputer (Overloading)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> {
                    if (jumlahKomputer < daftarKomputer.length) {
                        System.out.println("\n--- Pilih Jenis Perangkat ---");
                        System.out.println("1. Laptop");
                        System.out.println("2. PC Desktop Rakitan");
                        System.out.print("Pilihan (1/2): ");
                        int jenis = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Masukkan Nama Perangkat / Rakitan: ");
                        String namaBaru = scanner.nextLine();
                        System.out.print("Masukkan Processor (CPU): ");
                        String cpuBaru = scanner.nextLine();
                        System.out.print("Masukkan Ukuran RAM (GB): ");
                        int ramBaru = scanner.nextInt();
                        System.out.print("Masukkan Harga Total (Rp): ");
                        double hargaBaru = scanner.nextDouble();
                        scanner.nextLine();

                        if (jenis == 1) {
                            System.out.print("Masukkan Ukuran Layar (Inci): ");
                            double layar = scanner.nextDouble();
                            scanner.nextLine();
                            daftarKomputer[jumlahKomputer++] = new Laptop(namaBaru, cpuBaru, ramBaru, hargaBaru, layar);
                        } else if (jenis == 2) {
                            System.out.print("Masukkan Kartu Grafis (GPU): ");
                            String gpu = scanner.nextLine();
                            System.out.print("Masukkan Daya PSU (Watt): ");
                            int psu = scanner.nextInt();
                            scanner.nextLine();
                            daftarKomputer[jumlahKomputer++] = new PCDesktop(namaBaru, cpuBaru, ramBaru, hargaBaru, gpu, psu);
                        } else {
                            System.out.println("Pilihan jenis tidak valid.");
                            break;
                        }
                        System.out.println("[Sukses] Stok berhasil ditambahkan ke inventaris.");
                    } else {
                        System.out.println("[Gagal] Kapasitas inventaris penuh!");
                    }
                }
                case 2 -> {
                    System.out.println("\n==================================== DAFTAR STOK KOMPUTER ====================================");
                    if (jumlahKomputer == 0) {
                        System.out.println("Belum ada stok.");
                    } else {
                        for (int i = 0; i < jumlahKomputer; i++) {
                            System.out.print((i + 1) + ". ");
                            daftarKomputer[i].tampilkanInfo();
                            daftarKomputer[i].spesifikasiLayanan();
                            System.out.println("---------------------------------------------------------------------------------------------");
                        }
                        System.out.println("** Total Unit Terdaftar di Inventaris: " + Komputer.totalKomputer + " Unit **");
                    }
                    System.out.print("\nTekan Enter untuk melanjutkan...");
                    scanner.nextLine();
                }
                case 3 -> {
                    System.out.println("\n--- Cari Komputer ---");
                    System.out.println("1. Berdasarkan Nama Perangkat");
                    System.out.println("2. Berdasarkan Maksimal Harga");
                    System.out.print("Pilih metode (1/2): ");
                    int mode = scanner.nextInt();
                    scanner.nextLine();

                    if (mode == 1) {
                        System.out.print("Masukkan Kata Kunci Nama: ");
                        String kataKunci = scanner.nextLine();
                        cariKomputer(kataKunci, daftarKomputer, jumlahKomputer);
                    } else if (mode == 2) {
                        System.out.print("Masukkan Maksimal Harga: ");
                        double maxHarga = scanner.nextDouble();
                        scanner.nextLine();
                        cariKomputer(maxHarga, daftarKomputer, jumlahKomputer);
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    System.out.print("\nTekan Enter untuk melanjutkan...");
                    scanner.nextLine();
                }
                case 4 -> {
                    System.out.println("\nKeluar dari program. Terima kasih!");
                    isRunning = false;
                }
                default -> System.out.println("Menu tidak tersedia. Masukkan angka 1-4.");
            }
        }
        scanner.close();
    }
}
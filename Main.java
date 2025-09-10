/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Main {  
    static class PreOrder {
        String namaPemesan;
        String jenisKain;
        int jumlah;
        String tanggal;

        PreOrder(String namaPemesan, String jenisKain, int jumlah, String tanggal) {
            this.namaPemesan = namaPemesan;
            this.jenisKain = jenisKain;
            this.jumlah = jumlah;
            this.tanggal = tanggal;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<PreOrder> daftarPreOrder = new ArrayList<>();

        while (true) {
            System.out.println("\nSistem Manajemen Pre-Order Kain Songket");
            System.out.println("1. Tambah Pre-Order");
            System.out.println("2. Lihat Daftar Pre-Order");
            System.out.println("3. Ubah Data Pre-Order");
            System.out.println("4. Hapus Pre-Order");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                // Create
                System.out.print("Nama Pemesan: ");
                String nama = input.nextLine();
                System.out.print("Jenis Kain: ");
                String jenis = input.nextLine();
                System.out.print("Jumlah Pesanan: ");
                int jumlah = input.nextInt();
                input.nextLine();
                System.out.print("Tanggal Pre-Order (dd-mm-yyyy): ");
                String tanggal = input.nextLine();

                daftarPreOrder.add(new PreOrder(nama, jenis, jumlah, tanggal));
                System.out.println("Pre-order berhasil ditambahkan.");

            } else if (pilihan == 2) {
                // Read
                if (daftarPreOrder.isEmpty()) {
                    System.out.println("Belum ada data pre-order.");
                } else {
                    System.out.println("\nDaftar Pre-Order");
                    for (int i = 0; i < daftarPreOrder.size(); i++) {
                        PreOrder p = daftarPreOrder.get(i);
                        System.out.println((i + 1) + ". " + p.namaPemesan + " / " + p.jenisKain + 
                                           " / Jumlah: " + p.jumlah + " / Tanggal: " + p.tanggal);
                    }
                }

            } else if (pilihan == 3) {
                // Update
                if (daftarPreOrder.isEmpty()) {
                    System.out.println("Tidak ada data untuk diubah.");
                } else {
                    System.out.print("Masukkan nomor data yang ingin diubah: ");
                    int index = input.nextInt() - 1;
                    input.nextLine();
                    if (index >= 0 && index < daftarPreOrder.size()) {
                        PreOrder p = daftarPreOrder.get(index);
                        System.out.print("Nama Pemesan baru (" + p.namaPemesan + "): ");
                        p.namaPemesan = input.nextLine();
                        System.out.print("Jenis Kain baru (" + p.jenisKain + "): ");
                        p.jenisKain = input.nextLine();
                        System.out.print("Jumlah baru (" + p.jumlah + "): ");
                        p.jumlah = input.nextInt();
                        input.nextLine();
                        System.out.print("Tanggal baru (" + p.tanggal + "): ");
                        p.tanggal = input.nextLine();
                        System.out.println("Data berhasil diubah.");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                }

            } else if (pilihan == 4) {
                // Delete
                if (daftarPreOrder.isEmpty()) {
                    System.out.println("Tidak ada data untuk dihapus.");
                } else {
                    System.out.print("Masukkan nomor data yang ingin dihapus: ");
                    int index = input.nextInt() - 1;
                    input.nextLine();
                    if (index >= 0 && index < daftarPreOrder.size()) {
                        daftarPreOrder.remove(index);
                        System.out.println("Data berhasil dihapus.");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                }

            } else if (pilihan == 5) {
                // Exit
                System.out.println("Terima kasih telah menggunakan sistem ini.");
                break;

            } else {
                System.out.println("Pilihan tidak tersedia, coba lagi.");
            }
        }

        input.close();
    }
}

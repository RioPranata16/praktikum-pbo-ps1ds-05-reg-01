/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rio.projectmodul07.Unguided;


public class Main {
    public static void main(String[] args) {
        // 1. Uji Proteksi Abstraksi (Dijadikan komentar karena error jika di-instansiasi langsung)
        // TiketBioskop testAbstrak = new TiketBioskop("Test", 50000, 1);

        // 2. Buka Kasir menggunakan Static Method dari Interface
        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        // 3. Buat Objek Transaksi
        TiketReguler tiket1 = new TiketReguler("Interstellar", 40000, 2, 3);
        TiketVIP tiket2 = new TiketVIP("Dune: Part Two", 60000, 2, 25000);
        PaketSnack snack1 = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000);

        // 4. Array Polimorfik Heterogen
        ItemTransaksi[] daftarBelanja = { tiket1, tiket2, snack1 };

        // 5. Pemrosesan Dinamis (Loop)
        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");
        double grandTotal = 0.0;

        for (ItemTransaksi item : daftarBelanja) {
            item.cetakRincianItem(); // Memanggil default method dari interface
            grandTotal += item.getNominalBayar();
        }

        // 6. Tutup Kasir & Cetak Grand Total
        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + grandTotal);
        System.out.println("=============================================================");
        
        ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}
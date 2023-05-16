/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m.rezqy.noor.ridha_2110010554;

import Data.Karyawan;
import Data.Pelanggan;
import Data.Pemasok;
import Data.Produk;
import Data.Stok_Barang;
import Data.Transaksi;
import java.util.Date;

/**
 *
 * @author User
 */
public class MRezqyNoorRidha_2110010554 {

   
    public static void main(String[] args) {


        // Membuat objek dari class Produk
        Produk produk = new Produk(1, "Kopi", "Kopi Arabica", 15000, 50);

        // Membuat objek dari class Pelanggan
        Pelanggan pelanggan = new Pelanggan(1, "Samsul", "081234567890", "samsul@example.com");

        // Membuat objek dari class StokBarang
        Stok_Barang stokBarang = new Stok_Barang(1, 100, new Date(123, 10, 16));

        // Membuat objek dari class Transaksi
        Transaksi transaksi = new Transaksi(1, new Date(), 20000, "Cash");

        // Membuat objek dari class Karyawan
        Karyawan karyawan = new Karyawan(1, "Udin", "Kasir", 2000000);

        // Membuat objek dari class Pemasok
        Pemasok pemasok = new Pemasok(1, "Supplier ABC", "08123456789", "ABCindo@example.com");

        // Menampilkan informasi objek
        produk.tampilkanInfo();
        pelanggan.tampilkanInfo();
        stokBarang.tampilkanInfo();
        transaksi.tampilkanInfo();
        karyawan.tampilkanInfoKaryawan();
        pemasok.tampilkanInfo();
    }
}

    
    


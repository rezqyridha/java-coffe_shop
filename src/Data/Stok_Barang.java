/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author User
 */
import java.util.Date;

public class Stok_Barang {
    private int idBarang;
    private int jumlahStok;
    private Date tanggalKadaluarsa;

    // Constructor
    public Stok_Barang(int idBarang, int jumlahStok, Date tanggalKadaluarsa) {
        this.idBarang = idBarang;
        this.jumlahStok = jumlahStok;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    // Getter dan Setter
    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public Date getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    public void setTanggalKadaluarsa(Date tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("ID Barang: " + idBarang);
        System.out.println("Jumlah Stok: " + jumlahStok);
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
        System.out.println("Informasi Produk:");
    }
    
    public boolean isStokKadaluarsa() {
        Date tanggalSekarang = new Date();
        return tanggalKadaluarsa.before(tanggalSekarang);
    }
}

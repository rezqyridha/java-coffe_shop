/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author User
 */


public class StokBarang {
    private int idBarang;
    private int jumlahStok;
    private int tanggalKadaluarsa;

    // Constructor
    public StokBarang(int idBarang, int jumlahStok, int tanggalKadaluarsa) {
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

    public int getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    public void setTanggalKadaluarsa(int tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("ID Barang: " + idBarang);
        System.out.println("Jumlah Stok: " + jumlahStok);
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
    
}

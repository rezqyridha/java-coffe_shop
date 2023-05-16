/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

public class Produk {
    private int idProduk;
    private String namaProduk;
    private String deskripsiProduk;
    private double hargaProduk;
    private int stokProduk;

    // Constructor
    public Produk(int idProduk, String namaProduk, String deskripsiProduk, double hargaProduk, int stokProduk) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.deskripsiProduk = deskripsiProduk;
        this.hargaProduk = hargaProduk;
        this.stokProduk = stokProduk;
    }

    // Getter dan Setter
    public int getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(int idProduk) {
        this.idProduk = idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getDeskripsiProduk() {
        return deskripsiProduk;
    }

    public void setDeskripsiProduk(String deskripsiProduk) {
        this.deskripsiProduk = deskripsiProduk;
    }

    public double getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(double hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public int getStokProduk() {
        return stokProduk;
    }

    public void setStokProduk(int stokProduk) {
        this.stokProduk = stokProduk;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("ID Produk: " + idProduk);
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Deskripsi Produk: " + deskripsiProduk);
        System.out.println("Harga Produk: " + hargaProduk);
        System.out.println("Stok Produk: " + stokProduk);
    }
    
    public void tambahStok(int tambahan) {
        stokProduk += tambahan;
    }

    public void kurangiStok(int pengurangan) {
        stokProduk -= pengurangan;
    }
    
}


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

public class Transaksi {
    private int idTransaksi;
    private Date tanggalTransaksi;
    private double jumlahPembayaran;
    private String jenisPembayaran;

    // Constructor
    public Transaksi(int idTransaksi, Date tanggalTransaksi, double jumlahPembayaran, String jenisPembayaran) {
        this.idTransaksi = idTransaksi;
        this.tanggalTransaksi = tanggalTransaksi;
        this.jumlahPembayaran = jumlahPembayaran;
        this.jenisPembayaran = jenisPembayaran;
    }

    // Getter dan Setter
    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(Date tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public double getJumlahPembayaran() {
        return jumlahPembayaran;
    }

    public void setJumlahPembayaran(double jumlahPembayaran) {
        this.jumlahPembayaran = jumlahPembayaran;
    }

    public String getJenisPembayaran() {
        return jenisPembayaran;
    }

    public void setJenisPembayaran(String jenisPembayaran) {
        this.jenisPembayaran = jenisPembayaran;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Tanggal Transaksi: " + tanggalTransaksi);
        System.out.println("Jumlah Pembayaran: " + jumlahPembayaran);
        System.out.println("Jenis Pembayaran: " + jenisPembayaran);
    }
}


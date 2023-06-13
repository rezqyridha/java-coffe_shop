/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class dataSetTransaksi {
    private ArrayList<Integer> idTransaksi;
    private ArrayList<Integer> tanggalTransaksi;
    private ArrayList<String> jumlahPembayaran;
    private ArrayList<String> jenisPembayaran;
    
    public dataSetTransaksi(){
        idTransaksi= new ArrayList<Integer>();
        tanggalTransaksi= new ArrayList<Integer>();
        jumlahPembayaran= new ArrayList<String>();
        jenisPembayaran= new ArrayList<String>();
    }
    
     public void tambahIdTransaksi(int idtransaksi){
        idTransaksi.add(idtransaksi);
    }
     public ArrayList<Integer> getDatasetIdTransakis(){
        return this.idTransaksi;
    }
     
    public void tambahTanggalTransaksi(int tanggalTransaksi) {
        this.tanggalTransaksi.add(tanggalTransaksi);
    }

    public ArrayList<Integer> getDatasetTanggalTransaksi() {
        return this.tanggalTransaksi;
    }
    
    public void tambahJumlahPembayaran(String value) {
        this.jumlahPembayaran.add(value);
    }

    public ArrayList<String> getDatasetJumlahPembayaran() {
        return this.jumlahPembayaran;
    }
    
    public void tambahJenisPembayaran(String value) {
        this.jenisPembayaran.add(value);
    }

    public ArrayList<String> getDatasetJenisPembayaran() {
        return this.jenisPembayaran;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author User
 */
public class Karyawan {
    private int idKaryawan;
    private String namaKaryawan;
    private String posisi;
    private String gaji;

    // Constructor
    public Karyawan(int idKaryawan, String namaKaryawan, String posisi, String gaji) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.posisi = posisi;
        this.gaji = gaji;
    }

    // Getter dan Setter
    public int getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getGaji() {
        return gaji;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

    // Method
    public void tampilkanInfoKaryawan() {
        System.out.println("ID Karyawan : " + idKaryawan);
        System.out.println("Nama Karyawan : " + namaKaryawan);
        System.out.println("Posisi : " + posisi);
        System.out.println("Gaji : " + gaji);
    }
}



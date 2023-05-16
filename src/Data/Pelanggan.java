/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author User
 */
public class Pelanggan {
    private int idPelanggan;
    private String namaPelanggan;
    private String nomorTelepon;
    private String email;

    // Constructor
    public Pelanggan(int idPelanggan, String namaPelanggan, String nomorTelepon, String email) {
        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    // Getter dan Setter
    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("ID Pelanggan: " + idPelanggan);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Email: " + email);
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author User
 */
public class Pemasok {
    private int idPemasok;
    private String namaPemasok;
    private String nomorTelepon;
    private String email;

    // Constructor
    public Pemasok(int idPemasok, String namaPemasok, String nomorTelepon, String email) {
        this.idPemasok = idPemasok;
        this.namaPemasok = namaPemasok;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    // Getter dan Setter
    public int getIdPemasok() {
        return idPemasok;
    }

    public void setIdPemasok(int idPemasok) {
        this.idPemasok = idPemasok;
    }

    public String getNamaPemasok() {
        return namaPemasok;
    }

    public void setNamaPemasok(String namaPemasok) {
        this.namaPemasok = namaPemasok;
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
        System.out.println("ID Pemasok : " + idPemasok);
        System.out.println("Nama Pemasok : " + namaPemasok);
        System.out.println("Nomor Telepon : " + nomorTelepon);
        System.out.println("Email : " + email);
    }
}



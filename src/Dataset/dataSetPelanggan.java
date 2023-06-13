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
public class dataSetPelanggan {
    private ArrayList<Integer> idPelanggan;
    private ArrayList<String> namaPelanggan;
    private ArrayList<String> nomorTelepon;
    private ArrayList<String> email;
    
    //constructor
    public dataSetPelanggan(){
        idPelanggan= new ArrayList<Integer>();
        namaPelanggan= new ArrayList<String>();
        nomorTelepon= new ArrayList<String>();
        email= new ArrayList<String>();
    }
    
     public void tambahIdPelanggan(int value){
        idPelanggan.add(value);
    }
     public ArrayList<Integer> getDatasetIdPelanggan(){
        return this.idPelanggan;
    }
     
     public void tambahNamaPelanggan(String value){
        namaPelanggan.add(value);
    }
     public ArrayList<String> getDatasetNamaPelanggan(){
        return this.namaPelanggan;
    }
     
     public void tambahNomorTelepon(String value){
        nomorTelepon.add(value);
    }
     public ArrayList<String> getDatasetNomorTelepon(){
        return this.nomorTelepon;
    }
    
       public void tambahEmail(String value){
        email.add(value);
    }
     public ArrayList<String> getDatasetEmail(){
        return this.email;
    }
}

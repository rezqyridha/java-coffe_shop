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
public class dataSetStokBarang {
    private ArrayList<Integer> idBarang;
    private ArrayList<Integer> jumlahStok;
    private ArrayList<Integer> tanggalKadaluarsa;
    
     public dataSetStokBarang (){
        idBarang= new ArrayList<Integer>();
        jumlahStok= new ArrayList<Integer>();
        tanggalKadaluarsa= new ArrayList<Integer>();
    }
     
    public void tambahIdBarang(int value){
        idBarang.add(value);
    }
    public ArrayList<Integer> getDatasetIdBarang(){
        return this.idBarang;
    }
    
    public void tambahJumlahStok(int value){
        jumlahStok.add(value);
    }
    public ArrayList<Integer> getDatasetJumlahStok(){
        return this.jumlahStok;
    }
    
    public void tambahTanggalKadaluarsa(int value){
        tanggalKadaluarsa.add(value);
    }
    public ArrayList<Integer> getDatasetTanggalKadaluarsa(){
        return this.tanggalKadaluarsa;
    }
}

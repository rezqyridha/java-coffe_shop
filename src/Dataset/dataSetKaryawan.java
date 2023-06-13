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
public class dataSetKaryawan {
    private ArrayList<Integer> idKaryawan;
    private ArrayList<String> namaKaryawan;
    private ArrayList<String> posisi;
    private ArrayList<String> gaji;
    
    //constructor
    public dataSetKaryawan (){
        idKaryawan= new ArrayList<Integer>();
        namaKaryawan= new ArrayList<String>();
        posisi= new ArrayList<String>();
        gaji= new ArrayList<String>();
    }
    
     public void tambahIdKaryawan(int value){
        idKaryawan.add(value);
    }
     public ArrayList<Integer> getDatasetIdKaryawan(){
        return this.idKaryawan;
    }
     
     public void tambahNamaKaryawan(String value){
        namaKaryawan.add(value);
    }
     public ArrayList<String> getDatasetNamaKaryawan(){
        return this.namaKaryawan;
    }
     
     public void tambahPosisi(String value){
        posisi.add(value);
    }
     public ArrayList<String> getDatasetPosisi(){
        return this.posisi;
    }
     
     public void tambahGaji(String value){
        gaji.add(value);
    }
     public ArrayList<String> getDatasetGaji(){
        return this.gaji;
    }
     
}

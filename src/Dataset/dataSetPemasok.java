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
public class dataSetPemasok {
    private ArrayList<Integer> idPemasok;
    private ArrayList<String> namaPemasok;
    private ArrayList<String> nomorTelepon;
    private ArrayList<String> email;
    
    //constructor
    public dataSetPemasok (){
        idPemasok= new ArrayList<Integer>();
        namaPemasok= new ArrayList<String>();
        nomorTelepon= new ArrayList<String>();
        email= new ArrayList<String>();
    }
    
    public void tambahIdPemasok(int value){
        idPemasok.add(value);
    }
    public ArrayList<Integer> getDatasetIdPemasok(){
        return this.idPemasok;
    }
    
    public void tambahNamaPemasok(String value){
        namaPemasok.add(value);
    }
    public ArrayList<String> getDatasetNamaPemasok(){
        return this.namaPemasok;
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

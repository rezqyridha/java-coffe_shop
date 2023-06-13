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
public class dataSetProduk {
    private ArrayList<Integer> idProduk;
    private ArrayList<String> namaProduk;
    private ArrayList<String> deskripsiProduk;
    private ArrayList<String> hargaProduk;
    private ArrayList<Integer> stokProduk;
    
    public dataSetProduk(){
        idProduk= new ArrayList<Integer>();
        namaProduk= new ArrayList<String>();
        deskripsiProduk= new ArrayList<String>();
        hargaProduk= new ArrayList<String>();
        stokProduk= new ArrayList<Integer>();               
    }
    
    public void tambahIdProduk(int value){
        idProduk.add(value);
    }
    public ArrayList<Integer> getDatasetIdProduk(){
        return this.idProduk;
    }
    
    public void tambahNamaProduk(String value){
        namaProduk.add(value);
    }
    public ArrayList<String> getDatasetNamaProduk(){
        return this.namaProduk;
    }
    
    public void tambahDeskripsiProduk(String value){
        deskripsiProduk.add(value);
    }
    public ArrayList<String> getDatasetDeskripsiProduk(){
        return this.deskripsiProduk;
    }
    
    public void tambahHargaProduk(String value){
        hargaProduk.add(value);
    }
    public ArrayList<String> getDatasetHargaProduk(){
        return this.hargaProduk;
    }
    
    public void tambahStokProduk(int value){
        stokProduk.add(value);
    }
    public ArrayList<Integer> getDatasetStokProduk(){
        return this.stokProduk;
    }
    
}

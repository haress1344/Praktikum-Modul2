package Haris07168_Entity;

import java.util.Date;

public class Haris07168_Datakue {
    protected String Nama_Kue;
    protected float Harga_Kue;
    protected int Jumlah_Kue;
    static Date tglbeli = new Date();
    
    public Haris07168_Datakue(String Haris07168_namakue, float Haris07168_harga, int Haris07168_jum){
        this.Nama_Kue = Haris07168_namakue;
        this.Harga_Kue = Haris07168_harga;
        this.Jumlah_Kue = Haris07168_jum;
        
    }
    
    public String getNamakue(){
        return Nama_Kue;
    }
    public float getHargakue(){
        return Harga_Kue;
    }
    public int getJumkue(){
        return Jumlah_Kue;
    }
    public static Date getTgl(){
        return tglbeli;
    }
    
}

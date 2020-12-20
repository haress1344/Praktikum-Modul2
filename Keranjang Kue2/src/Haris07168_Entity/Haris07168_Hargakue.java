package Haris07168_Entity;

public class Haris07168_Hargakue extends Haris07168_Datakue {

    protected float Haris07168_Perhitungan;

    public Haris07168_Hargakue(String Haris07168_namakue, float Haris07168_harga, int Haris07168_jum) {
        super(Haris07168_namakue, Haris07168_harga, Haris07168_jum);
        this.Haris07168_Perhitungan = Haris07168_jum * Haris07168_harga;
    }

    public float getPerhitungan() {
        return Haris07168_Perhitungan;
    }

}

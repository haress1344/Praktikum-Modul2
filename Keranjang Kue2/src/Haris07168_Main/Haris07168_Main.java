package Haris07168_Main;

import java.util.Scanner;
import Haris07168_Entity.*;
import Haris07168_Model.*;
import java.text.SimpleDateFormat;

public class Haris07168_Main {

    static Scanner Haris07168_input = new Scanner(System.in);
    static Haris07168_PesananModel pesanan = new Haris07168_PesananModel();
    static SimpleDateFormat Haris07168_formattgl = new SimpleDateFormat("dd-MMM-yyyy ");

    public static void main(String[] args) {

        int Haris07168_pilih, Haris07168_jum, Haris07168_menu, batas = 0;
        String Haris07168_namakue;
        float Haris07168_harga;
        do {
            System.out.println("Cookie Store Here !!!");
            System.out.println();
            System.out.println("1. Masukkan Dalam Keranjang");
            System.out.println("2. Ganti Isi Keranjang");
            System.out.println("3. Hapus Isi Keranjang");
            System.out.println("4. Lihat Isi Keranjang");
            System.out.println("5. Exit");
            System.out.print("Pilihan = ");
            Haris07168_menu = Haris07168_input.nextInt();
            switch (Haris07168_menu) {
                case 1:
                    System.out.println("MENU");
                    System.out.println();
                    for (int i = 0; i < Haris07168_Kue.Haris07168_namakue.length; i++) {
                        System.out.println(i + 1 + ". " + Haris07168_Kue.Haris07168_namakue[i]);
                    }
                    System.out.println();
                    System.out.print("Pilih Kue =");
                    Haris07168_pilih = Haris07168_input.nextInt();
                    switch (Haris07168_pilih) {
                        case 1:
                            Haris07168_namakue = "Tahu Kornet";
                            Haris07168_harga = 2500;
                            System.out.print("Jumlah Tahu Kornet = ");
                            Haris07168_jum = Haris07168_input.nextInt();
                            pesanan.insert_data(new Haris07168_Datakue(Haris07168_namakue, Haris07168_harga, Haris07168_jum));
                            break;
                        case 2:
                            Haris07168_namakue = "Bitterbalen";
                            Haris07168_harga = 3000;
                            System.out.print("Jumlah Bitterbalen = ");
                            Haris07168_jum = Haris07168_input.nextInt();
                            pesanan.insert_data(new Haris07168_Datakue(Haris07168_namakue, Haris07168_harga, Haris07168_jum));
                            break;
                        case 3:
                            Haris07168_namakue = "Bolu";
                            Haris07168_harga = 2000;
                            System.out.print("Jumlah Bolu = ");
                            Haris07168_jum = Haris07168_input.nextInt();
                            pesanan.insert_data(new Haris07168_Datakue(Haris07168_namakue, Haris07168_harga, Haris07168_jum));
                            break;
                        case 4:
                            Haris07168_namakue = "Cookie";
                            Haris07168_harga = 4000;
                            System.out.print("Jumlah Cookie = ");
                            Haris07168_jum = Haris07168_input.nextInt();
                            pesanan.insert_data(new Haris07168_Datakue(Haris07168_namakue, Haris07168_harga, Haris07168_jum));
                            break;
                    }
                    break;
                case 2:
                    int Haris07168_indeks;
                    if (pesanan.getDatakue().isEmpty()) {
                        System.out.println("Tidak Ada Kue Dalam Keranjang");
                    } else {
                        System.out.print("Masukkan Urutan Kue = ");
                        Haris07168_indeks = Haris07168_input.nextInt();
                        Haris07168_indeks = Haris07168_indeks - 1;
                        if (Haris07168_indeks > pesanan.getDatakue().size() || Haris07168_indeks < 0) {
                            System.out.println("Urutan Kue Tidak Tersedia Di Keranjang");
                        } else {
                            for (int i = 0; i < Haris07168_Kue.Haris07168_namakue.length; i++) {
                                System.out.println(i + 1 + ". " + Haris07168_Kue.Haris07168_namakue[i]);
                            }
                            System.out.print("Pilih Kue = ");
                            Haris07168_pilih = Haris07168_input.nextInt();
                            switch (Haris07168_pilih) {
                                case 1:
                                    Haris07168_namakue = "Tahu Kornet";
                                    Haris07168_harga = 2500;
                                    System.out.print("Jumlah Tahu Kornet = ");
                                    Haris07168_jum = Haris07168_input.nextInt();
                                    pesanan.getDatakue().set(Haris07168_indeks, new Haris07168_Datakue(Haris07168_namakue, Haris07168_harga, Haris07168_jum));
                                    break;
                                case 2:
                                    Haris07168_namakue = "Bitterbalen";
                                    Haris07168_harga = 3000;
                                    System.out.print("Jumlah Bitterbalen = ");
                                    Haris07168_jum = Haris07168_input.nextInt();
                                    pesanan.getDatakue().set(Haris07168_indeks, new Haris07168_Datakue(Haris07168_namakue, Haris07168_harga, Haris07168_jum));
                                    break;
                                case 3:
                                    Haris07168_namakue = "Bolu";
                                    Haris07168_harga = 2000;
                                    System.out.print("Jumlah Bolu = ");
                                    Haris07168_jum = Haris07168_input.nextInt();
                                    pesanan.getDatakue().set(Haris07168_indeks, new Haris07168_Datakue(Haris07168_namakue, Haris07168_harga, Haris07168_jum));
                                    break;
                                case 4:
                                    Haris07168_namakue = "Cookie";
                                    Haris07168_harga = 4000;
                                    System.out.print("Jumlah Cookie = ");
                                    Haris07168_jum = Haris07168_input.nextInt();
                                    pesanan.getDatakue().set(Haris07168_indeks, new Haris07168_Datakue(Haris07168_namakue, Haris07168_harga, Haris07168_jum));
                                    break;
                            }
                        }
                    }
                    break;

                case 3:
                    if (pesanan.getDatakue().isEmpty()) {
                        System.out.println("Tidak Ada Kue Dalam Keranjang");
                    } else {
                        System.out.print("Masukkan Urutan Kue = ");
                        Haris07168_indeks = Haris07168_input.nextInt();
                        Haris07168_indeks = Haris07168_indeks - 1;
                        if (Haris07168_indeks > pesanan.getDatakue().size() || Haris07168_indeks < 0) {
                            System.out.println("Urutan Kue Tidak Tersedia Di Keranjang");
                        } else {
                            pesanan.getDatakue().remove(Haris07168_indeks);
                        }
                    }
                    break;
                case 4:
                    if (pesanan.getDatakue().isEmpty()) {
                        System.out.println("Tidak Ada Kue Dalam Keranjang");
                    } else {
                        Haris07168_isikeranjang();
                    }
                    break;

                case 5:
                    batas = 1;
                    break;

            }
        } while (batas == 0);

    }

    static void Haris07168_isikeranjang() {
        System.out.println("ISI DALAM KERANJANG");
        System.out.println("=======================");
        float total = 0;
        for (int i = 0; i < pesanan.getDatakue().size(); i++) {
            System.out.println("Nama Kue = " + pesanan.getDatakue().get(i).getNamakue());
            System.out.println("Harga Satuan = " + pesanan.getDatakue().get(i).getHargakue());
            System.out.println("Jumlah Kue = " + pesanan.getDatakue().get(i).getJumkue());
            System.out.println("Harga Kue = " + pesanan.getHargakue().get(i).getPerhitungan());
            total=total+pesanan.getHargakue().get(i).getPerhitungan();
            System.out.println("=======================");
        }
        System.out.println("Total Harga = " + total);
        System.out.println("Tanggal Pembelian = " + Haris07168_formattgl.format(Haris07168_Datakue.getTgl()));
    }
}

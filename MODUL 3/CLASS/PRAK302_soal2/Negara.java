package PRAK302_soal2;

import java.util.*;

public class Negara {
    private String nama, jenis, nama_p;
    private int tanggal, bulan, tahun;

    
    public Negara(String nama, String jenis, String nama_p, int tanggal, int bulan, int tahun){
        this.nama = nama;
        this.jenis = jenis;
        this.nama_p = nama_p;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }


    public int getBulan(){
        return bulan;
    }

    void getData(){
        Scanner scn = new Scanner(System.in);
        nama=scn.nextLine();
        jenis=scn.nextLine();
        nama_p=scn.nextLine();
        if (jenis.equalsIgnoreCase("presiden")||jenis.equalsIgnoreCase("perdana menteri")) {
            tanggal = scn.nextInt();
            bulan = scn.nextInt();
            tahun = scn.nextInt();
        }
    }

    void tampilkan(){
        HashMap<Integer, String> month = new HashMap<Integer,String>();
        month.put(1, "Januari");
        month.put(2, "Februari");
        month.put(3, "Maret");
        month.put(4, "April");
        month.put(5, "Mei");
        month.put(6, "Juni");
        month.put(7, "Juli");
        month.put(8, "Agustus");
        month.put(9, "September");
        month.put(10, "Oktober");
        month.put(11, "November");
        month.put(12, "Desember");
        if (jenis.equalsIgnoreCase("presiden")||jenis.equalsIgnoreCase("perdana menteri")) {
            System.out.println("Negara "+nama+" mempunyai "+jenis+" bernama "+nama_p);}
        else if (jenis.equalsIgnoreCase("monarki")){
            System.out.println("Negara "+nama+" mempunyai Raja"+" bernama "+nama_p+"\n");
        }
        if (jenis.equalsIgnoreCase("presiden")||jenis.equalsIgnoreCase("perdana menteri")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal "+tanggal+" "+month.get(getBulan())+" "+tahun+"\n");}
    }
}


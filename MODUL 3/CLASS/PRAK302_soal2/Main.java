package PRAK302_soal2;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama = "", jenis="", nama_p="";
        int tanggal=0, bulan=0, tahun=0;
        Scanner input = new Scanner(System.in);
        Negara negara = new Negara(nama, jenis, nama_p, tanggal, bulan, tahun);
        LinkedList<Negara> llNegara = new LinkedList<Negara>();

        int ulang;
        ulang = input.nextInt();

        for (int i=0; i<ulang; i++){
            Negara c = new Negara(nama, jenis, nama_p, tanggal, bulan, tahun);
            c.getData();
            llNegara.add(c);
        }

        for (int i = 0; i < llNegara.size(); i++){
            Negara nIndex = llNegara.get(i);
            nIndex.tampilkan();
        }
    }
}
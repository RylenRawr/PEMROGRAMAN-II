package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = masukan.nextInt();

        if (pilihan == 1) {
            masukan.nextLine();
            System.out.print("Nama hewan peliharaan: ");
            String namaKucing = masukan.nextLine();
            System.out.print("Ras: ");
            String rasKucing = masukan.nextLine();
            System.out.print("Warna Bulu: ");
            String warnaBuluKucing = masukan.nextLine();

            Kucing kucing = new Kucing(rasKucing, namaKucing, warnaBuluKucing);
            kucing.displayDetailKucing();
        } else if (pilihan == 2) {
            masukan.nextLine();
            System.out.print("Nama hewan peliharaan: ");
            String namaAnjing = masukan.nextLine();
            System.out.print("Ras: ");
            String rasAnjing = masukan.nextLine();
            System.out.print("Warna Bulu: ");
            String warnaBuluAnjig = masukan.nextLine();
            System.out.print("Kemampuan: ");
            String kemampuanStr = masukan.nextLine();
            String[] kemampuan = kemampuanStr.split(",");

            Anjing anjing = new Anjing(namaAnjing, rasAnjing, warnaBuluAnjig, kemampuan);
            anjing.displayDetailAnjing();
        } else {
            System.out.println("Pilihan tidak valid");
        }

        masukan.close();
    }
}
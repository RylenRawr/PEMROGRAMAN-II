package utspbo.soal10;
import java.util.Scanner;


public class utspbosoal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umurtahun, umurbulan;
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            String[] tanggalLahirStr = input.nextLine().split(" ");
            String bulanStr = tanggalLahirStr[0];
            int tahun = Integer.parseInt(tanggalLahirStr[1]);

            int bulan = 0;

            switch (bulanStr) {
                case "Januari"
                        -> bulan = 1;
                case "Februari"
                        -> bulan = 2;
                case "Maret"
                        -> bulan = 3;
                case "April"
                        -> bulan = 4;
                case "Mei"
                        -> bulan = 5;
                case "Juni"
                        -> bulan = 6;
                case "Juli"
                        -> bulan = 7;
                case "Agustus"
                        -> bulan = 8;
                case "September"
                        -> bulan = 9;
                case "Oktober"
                        -> bulan = 10;
                case "November"
                        -> bulan = 11;
                case "Desember"
                        -> bulan = 12;
            }
            int tahunSekarang = 2020;
            int bulanSekarang = 3;
            if (bulan > bulanSekarang || (bulan == bulanSekarang && tahun > tahunSekarang)) {
                umurtahun = tahunSekarang - tahun;
                umurbulan = bulan - bulanSekarang;
                if (umurbulan < 0) {
                    umurtahun--;
                    umurbulan += 12;
                }
            } else {
                umurtahun = tahunSekarang - tahun - 1;
                umurbulan = 12 - (bulanSekarang - bulan);
            }
            if (umurtahun == 0 && umurbulan == 0) {
                System.out.println("1 Tahun");
            } else if (umurbulan == 0) {
                System.out.println(umurtahun + " Tahun");
            } else {
                if (umurbulan == 12) {
                    umurbulan = 0;
                    umurtahun++;
                }
                if (umurtahun > 0) {
                    System.out.println(umurtahun + " Tahun" + (umurbulan > 0 ? " " + umurbulan + " Bulan" : ""));
                } else {
                    System.out.println(umurbulan + " Bulan");
                }
            }
        }
    }
}
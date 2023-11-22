package soal1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner isian = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String namaHewan = isian.nextLine();

        System.out.print("Ras: ");
        String rasHewan = isian.nextLine();

        peliharaan hewanPeliharaan = new peliharaan(rasHewan, namaHewan);
        isian.close();
        hewanPeliharaan.display();
    }
}

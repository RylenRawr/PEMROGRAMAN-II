package utspbo.soal2;
import java.util.Scanner;
public class utspbosoal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahorang = input.nextInt();
        int[] dadu = new int[jumlahorang];
        for (int i = 0; i < jumlahorang; i++) {
            dadu[i] = input.nextInt();
        }

        int winner = cariwinner(dadu);
        if (winner != -1) {
            System.out.println((winner + 1));
        } else {
            System.out.println("Tidak ada pemenang");
        }
    }
    public static int cariwinner(int[] dadu) {
        int pemenang = -1;
        int nilaiMaksimal = dadu[0];
        for (int i = 0; i < dadu.length; i++) {
            int angka = dadu[i];
            int frekuensi = 0;

            for (int j = 0; j < dadu.length; j++) {
                if (dadu[j] == angka) {
                    frekuensi++;
                }
            }
            if (frekuensi == 1 && angka > nilaiMaksimal) {
                nilaiMaksimal = angka;
                pemenang = i;
            }
        }
        return pemenang;
}
}
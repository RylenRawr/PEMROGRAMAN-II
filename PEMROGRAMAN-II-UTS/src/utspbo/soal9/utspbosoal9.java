package utspbo.soal9;

import java.util.Scanner;

public class utspbosoal9 {
    public static void main(String[] args) {
        int r,y,n;
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        y = input.nextInt();
        n = input.nextInt();
        System.out.println();
        int hargaAkhir = (int) (r * (100 - y) / 100.0 * (100 + n) / 100.0);
        System.out.println(hargaAkhir);
    }
}

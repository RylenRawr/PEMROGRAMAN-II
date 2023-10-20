package utspbo.soal5;

import java.util.Scanner;

public class utspbosoal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        int jumlahKasus = input.nextInt();

        for (int i = 0; i < jumlahKasus; i++) {
            System.out.print("");
            String kata1 = input.next();
            System.out.print("");
            String kata2 = input.next();

            int panjang = kata1.length();

            System.out.println(kata1);
            System.out.println(kata2);

            for (int j = 0; j < panjang; j++) {
                if (kata1.charAt(j) == kata2.charAt(j)) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println("\n");
        }
    }
}
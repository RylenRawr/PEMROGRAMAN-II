package utspbo.soal7;

import java.util.Scanner;

public class utspbosoal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        char y = input.next().charAt(0);
        int n = input.nextInt();
        System.out.println("");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (i == 1 || i == r || j == 1 || j == r) {
                    System.out.print(n);
                } else {
                    System.out.print(y);
                }
            }
            System.out.println();
        }
    }
}

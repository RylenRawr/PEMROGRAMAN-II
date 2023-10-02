import java.util.Scanner;

public class PRAK103_2210817310001_MUHAMMADRYANRIZKYRAHMADI {
    public static void main(String[] args) {
        Scanner namy = new Scanner(System.in);
        System.out.print(" ");
        int N = namy.nextInt();
        System.out.print(" ");
        int bilanganpertama = namy.nextInt();

        int baris = 1;
        int bilangan = bilanganpertama;
        do {
            if (bilangan % 2 != 0) {
                System.out.print(bilangan);
                if (baris % 5 != 0 && baris != N) {
                    System.out.print(", ");
                }
                bilangan += 2;
            }
            if (baris % 5 == 0) {
                System.out.println();
            }
            baris++;
        } while (baris <= N);
    }
}

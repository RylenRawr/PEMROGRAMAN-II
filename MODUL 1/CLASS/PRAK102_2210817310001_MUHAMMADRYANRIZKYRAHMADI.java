import java.util.Scanner;

public class PRAK102_2210817310001_MUHAMMADRYANRIZKYRAHMADI {
    public static void main(String[] args) {
        Scanner namy = new Scanner(System.in);
        System.out.print(" ");
        int angka = namy.nextInt();
        int derets = 1;

        while (derets <= 11) {
            int bilangan;
            if (angka % 5 == 0) {
                bilangan = (angka / 5) - 1;
            } else {
                bilangan = angka;
            }
            System.out.print(bilangan + ", ");
            if (derets % 5 == 0) {
                System.out.println(derets);
            }
            angka++;
            derets++;
        }
    }
}

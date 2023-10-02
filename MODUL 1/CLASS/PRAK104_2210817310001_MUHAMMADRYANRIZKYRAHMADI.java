import java.util.Scanner;

public class PRAK104_2210817310001_MUHAMMADRYANRIZKYRAHMADI {
    public static void main(String[] args) {
        Scanner namy = new Scanner(System.in);

        System.out.print(" Tangan Abu :  ");
        char abuRonde1 = namy.next().charAt(0);
        System.out.print(" ");
        char abuRonde2 = namy.next().charAt(0);
        System.out.print(" ");
        char abuRonde3 = namy.next().charAt(0);

        System.out.print(" Tangan Bagas : ");
        char bagasRonde1 = namy.next().charAt(0);
        System.out.print(" ");
        char bagasRonde2 = namy.next().charAt(0);
        System.out.print(" ");
        char bagasRonde3 = namy.next().charAt(0);

        int abuScore = 0;
        int bagasScore = 0;

        if ((abuRonde1 == 'B' && bagasRonde1 == 'G') ||
                (abuRonde1 == 'G' && bagasRonde1 == 'K') ||
                (abuRonde1 == 'K' && bagasRonde1 == 'B')) {
            abuScore++;
        } else if ((abuRonde1 == 'G' && bagasRonde1 == 'B') ||
                (abuRonde1 == 'K' && bagasRonde1 == 'G') ||
                (abuRonde1 == 'B' && bagasRonde1 == 'K')) {
            bagasScore++;
        }
        if ((abuRonde2 == 'B' && bagasRonde2 == 'G') ||
                (abuRonde2 == 'G' && bagasRonde2 == 'K') ||
                (abuRonde2 == 'K' && bagasRonde2 == 'B')) {
            abuScore++;
        } else if ((abuRonde2 == 'G' && bagasRonde2 == 'B') ||
                (abuRonde2 == 'K' && bagasRonde2 == 'G') ||
                (abuRonde2 == 'B' && bagasRonde2 == 'K')) {
            bagasScore++;
        }
        if ((abuRonde3 == 'B' && bagasRonde3 == 'G') ||
                (abuRonde3 == 'G' && bagasRonde3 == 'K') ||
                (abuRonde3 == 'K' && bagasRonde3 == 'B')) {
            abuScore++;
        } else if ((abuRonde3 == 'G' && bagasRonde3 == 'B') ||
                (abuRonde3 == 'K' && bagasRonde3 == 'G') ||
                (abuRonde3 == 'B' && bagasRonde3 == 'K')) {
            bagasScore++;
        }
        if (abuScore > bagasScore) {
            System.out.println("Abu");
        } else if (abuScore < bagasScore) {
            System.out.println("Bagas");
        } else {
            System.out.println("SERI");
        }
    }
}

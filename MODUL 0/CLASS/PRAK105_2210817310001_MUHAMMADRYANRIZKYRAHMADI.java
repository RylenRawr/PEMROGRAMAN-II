import java.util.Scanner;

public class PRAK105_2210817310001_MUHAMMADRYANRIZKYRAHMADI {
    public static void main(String[] args) {
        String makan;
        String hoby;
        Scanner namy = new Scanner(System.in);

        System.out.print("Masukan Makanan Favorite = ");
        makan = namy.next();

        System.out.print("Masukan Hobi = ");
        hoby = namy.next();

            System.out.print("Aku suka makan "+ (makan)+", dan Hobiku "+(hoby));
    }
}

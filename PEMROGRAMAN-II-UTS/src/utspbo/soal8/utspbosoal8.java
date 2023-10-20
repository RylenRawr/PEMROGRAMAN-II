package utspbo.soal8;
import java.util.Scanner;


public class utspbosoal8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int bilangan = input.nextInt();

        System.out.println();
        if(bilangan != 1){
            if(bilangan % 2 == 1){
                System.out.print("4");
                bilangan = bilangan -1;
            }
            bilangan = bilangan / 2;
            while(i<bilangan){
                System.out.print("8");
                i++;
            }
        } else {
            System.out.print("0");
        }
        System.out.println();
    }
}
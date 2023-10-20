package utspbo.soal4;
import java.util.Scanner;
public class utspbosoal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String singkatan = sc.nextLine();

        String[] kalimat = singkatan.split("[*-]");
        StringBuilder output = new StringBuilder();
        for (String kata : kalimat) {
            output.append(kata.charAt(0));
        }
        System.out.println(output.toString());
    }
}
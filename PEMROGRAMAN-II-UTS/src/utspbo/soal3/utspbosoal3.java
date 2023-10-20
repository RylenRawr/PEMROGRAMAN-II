package utspbo.soal3;

import java.util.Scanner;

public class utspbosoal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int arnoldScore = 0;
        int bellaScore = 0;
        for (int i = 0; i < input.length(); i += 2) {
            char player = input.charAt(i);
            int point = Character.getNumericValue(input.charAt(i + 1));
            if (player == 'A') {
                arnoldScore += point;
            } else if (player == 'B') {
                bellaScore += point;
            }
        }
        if (arnoldScore > bellaScore) {
            System.out.println("Arnold, Skor: " + arnoldScore);
        } else if (bellaScore > arnoldScore) {
            System.out.println("Bella, Skor: " + bellaScore);
        } else {
            System.out.println("Skor Seri: " + arnoldScore);
        }
    }
}



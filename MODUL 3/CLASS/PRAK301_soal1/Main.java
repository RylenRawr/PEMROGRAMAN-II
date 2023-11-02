package PRAK301_soal1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu dd = new Dadu();
        int masukkan = input.nextInt();

        dd.setInput(masukkan);
        dd.acakNilai();
    }
}

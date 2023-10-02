import java.util.Scanner;
public class PRAK105_2210817310001_MUHAMMADRYANRIZKYRAHMADI {
    public static void main(String [] args){
        float jarijari,tinggi,rumus;
        double pi = 3.14;
        Scanner namy =new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari : ");
        jarijari = namy.nextFloat();
        System.out.print("Masukkan Tinggi : ");
        tinggi = namy.nextFloat();
        rumus = (float) (pi * (jarijari *jarijari*tinggi));

        System.out.print("Volume tabung dengan jari-jari "+jarijari+" dan tinggi "+tinggi+" cm adalah "+rumus+" m3");

    }
}

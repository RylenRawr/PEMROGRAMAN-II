import java.util.Scanner;

public class PRAK101_2210817310001_MUHAMMADRYANRIZKYRAHMADI {
    public static void main(String[] args){
        String  namapanjang;
            String tempatlahir, namabulan = "";
                int tanggallahir,bulanlahir, tahunlahir, tinggibadan;
                float beratbadan;
                Scanner namy = new Scanner (System.in);
                System.out.print("Masukan Nama Lengkap : ");
                namapanjang = namy.nextLine();
                System.out.print("Masukan Tempat Lahir : ");
                tempatlahir = namy.next();
                System.out.print("Masukan Tanggal Lahir : ");
                tanggallahir = namy.nextInt();
                System.out.print("Masukan Bulan Lahir : ");
                bulanlahir = namy.nextInt();
                switch (bulanlahir){
                    case 1:
                        namabulan = "Januari";
                        break;
                    case 2:
                        namabulan = "Febuari";
                        break;
                    case 3:
                        namabulan = "Maret" ;
                        break;
                    case 4:
                        namabulan = "April";
                        break;
                    case 5:
                        namabulan = "Mei";
                        break;
                    case 6:
                        namabulan = "Juni";
                        break;
                    case 7:
                        namabulan = "Juli";
                        break;
                    case 8:
                        namabulan = "Agustus";
                        break;
                    case 9:
                        namabulan = "September";
                        break;
                    case 10:
                        namabulan = "Oktobor";
                        break;
                    case 11:
                        namabulan = "November";
                        break;
                    case 12:
                        namabulan = "Desember";
                        break;
                }
        System.out.print("Masukkan Tahun Lahir : ");
        tahunlahir = namy.nextInt();
        System.out.print("Masukkan Tinggi Badan : ");
        tinggibadan = namy.nextInt();
        System.out.print("Masukkan Berat Badan : ");
        beratbadan = namy.nextFloat();

        System.out.print("Nama Lengkap "+ (namapanjang)+", Lahir di "+ (tempatlahir)
                + " pada Tanggal "+ (tanggallahir)+" "+ (namabulan)+" "+(tahunlahir)+ " Tinggi Badan "+(tinggibadan)+" cm "+ " dan Berat Badan "+(beratbadan)+" kilogram");

    }

}

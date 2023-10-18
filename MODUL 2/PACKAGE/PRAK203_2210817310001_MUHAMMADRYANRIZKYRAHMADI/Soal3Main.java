package PRAK203_2210817310001_MUHAMMADRYANRIZKYRAHMADI;

public class Soal3Main {
    public static void main(String[] args){
        Pegawai p1 = new Pegawai();
        //p1.nama = "Roi" erornya karena tidak ada ;
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan ("Assasin");
        //p1.jabatan = "Assasin"; terjadi error karena deklarasi tidak sesuai dengan yang ada pada class Pegawai, jadi ditambahkan method setJabatan
        p1.umur = 17;      //Belum terdapat pendeklarasian pada property umur

        //Output yang diperlukan adalah "Nama: Roi", jadi kata Pegawai dihapus aja.
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Untuk mencetak kata tahun diakhir kalimat, jadi tambahkan (+ " tahun")
        System.out.println("Umur: " + p1.umur + " tahun");
    }

}
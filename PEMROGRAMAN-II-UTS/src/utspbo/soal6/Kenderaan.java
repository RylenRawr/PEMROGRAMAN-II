package utspbo.soal6;

public class Kenderaan {
    String jenisKendaraan;
    int dayaAngkutPenumpang;
    double dayaAngkutMuatan;
    private boolean mesinMenyala;

    public Kenderaan(String jenisKendaraan, int dayaAngkutPenumpang, double dayaAngkutMuatan) {
        this.jenisKendaraan = jenisKendaraan;
        this.dayaAngkutPenumpang = dayaAngkutPenumpang;
        this.dayaAngkutMuatan = dayaAngkutMuatan;
        this.mesinMenyala = false;
    }
    public void nyalakanmesin() {
        mesinMenyala = true;
        System.out.println("Mesin kendaraan dinyalakan.");
    }
    public void matikanmesin() {
        mesinMenyala = false;
        System.out.println("Mesin kendaraan dimatikan.");
    }
    public void melaju() {
        if (mesinMenyala) {
            System.out.println("Kendaraan melaju.");
        } else {
            System.out.println("Nyalakan mesin terlebih dahulu.");
        }
    }
    public void memperlambatlaju() {
        if (mesinMenyala) {
            System.out.println("Kendaraan memperlambat laju.");
        } else {
            System.out.println("Nyalakan mesin terlebih dahulu.");
        }
    }
}

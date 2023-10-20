package utspbo.soal6;

public class Mobil extends Kenderaan {
    private final String merekMobil;
    private final int tahunProduksi;

    public Mobil(String jenisKendaraan, int dayaAngkutPenumpang, double dayaAngkutMuatan, String merekMobil, int tahunProduksi) {
        super(jenisKendaraan, dayaAngkutPenumpang, dayaAngkutMuatan);
        this.merekMobil = merekMobil;
        this.tahunProduksi = tahunProduksi;
    }
    public void InfoMobil() {
        System.out.println("Jenis Kendaraan: " + super.jenisKendaraan);
        System.out.println("Daya Angkut Penumpang: " + super.dayaAngkutPenumpang + " orang");
        System.out.println("Daya Angkut Muatan: " + super.dayaAngkutMuatan + " kg");
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Merek Mobil: " + merekMobil);

    }
    public void FiturTambahan() {
        System.out.println("Pajero siap di jalankan");
    }
}

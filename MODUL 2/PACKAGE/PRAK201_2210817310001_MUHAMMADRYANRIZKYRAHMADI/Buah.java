package PRAK201_2210817310001_MUHAMMADRYANRIZKYRAHMADI;

public class Buah {
    String nama;
    double berat,harga, jumlahBeli,hargaSebelumDiskon,hargaSesudahDiskon,totalDiskon ;


    public Buah(String namaBuah, double beratBuah, int hargaBuah, double jumlahBeli){
        this.nama = namaBuah;
        this.berat = beratBuah;
        this.harga = hargaBuah;
        this.jumlahBeli = jumlahBeli;
        this.hargaSebelumDiskon = harga*(jumlahBeli/beratBuah);
        this.totalDiskon = (int)(jumlahBeli/4)*(4*harga)*0.02;
        this.hargaSesudahDiskon = hargaSebelumDiskon-totalDiskon;
    }

    public void display(){
        System.out.println("Nama Buah: "+nama);
        System.out.println("Berat: "+berat+" kg");
        System.out.println("Harga: Rp"+harga);
        System.out.println("Harga Sebelum Diskon: Rp"+ String.format ("%.2f",hargaSebelumDiskon));
        System.out.println("Total Diskon: Rp"+totalDiskon);
        System.out.println("Harga Setelah Diskon: Rp"+String.format("%.2f",hargaSesudahDiskon)+"\n");
    }
}



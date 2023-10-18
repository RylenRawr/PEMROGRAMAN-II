package PRAK202_2210817310001_MUHAMMADRYANRIZKYRAHMADI;

public class Kopi {
    String namaKopi,ukuran,namaPembeli;
    int harga;
    double pajak;
    public void info(){
        System.out.println("Nama Kopi: "+namaKopi);
        System.out.println("Ukuran: "+ukuran);
        System.out.println("Harga: Rp"+harga);
    }
    public void setPembeli(String namaPembeli){
        this.namaPembeli=namaPembeli;
    }
    public String getPembeli(){
        return namaPembeli;
    }
    public double pajak(){
        pajak=harga*0.11;
        return pajak;
    }

}


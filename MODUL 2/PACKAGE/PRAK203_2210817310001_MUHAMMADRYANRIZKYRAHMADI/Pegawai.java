package PRAK203_2210817310001_MUHAMMADRYANRIZKYRAHMADI;
public class Pegawai {
    public String nama;
    public String asal;//tipe data berbeda yang harusnya string tetapi char.
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    //tipe data yang harusnya string tetapi char.
    public String getAsal() {
        return asal;
    }
    public void setJabatan(String j) {
        this.jabatan = j;
    }

}

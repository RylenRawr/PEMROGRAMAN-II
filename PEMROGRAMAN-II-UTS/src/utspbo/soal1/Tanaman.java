package utspbo.soal1;
public class Tanaman {
    String namabunga, warnabunga, musim;
    int dayatahanbunga;

    public Tanaman(String namabunga, String warnabunga, String musim, int dayatahanbunga){
        this.namabunga = namabunga;
        this.warnabunga = warnabunga;
        this.musim = musim;
        this.dayatahanbunga = dayatahanbunga;
    }
    public void isibunga(){
        System.out.println("Mawar merupakan tanaman bunga hias berupa herba dengan batang berduri.\n ");
    }
    public void deskripsi(){
        System.out.println("Nama bunga= "+ namabunga);
        System.out.println("Warna bunga= "+ warnabunga);
        System.out.println("Hadir pada Musim= "+ musim);
        System.out.println("Bunga "+ namabunga +"hanya bertahan "+dayatahanbunga+" Tahun\n");
    }
}


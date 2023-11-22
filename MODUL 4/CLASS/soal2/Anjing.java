package soal2;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(r, n);
        warnaBulu = w;
        kemampuan = k;
    }

    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.print("Kemampuan : ");
        for (String k : kemampuan) {
            System.out.print(" "+k);
        }
    }
}
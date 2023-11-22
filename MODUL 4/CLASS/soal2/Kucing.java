package soal2;

public class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    public Kucing(String r, String n, String w) {
        super(r, n);
        warnaBulu = w;
    }

    public void displayDetailKucing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}
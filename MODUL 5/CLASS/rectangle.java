package soal1;

public class rectangle extends shape{
    private Double length, width;

    public rectangle(Double l,Double w){
        super("Rectangle");
        length = l;
        width = w;
    }

    public Double area(){return length*width;}

    public String toString(){return super.toString() + " of length " + length + " and width "+width;}
}
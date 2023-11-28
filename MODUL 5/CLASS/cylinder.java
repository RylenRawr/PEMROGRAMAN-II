package soal1;

public class cylinder extends shape{
    private Double radius, height;

    public cylinder(Double r, Double h){
        super("Cylinder");
        radius = r;
        height = h;
    }

    public Double area(){return Math.PI*(radius*radius)*height;}

    public String toString(){return super.toString() + " of radius " + radius + " and height "+height;}
}
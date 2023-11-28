package soal1;

import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        paint paint = new paint(COVERAGE);
        rectangle deck;
        sphere bigBall;
        cylinder tank;
        double deckAmt, ballAmt, tankAmt;

        deck = new rectangle(20.0,30.0);
        bigBall = new sphere(15.0);
        tank = new cylinder(10.0,30.0);

        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
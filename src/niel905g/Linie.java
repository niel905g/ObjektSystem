package niel905g;

/**
 * @author Niels on 25-09-2018.
 */
public class Linie {

    // Declare 2 variable points
    private Punkt start, slut;

    // Declare a constructor to set the two points
    public Linie( Punkt start, Punkt slut ) {
        this.start = start;
        this.slut = slut;
    }
    // Create a method to calculate the length of the line
    public double length() {
        double deltaX = start.getX() - slut.getX();
        double deltaY = start.getY() - slut.getY();

        return Math.sqrt( deltaX * deltaX + deltaY * deltaY );
    }
}
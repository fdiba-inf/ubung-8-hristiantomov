package exercise8;

import java.util.Scanner;

public class Point {
    double x;
    double y;

    public Point() {
      x = 0;
      y = 0;
    }

    public Point(double x, double y) {
       this.x = x;
       this.y = y;
    }

    public Point(Point otherPoint) {
        this.x = otherPoint.x;
        this.y = otherPoint.y;
    }

    public void initialize() {
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        y = input.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        this.x = x + xDelta;
        this.y = y + yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        Point np = new Point();
        np.x = x + xDelta;
        np.y = y + yDelta;
        return np;
    }

    public boolean equals(Point otherPoint) {
        if(this.x == otherPoint.x && this.y == otherPoint.y)
        return true;
      else 
        return false;
    }

    public String toString() {
        // Represent attributes as string
        return "(" + x + ", " + y + ")";
    }
}

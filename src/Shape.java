import java.awt.Point;

public class Shape {
    private Point[] points;
    private int size = 10;
    private int counter = 0;
    public int perimeter = 0;

    public Shape() {
        points = new Point[size];
    }

    private void increaseSize() {
        size *= 2;

        Point[] newPoints = new Point[size];

        for (int i = 0; i < points.length; i++) {
            newPoints[i] = points[i];
        }

        points = newPoints;
    }

    public void add(Point point) {
        if (counter == size) {
           increaseSize();
        }
        points[counter++] = point;
    }

    public void print() {
        for(int i = 0; i < counter; i++) {
            System.out.println(points[i]);
        }
    }

    private void calculatePerimeter() {
        for (int i = 0; i < size - 1; i++) {
//            perimeter += points[0].getDistance();
        }
    }
//    private int getLongestSide() {
//        return longestSide;
//    }
//    private int getAverageSide() {
//        return averageSide;
//    }
}

public class Shape {
    private Point[] points;
    private int size = 10;
    private int counter = 0;
    private int perimeter = 0;
    private int longestSide;
    private int averageSide;

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

    public void printCharacteristics() {
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Average side: " + getAverageSide());
        System.out.println("Longest side: " + getLongestSide());
    }

    private void calculatePerimeter() {
        if (perimeter == 0) {
            for (int i = 0; i < counter - 1; i++) {
                perimeter += points[i].getDistance(points[i], points[i + 1]);
            }

            perimeter += points[counter - 1].getDistance(points[counter - 1], points[0]);
        }
    }

    private void calculateLongestSide() {
        if (this.longestSide == 0) {
            int longestSide = points[0].distance;

            for (int i = 1; i < 10; i++) {
                if (longestSide < points[i].distance) {
                    longestSide = points[i].distance;
                }
            }

            this.longestSide = longestSide;
        }
    }

    public int getPerimeter() {
        calculatePerimeter();
        return perimeter;
    }

    public int getLongestSide() {
        calculateLongestSide();
        return longestSide;
    }
    public int getAverageSide() {
        calculatePerimeter();
        return perimeter / counter;
    }
}

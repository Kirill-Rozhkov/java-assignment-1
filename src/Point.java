public class Point {
    int x;
    int y;
    int distance;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distanceTo(int firstPoint, int secondPoint) {
        return distance;
    }
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}

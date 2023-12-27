public class Point {
    public int x;
    public int y;
    public int distance = 0;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void findDistance(Point firstPoint, Point secondPoint) {
        int deltaX = secondPoint.x - firstPoint.x;
        int deltaY = secondPoint.y - firstPoint.y;

        distance = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public int getDistance(Point firstPoint, Point secondPoint) {
        findDistance(firstPoint, secondPoint);
        return distance;
    }
}

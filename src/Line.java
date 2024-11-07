import java.util.List;
import java.util.ArrayList;
class Line {
    private final List<Point> points;

    public Line() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculateLength() {
        double length = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += distance(points.get(i), points.get(i + 1));
        }
        return length;
    }

    protected double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    public List<Point> getPoints() {
        return points;
    }
}

public class PointClient {
    public static void main(String[] args) {

        Point p1 = new Point(3, 5);
        System.out.println("Point p1: " + p1);

        Point p2 = new Point(12, 4);
        System.out.println("Point p2: " + p2);

       Point p = p1.translate(2, -3);
        System.out.println("After translating p1 by (2, -3): " + p);
    }
}



public class Line2{

    // ATTRIBUTES
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private static int count = 0;


    // DEFAULT CONSTRUCTOR
    public Line2() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
        count++;
    }


    // PARAMETERIZED CONSTRUCTOR
    public Line2(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        count++;
    }


    // COPY CONSTRUCTOR
    public Line2(Line2 L) {
        this.x1 = L.x1;
        this.y1 = L.y1;
        this.x2 = L.x2;
        this.y2 = L.y2;
        count++;
    }


    // SETTER
    public void setValues(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    // GETTERS
    public int getX1() {
        return this.x1;
    }

    public int getY1() {
        return this.y1;
    }

    public int getX2() {
        return this.x2;
    }

    public int getY2() {
        return this.y2;
    }


    // CALCULATE LENGTH
    public double length() {

        double dx = x2 - x1;
        double dy = y2 - y1;

        return Math.sqrt(dx * dx + dy * dy);
    }


    // CALCULATE SLOPE
    public double slope() {

        if (x2 == x1) {
            return Double.POSITIVE_INFINITY;
        }

        return (double)(y2 - y1) / (x2 - x1);
    }


    // FIND INTERSECTION
    public Point intersection(Line2 L) {

        double denominator =
                (double)(x1 - x2) * (L.y1 - L.y2)
                - (double)(y1 - y2) * (L.x1 - L.x2);

        // Lines are parallel
        if (denominator == 0) {
            return null;
        }

        double determinant1 =
                (double)x1 * y2 - (double)y1 * x2;

        double determinant2 =
                (double)L.x1 * L.y2 - (double)L.y1 * L.x2;

        double intersectionX =
                (determinant1 * (L.x1 - L.x2)
                - (x1 - x2) * determinant2)
                / denominator;

        double intersectionY =
                (determinant1 * (L.y1 - L.y2)
                - (y1 - y2) * determinant2)
                / denominator;

        return new Point(intersectionX, intersectionY);
    }


    // OBJECT COUNT
    public static int objectCount() {
        return count;
    }


    // TO STRING
    public String toString() {

        return "Point 1 : (" + x1 + ", " + y1 + ")" +
               "\nPoint 2 : (" + x2 + ", " + y2 + ")";
    }
}
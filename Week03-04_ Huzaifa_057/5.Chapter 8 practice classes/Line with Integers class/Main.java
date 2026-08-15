public class Main {

    public static void main(String[] args) {

        // CREATE TWO LINES
        Line2 L1 = new Line2(1, 1, 5, 5);
        Line2 L2 = new Line2(1, 5, 5, 1);


        // DISPLAY L1
        System.out.println("LINE 1");
        System.out.println(L1);


        System.out.println("------------------------");


        // DISPLAY L2
        System.out.println("LINE 2");
        System.out.println(L2);


        System.out.println("------------------------");


        // LENGTH
        System.out.println("Length of Line 1: " + L1.length());
        System.out.println("Length of Line 2: " + L2.length());


        System.out.println("------------------------");


        // SLOPE
        System.out.println("Slope of Line 1: " + L1.slope());
        System.out.println("Slope of Line 2: " + L2.slope());


        System.out.println("------------------------");


        // INTERSECTION
        Point P = L1.intersection(L2);

        if (P != null) {
            System.out.println("Intersection Point:");
            System.out.println(P);
        }
        else {
            System.out.println("The lines do not intersect.");
        }


        System.out.println("------------------------");

        
        // OBJECT COUNT
        System.out.println("Total Line objects: " + Line2.objectCount());
    }
}
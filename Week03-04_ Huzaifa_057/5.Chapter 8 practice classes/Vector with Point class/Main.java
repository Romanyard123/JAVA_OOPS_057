public class Main{
    public static void main(String[] args) {

        // CREATE POINTS
        Point A = new Point(1, 2);
        Point B = new Point(5, 6);

        Point C = new Point(2, 1);
        Point D = new Point(5, 5);


        // CREATE TWO VECTORS
        Vector V1 = new Vector(A, B);
        Vector V2 = new Vector(C, D);

    
        // DISPLAY VECTORS
        System.out.println("========== VECTOR 1 ==========");
        System.out.println(V1);
        System.out.println("========== VECTOR 2 ==========");
        System.out.println(V2);


        // VECTOR ADDITION
        Vector V3 = V1.addVector(V2);
        System.out.println("========== ADDITION ==========");
        System.out.println(" V1 + V2:");
        System.out.println(V3);


        // VECTOR SUBTRACTION
        Vector V4 = V1.subVector(V2);
        System.out.println("========== SUBTRACTION ==========");
        System.out.println(" V1 - V2: ");
        System.out.println(V4);

  
        // DOT PRODUCT
        double dot = V1.dotProduct(V2);
        System.out.println("========== DOT PRODUCT ==========");
        System.out.println(" V1 . V2 = " + dot);


        // CROSS PRODUCT
        double cross = V1.crossProduct(V2);
        System.out.println("========== CROSS PRODUCT ==========");
        System.out.println(" V1 x V2 = " + cross);

  
        // MAGNITUDE
        double magnitude1 = V1.magnitude();
        double magnitude2 = V2.magnitude();
        System.out.println("========== MAGNITUDE ==========");
        System.out.println(" Magnitude of V1 = " + magnitude1);
        System.out.println(" Magnitude of V2 = " + magnitude2);



        System.out.println("\n========== OBJECT COUNT ==========");
        System.out.println("Total Vector objects: " + Vector.objectCount());
        System.out.println("Total Point objects: " + Point.pObjectCount());
    }
}
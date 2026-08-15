public class Main{
    public static void main(String[] args){

        // create 3 points
        Point A = new Point(0.0,0.0);
        Point B = new Point(4.0,0.0);
        Point C = new Point(0.0,3.0);

        // Creating trinagle objects
        Triangle2 tri  = new Triangle2();
        Triangle2 tri2 = new Triangle2(A,B,C);
        Triangle2 tri3 = new Triangle2(tri2);

        System.out.println(" Triangle 1 has these Points");
        System.out.println(tri);
        System.out.println("=============================");
        System.out.println(" Triangle 2 has these Points");
        System.out.println(tri2);
        System.out.println("=============================");
        System.out.println(" Triangle 3 has these Points");
        System.out.println(tri3);
        System.out.println();
        System.out.println("The Perimeter of the Triangle 1 is : "+tri.perimeter());
        System.out.println("The Perimeter of the Triangle 2 is : "+tri2.perimeter());
        System.out.println("The Perimeter of the Triangle 3 is : "+tri3.perimeter());
        System.out.println();
        System.out.println("The Area of the Triangle 1 is : "+ tri.area());
        System.out.println("The Area of the Triangle 2 is : "+ tri2.area());
        System.out.println("The Area of the Triangle 3 is : "+ tri3.area());
        System.out.println();
        System.out.println("the total objects created are : "+ Triangle2.objectCount());

    }
}
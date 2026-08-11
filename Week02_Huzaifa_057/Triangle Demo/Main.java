public class Main{
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(12.0);
        Triangle t3 = new Triangle(7.0,12.0);
        Triangle t4 = new Triangle(3.0,5.0,4.0);
        Triangle t5 = new Triangle(t2);

        System.out.println(t1.toString());
        System.out.println("The Perimeter of t1 is: "+ t1.perimeter());
        System.out.println("----------------------------------------");
        System.out.println(t2.toString());
        System.out.println("The Perimeter of t2 is: "+ t2.perimeter());
        System.out.println("----------------------------------------");
        System.out.println(t3.toString());
        System.out.println("The Perimeter of t3 is: "+ t3.perimeter());
        System.out.println("----------------------------------------");
        System.out.println(t4.toString());
        System.out.println("The Perimeter of t4 is: "+ t4.perimeter());
        System.out.println("----------------------------------------");
        System.out.println(t5.toString());
        System.out.println("The Perimeter of t5 is: "+ t5.perimeter());
        
        System.out.println("Is t4 triangle a right angled ? "+ t4.isRightAngled());
        System.out.println("The total object Count is: "+ Triangle.objectCount());
    }
}
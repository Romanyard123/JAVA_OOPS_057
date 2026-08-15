import java.util.*;
public class Main{
    public static void main(String[] args){
        Point A = new Point(0,0);
        Point B = new Point(4,4);

        Point C = new Point(0,4);
        Point D = new Point(4,0);

        Line L1 = new Line(A,B);
        Line L2 = new Line(C,D);

        Point result = L1.intersection(L2);

        System.out.println("Intersection Point:");
        System.out.println(result);

        System.out.println("The length of the line is : " +L1.length());
        System.out.println("The slope of L1 is : " +L1.slope()) ;
        System.out.println("The slope of L2 is : " +L2.slope()) ;
        System.out.println("is the line vertical ? "+ L1.isVertical());
        System.out.println("Is the line horizontal ? "+ L2.isHorizontal());
        
    }  
}
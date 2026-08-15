import java.util.*;
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        //CREATING OBJECTS
        Rational r1 = new Rational();
        Rational r2 = new Rational(12,36);
        Rational r3 = new Rational(15,24);
        Rational r4 = new Rational(20,80);
        Rational r5 = new Rational(r2) ;

        //Adding 
        System.out.println("Addition of r2 and r3");
        Rational r6 = r2.addRational(r3);
        System.out.println(r6);

        //SUBTRACTING
        System.out.println("Subtraction of r3 and r4");
        Rational r7 = r3.subRational(r4);
        System.out.println(r7);

        //Multiplying
        System.out.println("Multiplication of r2 and r4");
        Rational r8 = r2.multiplyRational(r4);
        r8.displayDecimal(3);

        //Dividing
        System.out.println("Multiplication of r5 and r4");
        Rational r9 = r4.divRational(r5);
        r9.displayFloat();

        //how many objects ?

        System.out.println("Total objects created : "+ Rational.objectCount());
    }  
}
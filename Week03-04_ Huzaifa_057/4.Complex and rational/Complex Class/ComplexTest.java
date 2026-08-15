import java.util.*;
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int myReal = sc.nextInt();
        int myImaginary = sc.nextInt();

        // CREATING OBJECTS OF TYPE COMPLEX
        Complex c1= new Complex(myReal,myImaginary);
        Complex c2= new Complex(2,7);
        Complex c3= new Complex(4,9);
        Complex c4= new Complex(c2);  
        
        // adding complex numbers 
        Complex c5 = c2.addComplex(c4);
        Complex c6 = c3.addComplex(c2);

        // Subtracting complex numbers 
        Complex c7 = c3.subtractComplex(c2);
        Complex c8 = c1.subtractComplex(c4);

        // multiply complex numbers 
        Complex c9 = c2.multiplyComplex(c3);

        //conjugate of complex
        Complex c10 = c1.conj();

        // displaying all complex numbers after calculations 
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
        System.out.println(c10);

        //how many objects ?
        System.out.println(Complex.objectCount());
    }  
}
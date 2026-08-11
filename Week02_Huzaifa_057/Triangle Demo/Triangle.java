public class Triangle{
    private double sideA;
    private double sideB;
    private double sideC;
    private static int count;

    // CONSTRUCTOR
    public Triangle(){
        this.sideA= 1.0;
        this.sideB= 1.0;
        this.sideC= 1.0;
        count++;
    }

    // ONE PARAMETER CONSTRUCTOR
    public Triangle(double side){
        this.sideA= side;
        this.sideB= side;
        this.sideC= side;
        count++;
    }

    // RWO PARAMETER CONSTRUCTOR 
    public Triangle(double x , double y){
        this.sideA= x;
        this.sideB= x;
        this.sideC= y;
        count++;
    }

    // THREE PARAMETER CONSTRUCTOR 
    public Triangle(double x, double y , double z){
        this.sideA= x;
        this.sideB= y;
        this.sideC= z;
        count++;
    }

    // COPY CONSTRUCTOR
    public Triangle(Triangle other){
        this.sideA= other.sideA;
        this.sideB= other.sideB;
        this.sideC= other.sideC;
        count++;
    }

    // COUNTS OBJECT CREATED 
    public static int objectCount(){
        return count;
    }

    // CALCULATES PARAEMTERS
    public double perimeter(){
        return (this.sideA + this.sideB + this.sideC);
    }

    // CHECKS IF A TRINAGLE IS RIGHT ANGLED
    public boolean isRightAngled(){
        if ((Math.pow(sideA,2) == Math.pow(sideB,2)+ Math.pow(sideC,2))||
           (Math.pow(sideB,2) == Math.pow(sideA,2) + Math.pow(sideC,2)) ||
           (Math.pow(sideC,2) == Math.pow(sideA,2) + Math.pow(sideB,2))){
            return true;
        }
        return false;
    }

    // DISPLAY 
    public String toString(){
        return "Side A : "+ sideA+
               "\n Side B :"+ sideB+
               "\n Side C :"+ sideC;     
    }
}
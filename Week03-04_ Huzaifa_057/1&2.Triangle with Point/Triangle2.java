public class Triangle2{
    private Point A;
    private Point B;
    private Point C;
    private static int count = 0;

    // NULL CONSTRUCTOR
    public Triangle2(){
        this.A = new Point();
        this.B = new Point();
        this.C = new Point();
        count++             ;
    }
    // PARAMETERISED CONSTRUCTOR
    public Triangle2(Point A , Point B , Point C ){
        this.A= A;
        this.B= B;
        this.C= C;
        count++  ;
    }
    //COPY CONSTRUCTOR
    public Triangle2(Triangle2 t){
        this.A= new Point(t.A);
        this.B= new Point(t.B);
        this.C= new Point(t.C);
        count++               ;
    }
    // Setter
    public void setTriangle2(Point A, Point B, Point C){
        this.A= A;
        this.B= B;
        this.C= C;
    }
    // Getter //
    public Point getPoint1(){
        return this.A;
    }
    public Point getPoint2(){
        return this.B;
    }
    public Point getPoint3(){
        return this.C;
    }
    //Calculating Total Objects//
    public static int objectCount(){
        return count ;
    }
    // calculating Distance
    public double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) +
                         Math.pow(p1.getY()-p2.getY(), 2)) ;
    }
    // Calculating parameter //
    public double perimeter(){
        double AB= distance(A,B);
        double AC= distance(A,C);
        double BC= distance(B,C);

        return AB + AC + BC ;
    }
    // Calculating Area
    public double area(){
        double AB = distance(A,B);
        double AC = distance(A,C);
        double BC = distance(B,C);

        double s = perimeter()/2 ;

        // Heron's formula for calculating area
        return Math.sqrt(s*(s-AB)*(s-AC)*(s-BC));
    }
    // OUTPUT //
    public String toString() {
    return "Point A: " 
            +   A +
           "\nPoint B: "
            + B +
           "\nPoint C: "
             + C ;
    }

}
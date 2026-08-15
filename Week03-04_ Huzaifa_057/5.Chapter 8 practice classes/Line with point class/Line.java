public class Line{

    // ATTRIBUTES
    private Point p1 ;
    private Point p2 ;
    private static int count ;

    // DEFAULT CONSTRUCTOR 
    public Line(){
        this.p1 = new Point();
        this.p2 = new Point();
        count++ ;
    }

    // PARAMETERIZED CONSTRUCTOR
    public Line(Point p1, Point p2){
        this.p1 = p1 ;
        this.p2 = p2 ;
        count++ ;
    }

    // COPY CONSTRUCTOR
    public Line(Line L){
        this.p1 = L.p1 ;
        this.p2 = L.p2 ;
        count++ ;
    }

    // SETTER
    public void setVal(Point p1 ,Point p2 ){
        this.p1 = p1 ;
        this.p2 = p2 ;
    }

    // GETTER
    public Point getP1(){
        return this.p1 ;
    }
    public Point getP2(){
        return this.p2 ;
    }

    //FINDING LENGTH
    public double length(){
        double X = p2.getX() - p1.getX();
        double Y = p2.getY() - p1.getY();
        return Math.sqrt( X*X + Y*Y );
    }

    //CHECKING GEOMETRY OF LINE
    public boolean isHorizontal(){
        if (p1.getY() == p2.getY()){
            return true ;
        }
        return false ;
    }
    public boolean isVertical(){
        if (p1.getX() == p2.getX()){
            return true ;
        }
        return false ;
    }

    public double slope(){
        if (p1.getX() != p2.getX()){
            return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX()) ;
        }
        return 0.00 ; 
    }

    //CHECKING THE INTERSECTION OF LINES
    public Point intersection(Line L){

        double x1 = this.p1.getX();
        double y1 = this.p1.getY();

        double x2 = this.p2.getX();
        double y2 = this.p2.getY();

        double x3 = L.p1.getX();
        double y3 = L.p1.getY();

        double x4 = L.p2.getX();
        double y4 = L.p2.getY();

        double denominator =
            (x1 - x2) * (y3 - y4)
            - (y1 - y2) * (x3 - x4);

        // Lines are parallel or identical
        if(denominator == 0){
            return null;
        }

        double numeratorX =
            (x1 * y2 - y1 * x2) * (x3 - x4)
            - (x1 - x2) * (x3 * y4 - y3 * x4);

        double numeratorY =
            (x1 * y2 - y1 * x2) * (y3 - y4)
            - (y1 - y2) * (x3 * y4 - y3 * x4);

        double x = numeratorX / denominator;
        double y = numeratorY / denominator;

        return new Point(x, y);
    }
    // COUNTING OBJECTS
    public static int objectCount(){
        return count ;
    }

    // DISPLAYING THE LINE
    public String toString(){
        return "Point 1 : "+p1+
                "\n Point 2 : "+p2;
    }

}
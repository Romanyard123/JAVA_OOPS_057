public class Vector{

    //ATTRIBUTES
    private Point start ;
    private Point end   ;
    private static int count ;

    // DEFAULT CONSTRUCTOR
    public Vector(){
        this.start = new Point();
        this.end   = new Point();
        count++ ;
    }

    // PARAMETERIZED CONSTRUCTOR
    public Vector(Point start, Point end){
        this.start = start ;
        this.end   = end   ;
        count++ ;
    }

    // COPY CONSTRUCTOR
    public Vector(Vector V){
        this.start  = V.start ;
        this.end    = V.end   ;
        count++ ;
    }

    // SETTERS
    public void setVal(Point newStart, Point newEnd){
        this.start = newStart ;
        this.end   = newEnd   ;
    }

    // GETTERS
    public Point getStart(){
        return this.start;
    }
    public Point getEnd(){
        return this.end ;
    }

    // MAGNITUDE OF VECTOR
    public double magnitude(){

    double dx = this.end.getX() - this.start.getX();
    double dy = this.end.getY() - this.start.getY();

    return Math.sqrt(dx * dx + dy * dy);
    }

    //ADDING VECTORS
    public Vector addVector(Vector V){

        double dx1 = this.end.getX() - this.start.getX();
        double dy1 = this.end.getY() - this.start.getY();

        double dx2 = V.end.getX() - V.start.getX();
        double dy2 = V.end.getY() - V.start.getY();

        double newDX = dx1 + dx2;
        double newDY = dy1 + dy2;

        Point newStart = new Point(0, 0);
        Point newEnd = new Point(newDX, newDY);

        return new Vector(newStart, newEnd);
    }

    //SUBTRACTING VECTOR
    public Vector subVector(Vector V){

        double dX = (this.end.getX() - this.start.getX()) - (V.end.getX() - V.start.getX());
        double dY = (this.end.getY() - this.start.getY()) - (V.end.getY() - V.start.getY());

        Point newStart = new Point(0.0,0.0);
        Point newEnd   = new Point(dX, dY) ;

        return new Vector(newStart,newEnd);
    }

    //DOT PRODUCT
    public double dotProduct(Vector V){

        double dX1 = this.end.getX() - this.start.getX() ;
        double dY1 = this.end.getY() - this.start.getY() ;

        double dX2 = V.end.getX() - V.start.getX() ;
        double dY2 = V.end.getY() - V.start.getY() ;

        return (dX1*dX2) + (dY1*dY2) ;
    } 

    //CROSS PRODUCT 
    public double crossProduct(Vector V){
        double dX1 = this.end.getX() - this.start.getX() ;
        double dY1 = this.end.getY() - this.end.getY() ;

        double dX2 = V.end.getX() - V.start.getX() ;
        double dY2 = V.end.getY() - V.start.getY() ;

        return (dX1*dY2) - (dY1*dX2) ;
    } 

    //OBJECT COUNT
    public static int objectCount() {
        return count;
    }

    // TO STRING
    public String toString() {

        return "Point 1 : (" + this.start.getX() + ", " + this.start.getY() + ")" +
               "\nPoint 2 : (" + this.end.getX() + ", " + this.end.getY() + ")" ;
    }

}
public class Point{
    //ATTRIBUTES
    private double x ;
    private double y ;
    private static int count = 0 ;

    public Point(){
        this.x = 0.0 ; 
        this.y = 0.0 ; 
        count++      ; 
    }
    public Point(double x , double y){
        this.x = x ;
        this.y = y ;
        count++    ; 
    }
    public Point(Point P){
        this.x = P.x ;
        this.y = P.y ;
        count++      ; 
    }
    // Setter
    public void setValues(double x , double y){
        this.x = x ;
        this.y = y ;
    }
    //Getters
    public double getX(){
        return this.x ;
    }
    public double getY(){
        return this.y ; 
    }
    //Object count
    public static int pObjectCount(){
        return count ;
    }
    // Addition of points 
    public Point addPoint(Point P){
        return new Point(this.x+P.x , this.y+P.y);
    }
    // Subtraction of points
    public Point subtractPoint(Point P){
        return new Point(this.x - P.x , this.y - P.y);
    }
    // outputing Attributes
    public String toString(){
        return "  X-Coordinate :"+this.x+
               "\nY-Coordinate :"+this.y;
               
    }
    
}
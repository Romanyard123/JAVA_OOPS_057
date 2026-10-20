public class Car implements Cloneable{
    private String model ;
    private Driver driver ;
    private int[] speedHistory ;
    private int speed ;

    public Car(String model , String driverName, int driverId){
        this.model = model ;
        driver = new Driver(driverName , driverId);
        this.speedHistory = new int[2] ;
    }

    public void drive(){
        this.speed = 0 ;
    }

    public void drive(int speed){
        this.speed = speed ;
    }

    public void setSpeed(int index , int speed){
        this.speedHistory[index] = speed ; 
    }

    public int getSpeed(int index){
        return this.speedHistory[index];
    }

    public Car clone() throws CloneNotSupportedException{
        return (Car) super.clone();
    }

    public Car deepCopy() throws CloneNotSupportedException{
        Car copy = (Car) super.clone();
        copy.driver = new Driver(this.driver);
        copy.speedHistory = this.speedHistory.clone();
        return copy ;
    }

    public String toString(){
        return " The model od car is " + this.model +
               " The driver of car is " + this.driver+
               "The speed history of the car is " + speedHistory[0]+ ","+ speedHistory[1];
    }




}
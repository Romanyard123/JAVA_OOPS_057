public class Car{
    // Instance variables (attributes) of the Car object
    private int Speed;
    private double Average;
    private double Angle;
    private boolean engineOn;
    private int fuelLevel;

    // Constructor to initialize a Car object
    public Car(int Speed, double Average, double Angle,boolean engineOn,int fuelLevel){
        this.Speed= Speed ;
        this.Average= Average;
        this.Angle= Angle;
        this.engineOn= engineOn;
        this.fuelLevel= fuelLevel;
    }
    // Setter - Updates multiple properties of the car at once
    public void setSpeednAngle(int NewSpeed,double NewAngle,int NewfuelLevel){
        this.Speed= NewSpeed;
        this.Angle= NewAngle;
        this.fuelLevel=NewfuelLevel;
    }
    // Getter methods
    public int getSpeed(){
        return Speed;
    }
    public double getAngle(){
        return Angle;
    }
    public int getFuelLevel(){
        return fuelLevel;
    }
    // Changes the current speed of the car
    public void changeSpeed(int newSpeed){
        this.Speed= newSpeed;
    }
    // parking by setting speed and steering angle
    public void parking(double newAngle){
        this.Speed= 0;
        this.Angle= newAngle;
    }
    // Changes the direction of the car while moving forward
    public void moveForward(double newAngle){
        this.Angle= newAngle;
    }
    // Turns the car towards the right
    public void moveRight(double newAngle){
        this.Angle= newAngle;
    }
    // Turns the engine ON
    public void startEngine(){
        this.engineOn= true;
        System.out.println("Engine started");
    }
    // Stops the engine and resets movement
    public void stopEngine(){
        this.engineOn=false;
        this.Speed=0;
        this.Angle=0.0;
    }

    public void moveFast(int incSpeed){
        // Car can only accelerate when the engine is running
        if (this.engineOn==true){
            this.Speed=this.Speed+incSpeed; // Increase speed instead of replacing it
            this.fuelLevel--; // Every acceleration consumes one unit of fuel
            System.out.println(" Car is moving fast");
        } else {
            System.out.println(" start the engine first");
        }     
    }
    public void moveSlow(int decSpeed){
        this.Speed=this.Speed-decSpeed; // Reduce the current speed
        if (this.Speed<0){   // Prevent speed from becoming negative
            this.Speed=0;
        }
        System.out.println(" Car is moving slow");
    }
    public void turboMode(){
        if(engineOn==true){
            Speed += 40; // Turbo mode provides a large speed boost
            fuelLevel -= 2; // but consumes extra fuel.
            System.out.println("Turbo Mode Activated");
        }
        else{
            System.out.println("Start engine first");
        }
    }
    // Displays the current state of the car object
    public void display(){
        System.out.println("The speed of the car is : "+ this.Speed);
        System.out.println("The Average of the car is : "+ this.Average);
        System.out.println("The angle of the car is : "+ this.Angle);
        System.out.println("The fuel level of the car is : "+ this.fuelLevel);
        System.out.println("Engine on : "+ this.engineOn);
    }
}
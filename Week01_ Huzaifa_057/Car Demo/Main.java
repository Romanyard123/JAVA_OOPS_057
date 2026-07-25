public class Main{
    public static void main(String[] args){
        System.out.println("    ------Car Class------");
        System.out.println("    BMW ");
        Car BMW= new Car(20,18.0,180.0,true,7);
        BMW.display();
        BMW.changeSpeed(16);
        System.out.println("new speed is : "+BMW.getSpeed());
        BMW.parking(8,75.2);
        System.out.println("new speed is : "+BMW.getSpeed());
        System.out.println("new Angle is : "+BMW.getAngle());
        BMW.moveSlow(40);
        System.out.println("new speed is : "+BMW.getSpeed());
        System.out.println(" new fuel level is : "+ BMW.getFuelLevel());
        BMW.stopEngine();
        System.out.println("new speed is : "+BMW.getSpeed());
        System.out.println("new Angle is : "+BMW.getAngle());
        System.out.println();
        System.out.println("   JETOUR");
        Car Jetour = new Car(80,12,20.0, true,18);
        Jetour.display();
        Jetour.turboMode();
        System.out.println("new speed is : "+Jetour.getSpeed());
        System.out.println("new fuel level  is : "+Jetour.getFuelLevel());
        Jetour.moveFast(10);
        System.out.println("new speed is : "+Jetour.getSpeed());
        System.out.println("new fuel level  is : "+Jetour.getFuelLevel());
    }
}
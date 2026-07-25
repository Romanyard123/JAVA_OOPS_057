public class OOPsFile{
    public static void main(String[] args){

        Calculator Casio = new Calculator(21,3);
        System.out.println("   ------Calculator Class------");
        System.out.println("  OBJECT CASIO  ");
        Casio.display();
        System.out.println("Num1 + Num2 = "+ Casio.addition());
        System.out.println("Num1 - Num2 = "+ Casio.subtraction());
        System.out.println("Num1 * Num2 = "+ Casio.multiplication());
        System.out.println("Num1 / Num2 = "+ Casio.division());
        Casio.setNum1(30);
        System.out.println("Num1 / Num2 = "+ Casio.division());

        Calculator Citizen = new Calculator(25,5);
        System.out.println("  OBJECT CITIZEN  ");
        Citizen.display();
        System.out.println("The modulus of Citizen is: "+ Citizen.modulus());
        System.out.println("The maximum of Citizen is: "+ Citizen.maximum());
        Calculator Classic = new Calculator(10, 10);
        System.out.println("  OBJECT CLASSIC  ");
        Classic.display();
        System.out.println("The maximum of Citizen is: "+ Classic.maximum());
        
        System.out.println("  OBJECT CLASSIC 2 ");
        Calculator Classic2 = new Calculator(20,0);
        System.out.println(Classic2.modulus());
        System.out.println(" Num1 / Num2 = "+ Classic2.division());
    }
}
public class Calculator{
    // Instance variables to store the two numbers
    private int num1;
    private int num2;
    
    // Constructor to initialize the Calculator object
    public  Calculator(int Num1,int Num2){
        this.num1= Num1 ;
        this.num2= Num2 ;
    }
     // Setter methods allow updating individual numbers
    public  void setNum1(int NewNum1){
        this.num1= NewNum1;
    }
    public  void setNum2(int NewNum2){
        this.num2= NewNum2;
    }
    // Getter methods return the current values
    public  int getNum1(){
        return num1;
    }
    public  int getNum2(){
        return num2; 
    }
    // Returns the sum of the two numbers
    public  int addition(){
        return (num1+num2);
    }
    // Returns the difference of the two numbers
    public  int subtraction(){
        return (num1-num2);
    }
    // Returns the Product of the two numbers
    public int multiplication(){
        return (num1*num2) ;
    }

    public int division(){
        // Prevent division by zero to avoid a runtime exception
        if (num2==0){
            System.out.println("Error: Cannot divide by zero.");
        return 0;
    }
    return (num1/num2);
    }

    public int modulus(){
        // Modulus by zero is undefined
        if (num2==0){
            System.out.println("Error : Cannot apply modulus on zero");
            return 0;
        }
        return (num1 % num2);
    }
    // Finds and returns the larger of the two numbers
    public int maximum(){
        int max;
        if (num1>num2){
            max = num1;}
        else{ 
            max = num2;
        }
        return max ;
    }
    // Displays the current values stored in the Calculator object
    public void display(){
        System.out.println("The First number is : "+ this.num1);
        System.out.println("The Second number is : "+ this.num2);
    }
}
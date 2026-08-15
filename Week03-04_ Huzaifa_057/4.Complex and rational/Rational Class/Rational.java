public class Rational{
    private int numerator ;
    private int denomenator ;
    private static int count ;

    // DEFAULT CONSTRUCTOR
    public Rational(){
        this.numerator = 1 ;
        this.denomenator = 1 ;
        count++ ;
    }

    // PARAMETERIZED CONSTRUCTOR
    public Rational(int numerator,int denomenator){
        if (denomenator == 0 ){
           this.numerator = 0;
            this.denomenator = 1 ; 
        } 
        else {
            this.numerator = numerator ;
            this.denomenator = denomenator ;
            count++ ;
        }
    }

    // COPY CONSTRUCTOR 
    public Rational(Rational R){
        this.numerator = R.numerator ;
        this.denomenator = R.denomenator ;
        count++ ;
    }
    
    // SETTER 
    public void setValues(int newNum ,int  newDenom){
        if (newDenom == 0 ){
           this.numerator = 0;
            this.denomenator = 1 ; 
        }
        else {
        this.numerator = newNum ;
        this.denomenator = newDenom ;
        }
    }

    // GETTER 
    public int getNumerator(){
        return this.numerator ;
    }
    public int getDenomenator(){
        return this.denomenator ;
    }

    // REDUCE FOR SIMPLIFYING THE VALUES 
    private void reduce(){
        int gcd = 1;

        for(int i = 1; i <= Math.abs(this.numerator) && i <= Math.abs(this.denomenator); i++){
            if(this.numerator % i == 0 && this.denomenator % i == 0){
                gcd = i;
            }
        }
        this.numerator = this.numerator / gcd;
        this.denomenator = this.denomenator / gcd;
    }

    // ADD RATIONAL
    public Rational addRational(Rational R){
        int newNum = this.numerator * R.denomenator + this.denomenator * R.numerator ;
        int newDenom = this.denomenator * R.denomenator ;
        Rational result =  new Rational (newNum, newDenom);
        result.reduce();
        return result ;
    }

    // SUBTRACT RATIONAL 
    public Rational subRational(Rational R){
        int newNum = this.numerator * R.denomenator - this.denomenator * R.numerator ;
        int newDenom = this.denomenator * R.denomenator ;
        Rational result =  new Rational (newNum, newDenom);
        result.reduce();
        return result ;
    }

    //MULTIPLY RATIONAL 
    public Rational multiplyRational(Rational R){
        int newNum = this.numerator * R.numerator ;
        int newDenom = this.denomenator * R.denomenator ;
        Rational result =  new Rational (newNum, newDenom);
        result.reduce();
        return result ;
    }

    //DIVIDE RATIONAL
    public Rational divRational( Rational R ){
        int newNum = this.numerator * R.denomenator ;
        int newDenom = this.denomenator * R.numerator ;
        Rational result =  new Rational (newNum, newDenom);
        result.reduce();
        return result ;
    }

    // DISPLAY THE FLOAT
    public void displayFloat(){
        double result = (double) numerator / denomenator;
        System.out.println(result);
    }

    // display the decimal of the result 
    public void displayDecimal(int places){
        double result = (double) numerator / denomenator;
        System.out.printf("%." + places + "f%n", result);
    }

    //OBJECT COUNTING 
    public static int objectCount(){
        return count ;
    }

    // TO_STRING TO DISPLAY
    public String toString(){
        return this.numerator+"/"+this.denomenator ;
    }

    //display 
    public void display(){
        System.out.println("The Numerator is : "+ this.numerator);
        System.out.println("The Denominator is : "+ this.denomenator);
    }
}
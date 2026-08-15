public class Complex{
    private int real ; 
    private int imaginary ;
    private static int count ;

    // DEFAULT CONSTRUCTOR
    public Complex(){
        this.real = 0;
        this.imaginary = 0;
        count++;
    }

    // PARAMETERIZED CONSTRUCTOR
    public Complex(int real, int imaginary){
        this.real= real ;
        this.imaginary= imaginary ;
        count++ ;
    }

    // COPY CONSTRUCTOR 
    public Complex(Complex C){
        this.real= C.real ;
        this.imaginary= C.imaginary ;
        count++ ;
    }

    // SETTERS 
    public void setValues(int newReal, int newImaginary){
        this.real = newReal;
        this.imaginary = newImaginary ;
    }

    //GETTERS
    public int getReal(){
        return this.real ;
    }
    public int getImaginary(){
        return this.imaginary ; 
    }

    // ADD COMPLEX NUMBERS
    public Complex addComplex(Complex C){
        return new Complex(this.real+C.real,this.imaginary+C.imaginary ) ;
    }

    // SUBTRACT COMPLEX NUMBERS 
    public Complex subtractComplex( Complex C ){
        return new Complex(this.real-C.real ,this.imaginary-C.imaginary );
    }

    //  MULTIPLICATION OF COMPLEX NUMBERS 
    public Complex multiplyComplex(Complex C){
        int newReal = (this.real * C.real)+(- (this.imaginary * C.imaginary)); // i*i= -1 -> becomes real
        int newImaginary = (this.imaginary * C.real) + (this.real * C.imaginary) ; // i*r= _i -> imaginary
        return new Complex(newReal ,newImaginary);
    }
    // CONJUCATE OF COMPLEX NUMBERS
    public Complex conj(){
        return new Complex(this.real, - this.imaginary);
    }

    // OBJECT COUNT 
    public static int objectCount(){
        return count ;
    }

    // TO STRING 
    public String toString(){
        return  this.real+ " + " +this.imaginary+"i" ;
    }

    // SHOW 
    public void display(){
        System.out.println(" The real part is : "+ this.real);
        System.out.println(" The imaginary part is : "+ this.imaginary);
    }
}
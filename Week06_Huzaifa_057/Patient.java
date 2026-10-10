import java.util.HashSet ; import java.util.Set ; import java.util.Objects ;

public class Patient {
    private String Firstname ;
    private String Lastname;
    private int healthCardNumber ;

    public Patient(){
        this.Firstname = "unknown";
        this.Lastname =  "unknown";
        this.healthCardNumber = 0 ;
    }

    public Patient(String Firstname , String Lastname , int healthCardNumber){
        this.Firstname = Firstname ;
        this.Lastname= Lastname ; 
        this.healthCardNumber= healthCardNumber ;
    }

    public Patient (Patient P){
        this.Firstname= P.Firstname ;
        this.Lastname = P.Lastname ;
        this.healthCardNumber = P.healthCardNumber ;
    }

    @Override
    public String toString(){
        return "The Patient's Firstname is " + this.Firstname + 
               " The  Patient's LastName is "+ this.Lastname + 
               " The Patient's health Card Number is " + this.healthCardNumber ;
    }

    @Override 
    public int hashCode(){
        return Objects.hash(this.Firstname,this.Lastname, this.healthCardNumber);
    }

    @Override
    public boolean equals(Object other){
        if (this == other ){
            return true ;
        }
        if (other == null){
            return false ;
        }
        if (!(other instanceof Patient)){
            return false ;
        }

        Patient that = (Patient) other ;

        return this.Firstname==that.Firstname && this.Lastname == that.Lastname && this.healthCardNumber == that.healthCardNumber ;
    }

}

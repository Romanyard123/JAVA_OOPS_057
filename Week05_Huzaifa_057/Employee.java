public class Employee {
    private String name ;
    private int id ;
    private Date joiningDate;
    private double salary;

    public Employee(){
        this.name = "Unknown";
        this.id = 0 ;
        this.salary=0.0 ;
        this.joiningDate= new Date();
    }

    public Employee(String Name, int id , double Salary , Date joiningDate){
        this.name = Name ;
        this.id = id ;
        this.salary = Salary ; 
        this.joiningDate = new Date(joiningDate);
    }

    public Employee(Employee E ){
        this.name= E.name;
        this.id = E.id ; 
        this.salary= E.salary ;
        this.joiningDate = E.joiningDate ;
    }

    public void setEmployee(String name, int id , double  Salary , Date joiningDate){
        this.name = name ;
        this.id = id ;
        this.salary = Salary ; 
        this.joiningDate = new Date (joiningDate);
    }

    public String getName(){
        return this.name ;
    }
    public int getId(){
        return this.id;
    }
    public double getSalary(){
        return this.salary ; 
    }
    public Date getJoiningDate(){
        return this.joiningDate;
    }

    public void increseSalary(double percentage){
        this.salary  = this.salary + this.salary*percentage/100 ; 
    }

    public boolean isSalaryAbove(double amt){
        if (this.salary > amt){
            return true ;
        }
        return false ;
    }

    public int yearsOfService(Date today){
        int years = today.getYear()  - this.joiningDate.getYear();
        return years ;
    }

    public String toString(){
        return "The Employee "+ this.name+
               " has ID : " + this.id +
               " and has salary "+ this.salary +
               " joined On "+ this.joiningDate;
    }

}
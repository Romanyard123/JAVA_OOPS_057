import java.util.*;
public class Student{
    // STUDENT ATTRIBUTES
    private String stdName;
    private int score1;
    private int score2;

    // CONSTRUCTOR WITH ONE PARAMETER
    public Student(String stdName){
        this.stdName=stdName;
    }
    // SETTER 
    public void setValues(String stdName, int score1 , int score2){
        this.stdName=stdName;
        this.score1= score1 ;
        this.score2= score2 ;
    }
    // GETTER 
    public String getName(){
        return stdName;
    }
    public int getScore1(){
        return score1;
    }
    public int getScore2(){
        return score2;
    }
    // METHOD FOR PRINTING NAME
    public void printName(){
        System.out.println("The name of the student is : "+this.stdName);
    }
    // METHOD FOR TAKING GRADES
    public void inputGrades(){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE " + this.stdName +"'s TEST 1 SCORE : ");
        score1= sc.nextInt();

        while(score1<0 || score1>100){
            System.out.println("The grade should be between 0 and 100 : Please Re-enter");
            score1= sc.nextInt();
        }

        System.out.println("ENTER THE " + this.stdName + "'s TEST 2 SCORE : ");
        score2= sc.nextInt();
             
        while(score2<0 || score2>100){
            System.out.println("The grade should be between 0 and 100 : Please Re-enter");
            score2= sc.nextInt();
        }
    }
    // METHOD FOR CALCULATING AVERAGE
    public double getAverage(){
        int total = score1 + score2 ;
        return (total/2.0) ; 
    }
    // METHOD FOR DISPLAYING THE STRING
    public String toString(){
        return "Name : " + stdName+
                "\nTest 1 : " +score1+
                "\nTest 2 : " +score2;
    }
    public void display(){
        System.out.println("The name of the student is : "+ this.stdName);
        System.out.println("The test 1 score is : "+ this.score1);
        System.out.println("The test 2 score is : "+ this.score2);
    }

}
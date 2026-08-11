public class Grades{
    public static void main(String []args){
        Student std1= new Student("Akber");
        Student std2= new Student("Manaf");
        std1.inputGrades();
        std2.inputGrades();
        System.out.println("The average for  "+std1.getName()+" is : " +std1.getAverage());
        System.out.println("The average for  "+std2.getName()+" is : " +std2.getAverage());
        System.out.println("Student 1 : ");
        System.out.println(std1);
        System.out.println("--------------------------------");
        System.out.println("Student 2 : ");
        System.out.println(std2);

        

    }
}
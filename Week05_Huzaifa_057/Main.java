public class Main {
    public static void main(String[] args) {
        Employee E1 = new Employee("arham", 20250142 ,90000.0 , new Date(10,"june",2000));
        System.out.println("Before increasing salary");
        System.out.println(E1);

        System.out.println("==============================");
        System.out.println("After increasing salary");
        E1.increseSalary(20.0);
         System.out.println(E1);

        System.out.println( "Employee is working for "+ E1.yearsOfService(new Date(12,"october",2026))+" years ") ;

        System.out.println("==============================");
        Employee E2 = new Employee("Huzaifa",202506144, 70000 , new Date(19,"july", 2006));
        E2.increseSalary(10);
        System.out.println("is salary above 70000 ?"+E2.isSalaryAbove(70000));
        System.out.println(E2);

    }
}

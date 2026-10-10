import java.util.HashSet ; import java.util.Set ; import java.util.Objects ;
public class Main {
    public static void main(String[] args) {
        Patient P1 = new Patient() ;
        Patient P2 = new Patient() ;
        Patient P3 = new Patient("Prime","minister",123);

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println(P1.equals(P1));
        System.out.println(P1.equals(P2));
        System.out.println(P1.equals(P3));

        Patient s1 = new Patient ("Sara" , "Khan" , 101) ;
        Patient s2 = new Patient ("Sara" , "Khan" , 101) ;

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("S1 == s2  : " + (s1 == s2));
        System.out.println("S1.equals(s2) : " + s1.equals(s2));

        System.out.println("Sara 1 hash Code : " + s1.hashCode());
        System.out.println("Sara 2 hash Code : " + s2.hashCode());

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX JFC : HASH-SET XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        Set<Patient> patients = new HashSet<>();
        patients.add(s1); patients.add(s2);

        System.out.println("HashSet size : " + patients.size());
        Patient searchPatient = new Patient("Sara", "Khan" , 101);

        System.out.println("Patient found : "+ patients.contains(searchPatient));
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXX Hash Code XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");


    }
}

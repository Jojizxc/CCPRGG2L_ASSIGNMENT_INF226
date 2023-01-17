import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);

        System.out.println("----------------------------WELCOME TO NATIONAL UNIVERSITY---------------------------");
        System.out.print("Enter email address: ");
        String studentEM = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\w{1,}@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEM);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email address");
        } else {
            System.out.println("invalid student email address");
        }


        System.out.print("Enter Cellphone Number:");
        String studentCell= scan.nextLine();
        
        Pattern patterns = Pattern.compile("\\+63\\d{9}");
        Matcher matchers = pattern.matcher(studentEM);

        

        if (match) {
            System.out.println("valid student number");
        } else {
            System.out.println("invalid student number");
        }

        System.out.print("Enter Birthdate: ");
        String studentbirthdate = scan.nextLine();

        Pattern pattern1 = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        Matcher matcher1 = pattern.matcher(studentbirthdate);

        if (match) {
            System.out.println("valid student birthdate");
        } else {
            System.out.println("invalid student birthdater");
        }


    }
}


        
package registration.form;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class RegistrationForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int sum;
       
               
       Scanner scanner;
       scanner = new Scanner(System.in);
    
       System.out.print("Enter your first name:");
       String firstname = scanner.nextLine();
      
       
       System.out.print("Enter your last name:");
       String lastname = scanner.nextLine();
       
       System.out.print("Enter your age:");
       int age = scanner.nextInt();
       
       System.out.print("Enter your Student ID number:");
       int idnumber = scanner.nextInt();
       
       System.out.print("Enter the program you're enrolling in:");
       String enrolling = scanner.nextLine();
       
       System.out.print("Enter your intended major or concentration:");
       String majororconcentration = scanner.nextLine();
       
       System.out.print("Enter your high school:");
       String highschool = scanner.nextLine();
       
        System.out.print("Enter your address:");
        String address = scanner.nextLine();
         
        System.out.print("Enter your guardian or emergency contacts full name:");
        String guardian = scanner.nextLine();
        
        System.out.print("Enter your guardians contacts number:");
        long number = scanner.nextLong();
        
      
       
       
       
       
     
       
       
    }
    
}

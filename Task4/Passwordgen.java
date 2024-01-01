
// Task4 - Random Password Generator

import java.util.Scanner;
import java.lang.Math;
/**
 * Passwordgen
 */
public class Passwordgen {

    public void Password() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the Password::");
        int len = scanner.nextInt();

        // It used to build sequence of the string up to the user specified length
        StringBuilder str = new StringBuilder(len);

        String Elements = "ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!~#$%^@&*()_-=+[{]}.,<>?/|`";
        
        for (int i = 0; i < len; i++) {
            // System.out.println(Elements.charAt(i));
            int ch = (int)(Elements.length() * Math.random());

            str.append(Elements.charAt(ch));
        }

        System.out.println("Password is::"+str);
    }

    public static void main(String[] args) {
        
        System.out.println("Random Password Generator");
        System.out.println("********************************************");
        char ch;

        
        Passwordgen object = new Passwordgen();
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("1. Generate Password");
            System.out.println("2. Exit");

            System.out.println("Enter your choice::");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    object.Password();
                    break;
            
                case 2:
                    System.out.println("Exiting..");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice!!");
                    break;
        }

            System.out.println("Do you want to continue?(y/n)");
            ch = scanner.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        System.out.println("Exiting..");
    }
}
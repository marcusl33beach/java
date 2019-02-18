//All my imports
import java.util.Scanner;

/**
 * Java class to use package scanner
 */
public class Packages {
    public static void main(String[] args){
        // Gets user input
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Username");

        // Print out user input
        String userName = myObj.nextLine();
        System.out.print("Username is: " + userName);
    }
}

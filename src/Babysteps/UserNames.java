package Babysteps;

import java.util.Scanner;
import java.util.Random;
public class UserNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter your first name: ");
        String firstName = input.next();
        System.out.print("Enter your last name: ");
        String lastName = input.next();
        String userName = lastName.substring(0, 4) + firstName.charAt(0) + (rand.nextInt(90) + 10);
        System.out.println("Your username is: " + userName);
    }
}

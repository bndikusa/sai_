package practice;

import java.util.Scanner;

public class Workout {
        public static void main( String[] args ) {
            Scanner biceps = new Scanner(System.in);
            System.out.println("Enter Maximum number you reached ");
            int number = biceps.nextInt();
            int sum = 0;

            for (int i = 1; i <= number; i = i + 1) {
                sum = i + sum;

            }
            if(number%2==0) {
                System.out.print("The total number of repitions sai did is "+sum);
            } else {
                System.out.print("The total number of repitions pawan did is "+sum);
            }

        }
}




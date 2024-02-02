package constructors;

import java.util.Scanner;

    public class NumberDisplay {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number between 0 and 3: ");
            int num = input.nextInt();
            switch (num) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                default:
                    System.out.println("Please enter again");
                    break;
            }
        }
    }


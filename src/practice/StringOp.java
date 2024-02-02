package practice;

import java.util.Scanner;

public class StringOp {
    public static void main(String[] args) {
        String s1,s2  ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings");
        s1 = sc.nextLine();         //s = sc.nextLine();
        s2 = sc.nextLine();
        String s3 = s1 + s2 ;
//        String s3 = s1.concat(s2);  //String s3 = s1.concat(s2) concatination
        int value = s1.length();
        int value2 = s2.length();
        System.out.println(value);
        System.out.println(value2);
        System.out.println(" Result on Concatenation is " +s3);
    }
}

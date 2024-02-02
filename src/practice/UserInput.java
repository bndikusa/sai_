package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        try {
            int n = Integer.parseInt(br.readLine());
            System.out.println(n);
        }catch(ArithmeticException e){
            System.out.println(" ArithmeticException " +e);
        }
        catch(Exception w)
        {
            System.out.println(w);
        }
        finally {
            System.out.println("finally");
        }

    }
}

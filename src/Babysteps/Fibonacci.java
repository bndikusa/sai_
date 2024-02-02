package Babysteps;

public class Fibonacci {
    public static void main(String[] args) {
        int i , j=1, k=1 ;
        i=0;
        System.out.print("1 1");
        while(i<=50)
        {
            i=j+k;
            System.out.print(i + " ");
            j=k;
            break;
        }
    }
    }
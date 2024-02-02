package Babysteps;

public class DemoClass {
    public static void main(String[] args) throws Exception
    {
        String str = "A,B,C,D";
        String names[] = str.split(",");
        for (String val : names)
            System.out.println(val);


    }
}

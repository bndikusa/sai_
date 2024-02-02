import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) throws Exception {
        try {
            for(int i=0 ; i<=3 ; i++ )
            {
                System.out.println("enter j value");
                Scanner sc = new Scanner(System.in);
                String j = sc.nextLine();
//                String k =j/i;
//                System.out.println(k);

            }
        }
        catch (Exception e )
        {
            System.out.println(e);
        }
        System.out.println("checking");

    }
}

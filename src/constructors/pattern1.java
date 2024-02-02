package constructors;

public class pattern1 {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<=3;i++) //rows
        {
            for(j=0;j<=3;j++) //columns
            {
                    System.out.print((i+j)%4+1);
            }
            System.out.println();
        }
        }

    }

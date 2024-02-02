package practice.collection;

import java.util.Vector;

public class VctrDemo {
    public static void main(String[] args) throws Exception{
        Vector v = new Vector<>();
        v.add(4);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);

        v.remove(0);

 for (Object i : v)
 {
     System.out.println(i);
 }



        System.out.println(v.capacity());

    }
}

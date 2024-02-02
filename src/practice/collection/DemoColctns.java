package practice.collection;

import java.util.*;

// iterator
// enhanced forloop
public class DemoColctns {
    public static void main(String[] args) throws Exception {
//        int values[] = new int[];
//        Object values[] = new Object[];
//        values[0] = "Sai";
//        values[1] = 7;
        List<Integer> values = new ArrayList<Integer>();
        values.add(309);
        values.add(233);
        values.add(467);
        values.add(732);
        values.add(482);

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(01>02)
                    return 1;
                return 0;
            }
        };

//        Collections.sort(values);
//        Collections.reverse(values);

//        Collections.sort(values.com);
//        values.forEach(System.out::println);
//        Stream API :: Lambda Expression



        //we print values by using iterator and enhanced for loop
// Iterator
//        Iterator i = values.iterator();
////        System.out.println(i.next());
////        System.out.println(i.next());
////        System.out.println(i.next());
//        while (i.hasNext())
//        {
//            System.out.println(i.next());
//        }
for (int i : values)
{
    System.out.println(i);
}
    }
}

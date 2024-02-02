package practice.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> values= new HashSet<>();
        System.out.println(values.add(6));
        System.out.println(values.add(5));
        System.out.println(values.add(7));
    for (int i : values)
    {
        System.out.println(i);
    }
    }

}
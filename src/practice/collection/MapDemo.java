package practice.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,23);
        map.put(1,24);
        map.put(2,25);

        System.out.println(map);
    }

}

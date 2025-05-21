package DAY_9;
import java.util.HashMap;
import java.util.Map; 
public class DemoMap { 
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "Apple");
        m.put(2, "Banana");
        m.put(3, "Grapes");
        m.put(4, "Orange");
        m.put(5, "Pineapple");

        for(Map.Entry<Integer,String> i:m.entrySet()){
            System.out.println(i.getValue());
            System.out.println(i.getKey());
        }

        System.out.println(m);
    }
}

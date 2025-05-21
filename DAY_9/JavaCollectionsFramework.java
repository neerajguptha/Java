package DAY_9;
import java.util.*;
public class JavaCollectionsFramework {

    public static void main(String[] args) {
    ArrayList <Integer> arr=new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);

    ListIterator<Integer> il = arr.listIterator(arr.size());
        
        Enumeration<Integer> en = Collections.enumeration(arr);

    while (en.hasMoreElements()) {
          System.out.println(en.nextElement());
    }

    while (il.hasNext()) {
        System.out.println(il.next());
    }

    while (il.hasPrevious()) {
    System.out.println(il.previous());
    }
  }
}
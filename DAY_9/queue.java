package DAY_9;
import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        q.add(12);
        q.offer(45);
        q.offer(78);
        q.offer(678);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.remove();
        System.out.println(q);
    }
}

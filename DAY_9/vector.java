package DAY_9;
import java.util.Enumeration;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> l1=new Vector<>();
        l1.add(12);
        l1.add(45);
        l1.add(79);
        System.out.println(l1);
        Enumeration il=l1.elements();
        while(il.hasMoreElements()){
            System.out.println(il.nextElement());
        }
    }
}

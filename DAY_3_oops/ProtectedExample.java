package DAY_5;
class Base {
    protected void greet() {
        System.out.println("This is a protected method.");
    }
}

public class ProtectedExample extends Base {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        obj.greet();  
    }
}

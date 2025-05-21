package DAY_5;
public class PrivateExample {
    private void display() {
        System.out.println("This is a private method.");
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        obj.display();
    }
}

package DAY_5;

class  demo{
    // private void add(){
    //     System.out.println("Hii");
    // }
}
public class acessSpecifiers extends demo{
    private void add(){
        System.out.println("Hii");
    }
    public static void main(String[] args) {
        acessSpecifiers s=new acessSpecifiers();
        s.add();
    }
}

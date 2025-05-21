package DAY_1;

public class InstanceStaticDemo {
	
	int a=10, b=30;
	static int p=90,q=34;
	void add() {
		int x=23,y=45;
		System.out.println(a+b);
		System.out.println(p*q);
		System.out.println(x-y);
	}
	
	static void show() {
		int a=10;
		int b=60;
		System.out.println(a*b);
	}
	
	
	public static void main(String[]args) {
		InstanceStaticDemo t=new InstanceStaticDemo();
		t.add();
		show();
		
		
		
		}
		
	}


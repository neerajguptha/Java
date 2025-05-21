package DAY_2;

public class Primenumber {
	public static boolean isPrime(int n) {
		if(n<=1) 
			return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
			//return true;
		}
		return true;
	}
 public static void main(String[]args) {
	 for(int i=2;i<=20;i++) {
		 if(isPrime(i)) {
			 System.out.println(i);
		 }
	 }
	 
 }
}

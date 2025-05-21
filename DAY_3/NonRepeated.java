package DAY_3;

public class NonRepeated {

	public static void main(String[]args) {
		int arr[]= {1,2,3,1,5};
		int a[]=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			 if(count==1) {
				a[index++]=arr[i];
			}
		}
		System.out.println("Non repeated ");
		for(int i=0;i<index;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
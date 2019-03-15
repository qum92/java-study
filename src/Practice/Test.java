package Practice;

public class Test {
	
	public static void main(String[] args) {
		int[] a = {7,2,9,5,3};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
		}
		for(int i:a) {
			System.out.print(i);
		}
	}
}

package Practice;

import java.util.ArrayList;

public class All {
	
	public static void main(String [] args) {
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			al.add(i);
		}
		for(int i=10;i>0;i--) {
			ar.add(i);
		}
		System.out.println(al);
		System.out.println(ar);
	}
}

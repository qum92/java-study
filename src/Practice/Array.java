package Practice;

import java.util.ArrayList;

public class Array {
	
	public static void main(String [] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=1;i<=100;i++) {
			al.add(i);
			if(i%3==0) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
		}
	}
}
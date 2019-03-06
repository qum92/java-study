package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList3 {
	
	public static void main(String [] args) {
		ArrayList<Integer>numList = new ArrayList<>();
		for(int i=0;i<6;i++) {
			int ranList = (int)(Math.random()*45)+1;
			numList.add(ranList);
		}
		System.out.println(numList);
		Scanner scan = new Scanner(System.in);
		System.out.println(" , 를 기준으로 숫자 6개를 입력해보세요.");
		String numStr = scan.nextLine();
		String[] numStrs = numStr.split(",");
		int a = 0;
		for(int i=0;i<6;i++) {
			if(numList.indexOf(Integer.parseInt(numStrs[i]))!= -1) {
				a++;
			}
		}
		System.out.println(numList);
		System.out.println(a);
	}
}

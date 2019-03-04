package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw1 {
	
	public static void main(String [] args) {
		ArrayList<Integer>al = new ArrayList<>();
		for(int i=0;i<4;i++) {
			int ranNum = (int)(Math.random()*9);
		if(al.indexOf(ranNum) == -1) {	
			al.add(ranNum);
		}else {
			i--;
		}
		}
		Scanner scan = new Scanner(System.in);
		System.out.println(",를 맞춰서 숫자 4개를 입력하시오.");
		String Strnum = scan.nextLine();
		String [] Strnums = Strnum.split(",");
		int[] num = new int[4];
		for(int i=0;i<Strnums.length;i++) {
			num[i] = Integer.parseInt(Strnums[i]);
		}
		int bCnt = 0;
		int sCnt = 0;
		for(int i=0;i<num.length;i++) {
			if(al.indexOf(num) != -1) {
				sCnt++;
			}else if(i==al.indexOf(num[i])) {
				bCnt++;
			}
			}
			if(sCnt+bCnt==0) {
				System.out.println("아웃!");
			}else {
				System.out.println(sCnt + "S, " + bCnt + "B");
		}
	}
}
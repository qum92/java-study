package collection.list;

import java.util.ArrayList;
import java.util.Scanner;


public class BaseBall1 {
	
	public static void main(String [] args) {
		ArrayList<Integer> numList = new ArrayList();
		for(int i=0;i<5;i++) {
			int ranList = (int)(Math.random()*9)+1;
		if(numList.indexOf(ranList)==-1) {
			numList.add(ranList);
		}else {
			i--;
			}
		}
		System.out.println("numList : " + numList);
		Scanner scan = new Scanner(System.in);
		System.out.println(", 를 사용해서 3개의 숫자를 맞춰 보세요.");
		String Strnum = scan.nextLine();
		String[] Strnums = Strnum.split(",");
		int[] nums = new int[3];
		for(int j=0;j<Strnums.length;j++) {
			 nums[j] = Integer.parseInt(Strnums[j]);
		}
		int bCnt = 0;
		int sCnt = 0;
		for(int i=0;i<nums.length;i++) {
			if(numList.indexOf(nums[i])!=-1) {
			if(i==numList.indexOf(nums[i])) {
				sCnt++;
			}else{
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
}
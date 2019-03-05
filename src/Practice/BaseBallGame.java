package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=0;i<4;i++) {
			int ranNum = (int)(Math.random()*10);
		if(numList.indexOf(ranNum)== -1) {
			numList.add(ranNum);
		}else {
			i--;
		}	
		}
		System.out.println(numList);
		int ty = 0;
		int bCnt = 0;
		int sCnt = 0;
		while(sCnt<4) {
		System.out.println("1~9까지 맞추는 숫자 게임입니다.");
		Scanner scan = new Scanner(System.in);
		System.out.println(",를 맞춰서 숫자 4개를 입력해주세요.");
		String [] getNum = scan.nextLine().split(",");;
		int num[] = new int[4];
		for(int i=0;i<4;i++) {
		try {
			num[i] = Integer.parseInt(getNum[i]);
		}
		catch(Exception e) {
			continue;
		}
		
	}
		bCnt = 0;
		sCnt = 0;
		for(int i=0;i<getNum.length;i++) {
			if(numList.indexOf(num[i])!= -1) {
				if(numList.indexOf(num[i])==i) {
				sCnt ++;
			}else {
				bCnt ++;
			}
		}
		}
		ty ++;
		System.out.println("시도 횟수"+ty);
		System.out.println("볼"+bCnt);
		System.out.println("스트라이크"+sCnt);
		}
		System.out.println("게임에서 이기셨습니다.");
	}
}

package Practice;

import oop.ThisExam;

public class HamburgerPrice {
		
		int b = 5100;
		int d = 1800;
		int f = 2200;
	int price() {
		return b+d+f;
	}
	public void menu() {
			System.out.println("각각 구입한 가격은 " +(price())+"원 입니다");
		}
}
class SetPrice extends HamburgerPrice {

	public void menu() {
		System.out.println("셋트 메뉴의 가격은 "+(price()-2500)+"원 입니다.");
		
	}
	public static void main(String [] args) {
		SetPrice sp = new SetPrice();
		sp.menu();
	}
}
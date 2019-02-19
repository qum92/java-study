package oop.inter;

public class Print implements PrintSome {


	@Override
	public void printString(String str) {
		System.out.print(str);
	}

	@Override
	public void printChar(char c) {
		System.out.println(c);
	}

	@Override
	public void printInt(int num) {
		System.out.println(num);
	}

	public static void main(String [] args) {
		Print p = new Print();
		p.printString("abc");
		
		PrintSome ps = new Print();
	}
}

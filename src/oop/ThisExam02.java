package oop;

public class ThisExam02 {
	int num2 = 8;
	String str = "sbs";
	
	ThisExam02(){}
	
	ThisExam02(int num2, String str){
	this.num2 = num2;
	this.str = str;
	System.out.println(this.num2);
	System.out.println(this.str);
	}
	
	public static void main(String[] args) {
		ThisExam02 te = new ThisExam02(10,"ccc");
		System.out.println(te.num2);
	}
}

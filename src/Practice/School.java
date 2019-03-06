package Practice;

public class School {
	void Class () {
		System.out.println("저는 학생 입니다.");
	}
	void Class (int g, int c) {
		System.out.println("저는 "+g+"학년"+c+"반 입니다.");
	}
	void Class (String t) {
		System.out.println("저의 선생님은 "+ t + " 입니다.");
	}
	public static void main(String [] args) {
		School sc = new School();
		sc.Class();
		sc.Class(6,2);
		sc.Class("박경훈");
	}
}

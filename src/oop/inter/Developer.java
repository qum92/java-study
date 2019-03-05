package oop.inter;

public class Developer implements Work {

	public void goOffice() {
		System.out.println("개발자가 출근을 합니다.");
	}

	public void working() {
		System.out.println("개발자가 일을 합니다.");
	}

	public void goHome() {
		System.out.println("개발자가 퇴근을 합니다.");
	}

	public void eat() {
		System.out.println("개발자가 밥 먹습니다.");
	}

}

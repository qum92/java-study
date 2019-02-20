package exam.ex04;

public class Person implements Action{

	@Override
	public void speak() {
		System.out.println("안녕~");
	}

	@Override
	public void sleep() {
		System.out.println("꿀잠 잠");
	}

	@Override
	public void eat() {
		System.out.println("식사 개꿀띠");
	}
}

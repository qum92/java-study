package oop.inter;

public class Execute {

	public static void main(String[] args) {
		Work w = new Developer();
		w.goOffice();
		w.working();
		w.eat();
		w.goHome();

		w = new Manager();
		w.goOffice();
		w.working();
		w.eat();
		w.goHome();

		w = new Developer();
		w.goOffice();
		w.working();
		w.eat();
		w.goHome();
		
		w = new Manager();
		w.goOffice();
		w = new Developer();
		w.working();
		w.eat();
		w.goHome();

	}
}

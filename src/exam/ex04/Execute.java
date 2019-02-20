package exam.ex04;

public class Execute {
	
	public void space(Action a) {
		a.sleep();
	}
	public void restaurant(Action b) {
		b.eat();
	}
	public void communication(Action c) {
		c.speak();
	}
	public static void main(String [] args) {
		Execute ex = new Execute();
		Action c = new Cat();
		Action p = new Person();
		ex.space(c);
		ex.space(p);
		ex.communication(c);
		ex.communication(p);
		ex.restaurant(c);
		ex.restaurant(p);
	}
}

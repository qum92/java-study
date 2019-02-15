package oop.inherit;

public class Cat extends Animal {
	Cat(int age, String type){
		this.age = age;
		this.type = type;
	}
	public static void main(String [] args) {
		Animal c = new Cat(6, "샴");
		c.eat();
		c.sleep();
		c.run();
		Animal d = new Dog(6, "푸들");
		d.eat();
		d.sleep();
		d.run();
	}
}

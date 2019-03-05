package collection.list;

import java.util.ArrayList;
import java.util.List;

class Cat{
	String name;
	int age;
	
	public Cat() {
		super();
	}
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
}
public class CatList {

	public static void main(String [] args) {
		List<Cat> catList = new ArrayList<>();
		for(int i=0;i<10;i++) {
			Cat c = new Cat();
			int num = (int)(Math.random()*30)+1;
			c.setName("냥이"+(i+1));
			c.setAge(num);
			catList.add(c);
		}
		for(Cat c : catList) {
			System.out.println(c);
		}
	}
}

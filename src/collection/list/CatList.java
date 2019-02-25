package collection.list;

import java.util.ArrayList;
import java.util.List;

class Cat{
	private Integer age;
	private String name;
	
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public Integer getAge() {
		return this.age;
	}
}
public class CatList {
	public static void main(String [] args) {
		List<Cat> cl = new ArrayList<>();
		for(int i=0;i<10;i++) {
			Cat c = new Cat();
			cl.add(c);
			c.setAge(i+1);
			c.setName("야옹이"+(i+1));
		}
		for(int i=0;i<10;i++) {
			Cat c = cl.get(i);
			System.out.println(c.getName()+c.getAge());
		}
	}
}

package collection.list;

import java.util.ArrayList;
import java.util.List;

class Dog{
	private String name;
	private Integer age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age){
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	}
public class DogList {
	public static void main(String [] args) {
	List<Dog> nl = new ArrayList<>();
		for(int i=0;i<10;i++) {
		Dog d = new Dog();
		nl.add(d);
		d.setName("강아지"+(i+1));
		d.setAge(i+1);
	}
		for(int i=0;i<10;i++) {
		Dog d = nl.get(i);
		System.out.println("강아지의 이름은: "+d.getName()+" 입니다."+ "강아지의 나이는: " +d.getAge()+"살 입니다.");
	}
}
}
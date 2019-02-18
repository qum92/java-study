package exam;

import java.util.Scanner;

class Dog{
	String name;
	int age;
	String tpye;
	}
class Cat{
	String name;
	int age;
	String type;	
}
class Food{
	String name;
	int price;
	String productcompany;
}
class Student{
	String name;
	int grade;
	String schoolname;
}
public class StudentArray {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		for(int i=0;i<students.length;i++) {
			students[i] = new Student();
			students[i].grade = i+1;
		}
		Dog[] dogs = new Dog[5];
		for(int i=0;i<dogs.length;i++) {
			dogs[i] = new Dog();
			dogs[i].age = i+3;
			}
		Cat[] cats = new Cat[3];
		for(int i=0;i<cats.length;i++) {
			cats[i] = new Cat();
			cats[i].age = i+3;
			}
		Food[] pr = new Food[5];
		for(int i=0;i<pr.length;i++) {
			pr[i] = new Food();
			pr[i].price = i+100;
			}
		
		System.out.println(students[9].grade);
		System.out.println(dogs[3].age);
		System.out.println(cats[2].age);
		System.out.println(pr[2].price);
	}
}

package exam.ex03;

public class Execute  {

	public static void main(String [] args) {
		Dog[] d = new Dog[10];
		for(int i=0;i<d.length;i++) {
			d[i] = new Dog();
			d[i].setName("카드"+i);
			d[i].setAge(i);
		}
		for(int i=0;i<d.length;i++) {
			System.out.println("개 ["+i+"]의 이름은 "+d[i].getName()+"입니다.");
			System.out.println("개 [카드"+i+"]의 나이는 "+d[i].getAge()+"입니다.");
		}
	}
}

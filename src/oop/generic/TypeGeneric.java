package oop.generic;

class Test{
	public void test() {
		
	}
}
public class TypeGeneric<T> extends Test{
	public void test() {
		
	}

	private Object o;
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public Object getO() {
		return o;
	}

	public void setO(Object o) {
		this.o = o;
	}

	public static void main(String[] args) {
		TypeGeneric<Integer> tg = new TypeGeneric<>();
		tg.setT(123);
		Integer i = tg.getT();
		System.out.println(i);
		tg.setO("abc");
		Object o = tg.getO();
		System.out.println(o);
	}

}

package exam.ex03;

public class StaticExam01 {
	public static String name = "하하";
	public String name1 = "호호";
	
	public static void test() {
		System.out.println();
	}
	public static void main(String[] args) {
		StaticExam01.name = "히히";
		StaticExam01 se01 = new StaticExam01();
		System.out.println(se01.name);
		System.out.println(StaticExam01.name);
	}
}

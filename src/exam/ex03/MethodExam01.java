package exam.ex03;

public class MethodExam01 {
	public String name = "채희주";
	
	public static void setTest(MethodExam01 me) {
		MethodExam01 me1 = new MethodExam01();
		me1.name = "임꺽정";
	}
	public static void main(String[] args) {
		MethodExam01 me = new MethodExam01();
		System.out.println(me.name);
		MethodExam01.setTest(me);
		System.out.println(me.name);
	}
}

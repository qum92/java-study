package exam.ex03;

public class StaticTest {

	public static int num = 1;
	
	public static void main(String[] arg) {
		StaticTest[] st = new StaticTest [4];
		for(int i=0;i<st.length;i++) {
			st[i] = new StaticTest();
			st[i].num = i;
		}
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i].num);
		}
		StaticTest st1 = new StaticTest();
		System.out.println(st1.num);
	}
}

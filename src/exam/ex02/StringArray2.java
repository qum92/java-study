package exam.ex02;

public class StringArray2 {
	public String[] strs = new String[10];
//	public StringArray2() {
//		strs = new String[10];
//	}
	public static void main(String[] args) {
		StringArray2 sa1 = new StringArray2();
		StringArray2 sa2 = new StringArray2();
		for(int i=0;i<10;i++) {
			sa1.strs[i] = (i+1) + "";
			sa2.strs[i] = (10-i) + "";
		}
		for(int i=0;i<10;i++) {
			System.out.println("sa1.strs[" + i + "]=" + sa1.strs[i]);
			System.out.println("sa2.strs[" + i + "]=" + sa2.strs[i]);
		}
	}
}
//for(int i=0;i<sa1.strs.length;i++) {
//System.out.println("sa1.strs[" + i + "]= " +(i+1));	
//
//}
//for(int i=sa2.strs.length-1;i>0;i--) {
//System.out.println("sa2.strs[" + i + "]= " +(i));
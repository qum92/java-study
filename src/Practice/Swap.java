package Practice;

public class Swap {
//Array를 만들어서 1~10까지 넣고 배열을 하나 더 만들어서 거꾸로 채워넣기
	public static void main(String [] args) {
		int[] ar = new int[10];
		for(int i=0;i<10;i++) {
			ar[i] = i+1;
			System.out.print(ar[i]+" ");
			}
		System.out.println();
		int[] al = new int[10];
		for(int i=9;i>=0;i--) {
			al[i] = i+1;
			System.out.print(al[i]+" ");
		}
		}
	}


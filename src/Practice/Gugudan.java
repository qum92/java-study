package Practice;

import java.util.Scanner;

/*	
 * 1단부터 9단(1X9,1X8,1X7... 역순으로) 까지 출력은 메소드로 하시고 
 * 출력한 값을 배열에 직업놓고 Scanner으로 값을 입력 받으면
 *입력받은 값의 배열 주소를 출력 하세요. 

Scanner 값은 두개로 받으시고
배열의 인덱스에 저장은 순서대로 1X1...
*/
public class Gugudan {
	public void a() {
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단의 몇 단을 보시겠습니까?");
		int b = Integer.parseInt(scan.nextLine());
		System.out.println("구구단의 "+b+" 몇을 보시겠습니까?");
		int c = Integer.parseInt(scan.nextLine());
		System.out.println(b+"X"+c+"="+(b*c));
	}

	public static void main(String[] args) {
		Gugudan gu = new Gugudan();
		gu.a();
					
	}
}

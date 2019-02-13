package syntax;

public class ThreeSixNine1 {
	
	public static void main(String[] args) {
		for(int i=0;i<30;i++) {
			if(i!=0 && i==3 || i==6 || i==9) {
				System.out.print(" 짝 ");
			}else if(i>10 && i%3==1 && i<20) {
				System.out.print(" 짝 ");
			}else if(i>20 && i%3==2) {
				System.out.print(" 짝 ");
			}	
			else {
				System.out.print(" "+i+" ");
			}
		}
	}
}

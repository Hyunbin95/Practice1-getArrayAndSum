import java.util.Scanner;

public class Execrsize {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); int a=0,b=0; int c=1;
		 * System.out.println("�Ǻ���ġ ������ ������ ������ ���ּ���"); int num = sc.nextInt(); for(int
		 * i=0; i<num; i++) { System.out.println(c); b=a; a=c; c=a+b; } sc.close();
		 */


		for(int i=0; i<5; i++) {
			if(i<3) {
				for(int i1=3; i<i1; i1--) {
					System.out.print("*");
				}
			}else {
				for(int i1=2; i1<=i; i1++) {
					System.out.print("*");
				}
			}
			System.out.println();
			//if(i==4)
			//	i=0;
		}

	}
}
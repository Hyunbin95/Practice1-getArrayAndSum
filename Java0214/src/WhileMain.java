import java.util.Scanner;

public class WhileMain {

	public static void main(String[] args) {
		/* while�� �̿��ؼ� 0,1,2 ���
		int i = 0;
		while(i<3) {
			System.out.printf("i:%d\n", i);
			i++;
		}
		*/
		Scanner sc = new Scanner(System.in);
		int i=1;
		System.out.println("���� �Է�: ");
		int num1 = sc.nextInt();
		while(i<10) {
			System.out.println(num1 +" * "+ i +  " = " + num1*i);
			i++;
		}
		int sum=0;
		for(int j=1; j<=100 ; j++) {
				sum=sum+j;
		}
		System.out.println("¦���հ�:"+sum);
	}

}

import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int []ar = new int[5];
		int leng = ar.length;
		for(int i=0; i<leng; i++) {
			System.out.println("�Է�"+(i+1)+">");
			ar[i]=sc.nextInt();
		}
		for(int imsi : ar) {
			System.out.printf("%d\t", imsi);
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<leng;i++) {
			sum+=ar[i];
		}
		System.out.println("�հ� : "+sum);
		
		sc.close();
		

	}

}

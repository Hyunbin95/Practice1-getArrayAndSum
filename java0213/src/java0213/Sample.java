package java0213;
import java.util.Scanner;
public class Sample {
	 static Scanner sc = new Scanner(System.in);

	
	public static void swap() {
		System.out.println("�ݶ�,���̴� ���� ������ �Է�: ");
		int coke = sc.nextInt();
		int cider = sc.nextInt();
		int binGlass;
		
		binGlass = coke;
		coke = cider;
		cider = binGlass;
		System.out.println("�ݶ� : " + coke + " ���̴� : " + cider);
				}
	
	public static void time() {
		
		System.out.println("�ð� �Է�(�ʴ���) :");
		int num = sc.nextInt();
		int hour,minit,second;
		
		hour = num/3600;
		minit = (num%3600)/60;
		second = num%60;
		System.out.println("Hour : " + hour + "\nMinit : " + minit + "\nsecond : " + second );
		sc.close();
	}
}

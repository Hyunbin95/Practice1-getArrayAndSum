package java0213;

import java.util.Scanner;

public class Op4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.printf("�Ž��� ���� �Է��ϼ���:\n");
		
		int money = sc.nextInt();
		int man = money/10000;
		int five = (money%10000)/5000;
		int thousand = (money%5000)/1000;
		System.out.printf("���� ¥�� %d �� \n��õ�� ¥�� %d ��\nõ�� ¥�� %d ��\n" , man,five,thousand);
		
	}
}

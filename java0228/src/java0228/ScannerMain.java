package java0228;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		//Ű����κ��� �Է¹޴� ��ĳ�� �����
		Scanner sc = new Scanner(System.in);
		//���ڿ� �Է¹ޱ�
		System.out.println("���ڿ� �Է� : ");
		String line = sc.nextLine();
		System.out.printf("�Է��� ���ڿ� : %s\n",line);
		
		
		//���� 1���� �Է¹ޱ�
		System.out.printf("���� �Է�:");
		int n = sc.nextInt();
		System.out.println("�Է°� : "+n);
		

		//���ڿ� �Է¹ޱ�
		System.out.println("���ڿ� �Է� : ");
		//���� �Է¿��� �Ѿ�� Enter�� ���ֱ� ���ؼ� ȣ��
		sc.nextLine();
		line = sc.nextLine();
		System.out.printf("�Է��� ���ڿ� : %s\n",line);

				
		int su = 0;
		for(int i=0; i<line.length(); i++) {
			char ch = line.charAt(i);
			if('0'<=ch && ch<='9') {
				su = su * 10 + (ch-48); //48�� 0
			}else {
				continue;
			}
		}
		System.out.printf("��ȯ�� ����:%d\n", su);
		
		sc.close();
	}
}

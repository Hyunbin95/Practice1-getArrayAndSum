package java0213;

import java.util.Scanner;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 5;
		//n1 �� n2 �� ū �� ã��
		int result = n1 > n2? n1 : n2;
		System.out.printf("result = %d\n", result);
	
		//������ F �Ǵ� M���� ����
		char gender = 'm';
		//gender �� M�̸� ���ڶ�� ��� F �̸� ���ڶ�� ���
		//���� ������ �̿��ؼ� �ذ�
		//�ҹ��� m�� ���ڶ�� �������� ����
		String result1 = gender=='M' || gender =='m' ? "����" : "����";
		System.out.printf("���� : %s\n", result1);
		
		//���� ������ 0~100������ ���ڸ� �����ϰ�
		//60�̻��̸� �հ� �׷��� ������ ���հ��̶�� ���
		
		System.out.printf("����ó�� ������ �ʱ���� ������ �Է��ϼ��� : \n");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		System.out.printf("��� : %s\n",point>=60 ? "�հ��Դϴ� ^^" : "���հ��Դϴ٤Ф�");
		
		//point�� 80�̻��̸� ��� 60�̻��̸� ���� �� ���ϴ� ������� ���
		
		System.out.println("�߰��� ������ �Է��ϼ��� : \n");
		int mPoint = sc.nextInt();
		System.out.println("��� : " + (mPoint >=80 ? "���� �����" : mPoint >= 60 ?  "����Դϴ�" : "�ٺ��Դϴ�") ); // ( )�� ���ϸ� ���� �߻�
		String x = mPoint >= 80 ? "���������" : mPoint >=60 ? "����" : "�ٺ�"; // ( ) �� �����ʾƵ� �����߻� x 
		 
		 }

}

package java0213;

import java.util.Scanner;

public class ControlStatement{
	
	public static void main(String[] args) {
		//�ϳ��� ����(int)�� �Է¹޾Ƽ� �����ϴ� ������ �ۼ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� :");
		int inPut = sc.nextInt();
		//inPut�� 60�� �̻��̸� �հ��̶�� ��� - if�� �̿��ؼ� �ۼ�
		while(inPut<0 || 100<inPut) {
			System.out.println("�ùٸ� �Է��� �ƴմϴ�. ������ �Է��ϼ��� : ");
			inPut = sc.nextInt();			
		}
/*
		if(60<=inPut) {
			System.out.println("�����մϴ� ! �հ��Դϴ� ^^");
		}else {
			System.out.println("���հ�");
		}
		*/
		//90-100 �̸� ��, 80-90�̸��̸� �� 70-80�̸��̸� �� 60-70�̸��̸� �� 0-60�̸��̸� ��
		switch(inPut/10) {
		case 10:
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;
		default:
			System.out.println("��");
			break;
		}
		
		sc.close();
	}
}
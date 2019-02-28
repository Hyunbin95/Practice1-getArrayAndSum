package java0226;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VO �޼ҵ�ȿ� �Ű������� ���̵�, ��й�ȣ, �̸�, ����,��ȣ������ ���� ����
		
		VO [] data = new VO[3];
		
		VO vo = new VO("lee","1212","������",29,1);
		data[0] = vo;
		
		vo = new VO("kim","1313","�̸���",27,2);
		data[1] = vo;
		
		vo = new VO("park","1414","õ����",28,3);
		data[2] = vo;
		
		//�迭�� ������ Ȯ��
		for(VO temp : data) {
		System.out.println(temp);		
		}
		
		//�迭�� ������ ���� - data �� ������� �ڷ����� VO Ŭ������
		//Comparable �������̽��� implements ���� �ʾ����� ���� �߻�
		Arrays.sort(data);
		System.out.printf("=========���� ��=========\n");
		for(VO temp : data) {
			System.out.println(temp);
		}
		System.out.println("========================");
		
		//VO Ÿ���� ���� �� �ִ� Comparator �������̽���
		//Anonymous Class -> Instance
		Comparator <VO> numAscComp = new Comparator <VO>(){

			//ũ�� ���� �� ����ϴ� �޼ҵ� ��������
			@Override
			public int compare(VO o1, VO o2) { 
				return o1.getNum() - o2.getNum();
			}
			
		};
		
		Comparator <VO> numDescComp = new Comparator <VO>(){

			//ũ�� ���� �� ����ϴ� �޼ҵ� ��������
			@Override
			public int compare(VO o1, VO o2) { 
				return o2.getNum() - o1.getNum();
			}
			
		};
		
		//name�� �������� ������ �� �� �ִ� comparator
		Comparator <VO> nameAscComp = new Comparator<VO>() {

			@Override
			public int compare(VO o1, VO o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		};
		
		//name�� �������� ������ �� �� �ִ� comparator
		Comparator <VO> nameDescComp = new Comparator<VO>() {

			@Override
			public int compare(VO o1, VO o2) {
				return o2.getName().compareTo(o1.getName());
			}
			
		};
		//1������ 4������ �Է��� �ޱ� ���� �ڵ带 �ۼ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ ����(1-4) : ");
		int input = sc.nextInt();
		final int ��ȣ�������� = 1;
		final int ��ȣ�������� = 2;
		final int �̸��������� = 3;
		final int �̸���������  = 4;

		Comparator <VO> comparator = null;
		switch(input) {
		case ��ȣ��������:
			System.out.println("��ȣ ������������ ���");
			comparator = numAscComp;
			break;
		case ��ȣ��������:
			System.out.println("��ȣ ������������ ���");
			comparator = numDescComp;
			break;
		case �̸���������:
			System.out.println("�̸� ������������ ���");
			comparator = nameAscComp;
			break;
		case �̸���������:
			System.out.println("�̸� ������������ ���");
			comparator = nameDescComp;
			default:
				System.out.println("1����4������ ������ �Է��ϼ���.");
		}
		
		Arrays.sort(data, comparator);
		for(VO temp : data) {
			System.out.println(temp);
		}
		
		sc.close();
	}
}

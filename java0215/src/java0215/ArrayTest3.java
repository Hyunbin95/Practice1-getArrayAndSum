package java0215;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		//��� ���� ũ�Ⱑ ������ 2���� �迭
		//��� �̸� 20�� 5�� �׷��� ������ �� �ִ� �迭�� ����
		//�ڷ��� [][] �迭�̸� = new �ڷ���[�ళ��][������];
		String [][] names = new String[5][20];
		 
		 // 1�� 30�� 29
		// 2�� 30�� 38 //38���� �ݵ� �����Ϸ���?
		// 3�� 30�� 35 
		//4�� 30�� 28
		//String [][] student = new String [4][30] // [4][38] �� ���� ���൵�ȴ�.
		
		//������ �޸� ���� ����� �ǰ� �ִ��� �޸𸮸� ���̱� ���ؼ� �� �� �ִ� ����� �ִ�.
		
		//�ະ�� ���� ũ�Ⱑ �ٸ� 2���� �迭
		//�л����� ����(����)�� ù��° �׷��� 28�� �ι�° �׷��� 33��
		//3��° �׷��� 31���� ������ �� �ֵ��� �迭�� �����ϱ�
		
		int [][] scores = new int[3][];
		scores[0] = new int[28];//�̷� ������ ���������� ������ �� �� �ִ�.
		scores[1] = new int[33];
		scores[2] = new int[31];
		/*
		System.out.printf("%d\n", scores.length);
		System.out.printf("%d\n", scores[0].length);
		//System.out.printf("%d\n", scores[0][0].length);
		
		System.out.printf("%d\n", scores);
		System.out.printf("%d\n", scores[0]);
		System.out.printf("%d\n", scores[0][0]);
		*/
		//�ʱ� �����͸� ������ 2���� �迭 ����
		String [][] actorName = { {"������", "�۰�ȣ", "�̺���", "�ֹν�"}, {"������", "�̿���", "�����", "�����"}, {"���ؿ�", "������", "������", "������"}};
		int max= actorName.length;
		int max2= actorName[0].length;
		//���� ������ ��ü�� ���
		/*
		for(int i=0; i<max; i=i+1) {
			for(int j=0; j<max2; j=j+1) {
				System.out.printf("%10s", actorName[i][j]);
			}
			System.out.println();
		}
		*/
		//���� ���Ÿ� �̿��ؼ� ���
		/*
		for(String []temp : actorName) {
			for(String imsi : temp) {
				System.out.printf("%10s",imsi);
			}
			System.out.println();
		}
		*/
		
		
	}
}

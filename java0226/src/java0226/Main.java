package java0226;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int [] ar = {20,30,50,10,40,70,60};
		//10�� ���° �ִ��� �˻�
		//���ĵǾ� ���� �ʾƼ� �̺а˻��� ����� ������ �� �����ϴ�.
		int pos = Arrays.binarySearch(ar, 20);
		System.out.println("20�� �ִ� ��ġ : " + pos);
		Arrays.sort(ar);
		//������ ���� {10,20,30,40,50,60,70}
		System.out.println();
		//������ �Ǿ� �̺а˻��� ����� ����� ���ɴϴ�.
		pos = Arrays.binarySearch(ar, 20);
		System.out.printf("20�� �ִ� ��ġ : %d ",pos);
	}

}

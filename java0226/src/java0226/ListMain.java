package java0226;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		//������ ������ �� �ִ� ArrayList ����
		ArrayList<Integer> al = new ArrayList<Integer>();
		//������ 2�� �߰�
		al.add(10);
		al.add(30);
		//�۾��ϱ� ���� �ð��� ���
		long start = System.currentTimeMillis();
		//a1�� 2��° �ڸ��� �����͸� 10���� ����
		for(int i=0; i<100000; i=i+1) {
			al.add(1, 20);
			
		}
		for(int i=0; i<100000; i=i+1) {
			Integer integer = al.get(i);
		}
		
		//�۾� ������ �ð��� ���
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		//List�� ��� ������ ���
		//System.out.println(al);
		for(Integer i : al) {
			System.out.println(i);
		}
	}

}







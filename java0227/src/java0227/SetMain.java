package java0227;

import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		//������ ������ �� ����� Ŭ������ �������̽��� ������ ��쿡��
		//������ �Ʒ�ó�� ���� Ŭ������ �������̽� Ÿ������ ������ �� �ֽ��ϴ�.
		Set<String> set = new TreeSet<String>();
		set.add("���п�");
		set.add("������ ������");
		set.add("����ä���� �׳�");
		set.add("����������");
		set.add("������ο�");
		set.add("�ܸ���������");
		set.add("���п�");
		
		//��� �����͸� ����
		for(String weptoon : set) {
			System.out.printf("%s\n", weptoon);
		}


	}

}

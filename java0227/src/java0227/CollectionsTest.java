package java0227;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		//Colletions Ŭ������ static �޼ҵ带 �̿��ϸ�
		//List, Set, Map�� �۾��� ������ �� �ֽ��ϴ�.
		//reverse, shuffle, unmodifiableList ���� �޼ҵ尡 �ֽ��ϴ�.
		List<String> list = new ArrayList<String>();
		list.add("�ѿ���");
		list.add("Young B");
		list.add("Noel");
		list.add("jackey y");
		list.add("swings");
		
		Collections.reverse(list);
		System.out.println(list);
		
		//�����͸� �����ִ� �Լ� ȣ��
		Collections.shuffle(list);
		System.out.println(list);
		
		//�б� ���� �� ����Ʈ ����� - �����͸� �߰��Ϸ��� �ϸ� ���� �߻�
		List<String> readOnlyList = Collections.unmodifiableList(list);
		//readOnlyList.add("kid milly");
	}
}

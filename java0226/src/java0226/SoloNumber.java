package java0226;

import java.util.ArrayList;
import java.util.Comparator;

public class SoloNumber {

	public static void main(String[] args) {
		//2���� 100���� �Ҽ��� ã�Ƽ� ArrayList�� �����ϰ� ������������ ���
		//�Ҽ��� 2���� �ڽ��� ������ �Ǵ� ���ڱ��� ������ �������� ������ �Ҽ�
		
		//������ ������ �� �ִ� ArrayList�� ����
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		
		//2���� 100����
		for(int i=2; i<=100; i++) {
			//������ ���������� Ȯ���ϱ� ���� ����
			int flag = 0;
			
			//2���� �ڽ��� ���ݱ���
			for(int j=2; j<=i/2; j++) {
				//������ �������� �ݺ��� �ߴ�
				if(i % j == 0) {
					flag = 1;
					break;
				}
			}
			//������ ������ ���� ������ �Ҽ� �̹Ƿ� ����Ʈ�� �߰�
			if(flag == 0) {
				primeList.add(i);
			}
		}
		//�����͸� �����ϱ� ���ؼ� ���� ����� �˷��ִ� ��ü�� ����
		Comparator<Integer> comp = new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		};
		primeList.sort(comp);
		
		
		System.out.printf("%s\n", primeList);
	
	}
}

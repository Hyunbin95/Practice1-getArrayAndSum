package java0226;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		//������ ������ ����Ʈ�� ����
		Comparator<Integer> comp = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		};
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
	
		for(int i=0; i<6; i=i+1) {
			int flag = 0;
			System.out.printf("���� �Է� - %d ��°:", i+1);
			int su = sc.nextInt();
			//1���� 45������ �ƴ϶��
			if(su < 1 || su >45) {
				System.out.println("1-45 ������ ���ڸ� �Է��ϼ���.");
				i = i-1;
				continue;
			}
			//�ߺ� üũ�ؼ� ������ �Էµ� ���̸� �ٽ� �Է�
			//������ �Էµ� ��� �����Ϳ� ���ؼ� ������ �����Ͱ� ������ �ߺ�
			int j;
			//�ݺ����� j�� i �� �Ǹ� �ߴ�
			for(j=0; j<i; j++) {
				//�����Ͱ� �ߺ��Ǹ� �ݺ����� ����
				if(su == lotto.get(j)) {
					break;
				}
			}
			//�ݺ����� ������ ������� �ʾҴٸ� �����Ͱ� �ߺ�
			//�ߺ� Ȯ��
			if(i != j) {
				System.out.println("������ ������ �����ʹ� �Է��� �� �����ϴ�. �ٽ� �Է����ּ���.");
				i=i-1;
				continue;
			}
			
			lotto.add(su);
		}
		lotto.sort(comp);
		for(Integer temp : lotto) {
			System.out.printf("%d\t", temp);
		}
		sc.close();
	}

}

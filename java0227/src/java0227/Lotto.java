package java0227;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		//������ ������ Set�� ����
		Set<Integer> lotto = new TreeSet<Integer>();
		Scanner sc = new Scanner(System.in);
	
		while(lotto.size() !=6){
			System.out.printf("���� �Է� : ");
			int su = sc.nextInt();
			//1���� 45������ �ƴ϶��
			if(su < 1 || su >45) {
				//�ٽ� �Է�
				System.out.println("1-45 ������ ���ڸ� �Է��ϼ���.");
				continue;
			}
			//�ߺ� üũ
			if(lotto.add(su)==false) {
				System.out.println("�ߺ��� �������Դϴ� �ٽ� �Է��ϼ���.");
			}
			lotto.add(su);
		}
		//lotto.sort(comp);
		for(Integer temp : lotto) {
			System.out.printf("%d\t", temp);
		}
		sc.close();
		
	}
}

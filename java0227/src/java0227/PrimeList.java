package java0227;

import java.util.ArrayList;

public class PrimeList {

	public static void main(String[] args) {
		//2���� 100���� �Ҽ��� ã�Ƽ� ArrayList�� �����ϰ� ������������ ���
		//�Ҽ��� 2���� �ڽ��� ������ �Ǵ� ���ڱ��� ������ �������� ������ �Ҽ�
		ArrayList<Integer> al = new ArrayList<Integer>();

		for(int i=2; i<=100; i++) {
			int flag = 1;
			
			for(int j=2 ; j<=i/2; j++ ) {
				
				if(i%j == 0){
					flag = 0;
					break;
				}

				}
			if(flag == 1) {
				al.add(i);

			}
			
			}
		System.out.printf("%s\n",al);
		
		}

	}



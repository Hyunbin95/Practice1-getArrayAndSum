package java0218;

public class Exersize4 {
	
	public void exer(int n) {
		
	int a = 1;
	//int b = 15;
	for (int i = 0; i < n; i++) {
		if (a == 10) {
			a = 1;
		}
		for (int j = 0; j < n - i; j++) {
			System.out.print(" ");
		}
		System.out.print(a);
		a++;
		if (i == 0) {
			System.out.println();
			continue;
		}
		for (int k = 2; k < i * 2 + 1; k++) {// ���ǽİ� �Ǻ����� 1,3,5,7������ ���� �Ǵµ� 1�̻����Ǿ� 3,5,7 ������ ���ԵǾ� ����� �̻�����
			if (a == 10) {
				a = 1;
			}
			if (i == n - 1) {
				System.out.print(a); // a�� 10�� �Ѿ�ԵǸ� ���ڸ� �� �� �����ϱ� ������ �Ƕ�̵� ����� ������ ������ ��.
				a++;
				continue;
			}
			System.out.print(" ");
		}
		System.out.println(a);
		a++;
	}
	}
}

package java0212;

public class TestR {

	public static void R() {
		double d = 0.1;
		double sum = 0.0;
		//0.1�� 1000�� ���ϸ� 100.0 �� ���;� �ϴµ� �̻��� ����� ���
		//�Ҽ��� ��Ȯ�ϰ� ǥ���� �� ���� ��찡 ����� �����Դϴ�.
		// �Ǽ� ������ ���� �� �ؾ� �� ���� ������ ������ �� ������ �ϰ� �Ǽ��� ����
		for (int i=0; i<1000; i=i+1) {
			sum = sum + d;
		}
		System.out.println("�հ� : " + sum);
		
		boolean pan = 20 - 18 == 2;
		System.out.println(pan);
		
		int n = 2147483647;
		//int �� ������ �� �ִ� ���ں��� �� ū ���ڸ� �����Ϸ��� �ؼ�
		//Overflow �߻� �ؼ� ���� ���
		int result = n+1;
		System.out.println("��� : " + result);
		n = -2147483648;
		//underflow �߻�
		n = -2147483648;
		result = n -1;
		System.out.println("��� : " + result);
		
		long n2 = 1111111111111111111L;
		float n3 = 0.987654321f;
		double n4 = 0.987654321;
		System.out.println("��� : " + n3);
		System.out.println("��� : " + n4);
	}
}

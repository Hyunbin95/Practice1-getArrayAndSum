package java0219;

public class MethodClass {
	// return �� �������� void
	public void addNoReturn(int a, int b) {
		int result = a + b;
		System.out.println("�������: " + result);
		// return : �޼ҵ��� ������ �����ϰ� ȣ���� ������ �̵��ϴ� ��ɾ�
		return;
		// System.out.println("����ȵǴ� ����");;
	}

	public int addReturn(int a, int b) {
		return a + b;
	}

	// ��͸� �̿����� �ʰ� 1���� n ������ �հ�
	public int sumNoRecursion(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;

	}

	// ��͸� �̿��ؼ� 1���� n������ �հ踦 �����ִ� �޼ҵ�
	public int sumRecursion(int n) {
		if (n == 1) {
			return 1;
		}else {
			return n + sumRecursion(n - 1);
		}

	}

	// �Ǻ���ġ ���� - 1,1,2,3,5,8,13,21,34,55,89...
	// ó�� 2���� ���� 1
	// 3�� ° �׺��ʹ� ���� 2�� ���� ��
	// �˻��� ���� �̿�Ǵ� �����Դϴ�.

	public int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
}
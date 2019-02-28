package java0218;

public class MethodClass {
	// Hello World �� 3������ϴ� �޼ҵ�

	public void disp() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello World");
		}
	}

	// ���� �Ű������� 1�� ���� �޼ҵ�
	public void argDisp(int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println("Hello Argument Method");
		}
	}

	// ���� 1���� ���ڿ��� 1���� ������ ���ڿ��� ������ŭ ����ϴ� �޼ҵ�
	// ���� �޼ҵ�� �̸��� ������ �Ű������� ������ �ٸ��ϴ�.
	// �̷� ��츦 Method Overloading �̶�� �մϴ�.
	public void argDisp(String msg, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s\n", msg);
		}
	}

	// �Ű����� ������ ������� ������ ���Թ޾Ƽ� �հ踦 ����ϴ� �޼ҵ�
	public void varargsSum(int... ar) {
		int sum = 0;
		// ... �� ���� �Ű������� �迭�� ���
		// �迭�� �����͸� ��ȸ�ϸ鼭 sum�� �߰� : �հ豸�ϱ�
		for (int data : ar) {
			sum = sum + data;
		}
		System.out.printf("�հ�:%d\n", sum);

	}

	// �Ű������� �ڷ����� value ���� �Լ�
	public void inc(int n) {
		n = n + 1;
	}

	// �Ű������� �ڷ����� reference ���� �Լ�
	public void inc(int[] ar) {
		ar[0] = ar[0] + 1;
	}

}

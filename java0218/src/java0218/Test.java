package java0218;

public class Test {

	public static void main(String[] args) {
		// ��������
		// ù��° ���� n-1 ��° �����ͱ���
		// �ڽ��� �ڿ� �ִ� ��� �����Ϳ� ���ؼ� ����
		int ar[] = { 30, 50, 40, 10, 20 };
		int len = ar.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				// ���� �����Ͱ� Ŭ �� ���� �����Ϳ� ��ü
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int data : ar) {
			System.out.print(data + " ");
		}
	}
}

package java0221;

public class Main1 {
	public static void main(String[] args) {
		
		//int [] br = null;
		//System.out.printf("%d\n",br.length);
		//NullPointerException - ������ ������ Null�� ����Ǿ� �ִµ�
		//.�� �̿��ؼ� ����� ȣ���� �� �߻��ϴ� ����
		//������ ����� �ν��Ͻ� ������ �ִ��� Ȯ��
		
		
		int a = 10;
		System.out.println("a: " + a);
		int[] ar = { 100, 200, 300 };
		System.out.println("ar[0]: " + ar[0]);
		//System.out.println("ar[3]:" + ar[3]);
		//�����Ͱ� 3���� 0-2�������� �����ϴµ� ������ �Ѿ���ϴ�.
		//�̷� ��찡 ArrayIndexOutOfBoundsException�Դϴ�.
		//�ε����� �����ؼ� �ذ��ؾ� �մϴ�.
		
		String num1 = "176";
		String num2 = "2 3";
		int n1 = Integer.parseInt(num1);
		//int n2 = Integer.parseInt(num2);
		//num2 �� ����Ǿ��ִ� 2 3 �� ������ ���ڷ� ������� �ʴ� �������ε� ���ڷ� ������ �õ��Ͽ��� ������ �߻�
		//�̷� ��찡 NumberFormatException�Դϴ�.
		
		try {
		int r = 100 / 0;
		System.out.println("r: " + r);
		}catch(Exception e) {
			System.out.printf("���ܰ� �߻��߽��ϴ�.\n");
		}
		System.out.printf("���������� ����\n");
	}
}

package java0212;
public class HashCode {

	public static void main(String[] args) {
		//a�� b�� ����ϰ� �ִ� �������� ��ġ Ȯ�� - 2���� ���� �ٸ��Ƿ� �ٸ� �ڵ�
		int a = 10;
		int b = 11;
		//a �� ������ ���� ����Ű�Ƿ� a�� ���� ���� ���ɴϴ�.
		int c = 10;
		//���� ������ �ڷ����� �޶� �ٸ� ���� ���ɴϴ�.
		char d = 10;
		short e = 10;

		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		System.out.println(System.identityHashCode(e));
		
		System.out.printf("%b",a);
//		System.out.printf("%p \n",a);
		System.out.printf("~a: %d\n", ~a);
		a=-5;
		System.out.printf("a: %d\n", a);
		System.out.printf("~a: %d\n", ~a);
		System.out.printf("~a: %d\n", a);
	
		
		//���� ���߿� ++�� --�� ����ϸ� �ڵ��� ������(�б� ���� ����)�� �������ϴ�.
		//�̷� ������ ������ ������� �ʴ� ���� �����մϴ�.
		a = 0;
		int result = ++a + ++a; // ++a �� a�� 1 �Ǵٽ� ++a�� 1+1 2  -> 1+2=3�� ���
		System.out.printf("result:%d\n", result);
		a = 0;
		result = a++ + a++; // �տ� a �� 0 �ڿ� a �� 1�� �� �Ѥ� 
		System.out.printf("result:%d\n", result);
		
		int money = 45390;
		//10�� �ڸ����� �ݿø��ؼ� 45400�̶�� ���
	}

}

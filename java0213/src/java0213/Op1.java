package java0213;

public class Op1 {

	public static void main(String[] args) {
		// shift�� int �� �����͸� ��Ʈ ������ �̴� ������
		// ù��° ��Ʈ�� �����ϰ� �о���ϴ�.
		//32�� �̻��� ���� �ʰ� 32�̻��� ���� % 32�� ��ŭ�� �о���ϴ�.
		System.out.printf("8<<2: %d\n", 8<<2);
		System.out.printf("8<<34: %d\n", 8<<34);
		System.out.printf("8>>2: %d\n", 8>>2);
		
		//��Ʈ �� ����: &(and), |(or), ^(xor - Exclusive OR)
		//int �� �����͸� ������ bit ������ �����ؼ� ����� ������ �����ִ� ������
		
		//20: 00000000 00000000 00000000 000101000
		//17 : 00000000 00000000 00000000 000100001
		System.out.printf("20&17: %d\n",20&17); //and �Ѵ� 1�϶��� 1 �� �̿ܿ��� 0 ,������ �̿�
		System.out.printf("20|17: %d\n",20|17); //or �� �� 0�� ���� 0 �� �̿ܿ��� 1, ���翡 �̿�,���� ���ϱ�
		System.out.printf("20^17: %d\n",20^17); //xor ������ 0 �ٸ��� 1 �񱳿� �̿�
		

		Sample.swap();
		Sample.time();
		
		
	}

}

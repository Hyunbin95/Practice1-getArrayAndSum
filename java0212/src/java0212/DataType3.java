package java0212;

public class DataType3 {

	public static void main(String[] args) {
		//
		byte b1 = 10;
		byte b2 = 20;
		//int ���� ���� ũ���� �����ͳ��� ������ �ϸ� int�� �����ؼ� ������ ����
		//������ ����� byte���� ������ �� �����ϴ�.
		//byte result = b1 + b2;
		int result = b1 + b2;
		System.out.println(result);
		
		int x = 100;
		//ǥ������ ū �����ʹ� ���� ǥ�������� ������ ������ �ȵ˴ϴ�.
		//�̷� ��� ������ �����Ϸ��� �ϸ� int�� byte�� ������ ���Ѿ� �մϴ�.
		//������ �սǿ� �����ؾ� �մϴ�.
		//byte b = x ;
		
		//x�� byte�� �����ؼ� b�� ����
		byte b = (byte)x;
		System.out.println("b:" + b);
		x=256;
		b = (byte)x;
		System.out.println("b:" + b);
		//�Ǽ��� ������ ���� �� ��ȯ�ϸ� �Ҽ��� �������� �˴ϴ�.
		double d = 3.84;
		//�Ǽ��� ������ �����Ϸ��� ������ ���� �����ͷ� �����ؾ� �մϴ�.
		x = (int)d;
		System.out.println("x:" + x);
		
		int n1 = 15;
		int n2 = 2;
		//���� ǥ�� ���� ���� �����͸� ū ǥ�������� ���� �����ͷ� �����ϴ� ������
		//���ϴ� ����� ��� ���ؼ��Դϴ�.
		double r = (double)n1 / n2;
		System.out.println("r:" + r);
		
		double su = 5.6;
		//���� ���ڸ� �Ҽ� ù° �ڸ��� �ݿø��ؼ� ���
		//5.6�̸� 6 5.4�� 5�� ���
		int h = (int)(su+0.5); //�ݿø� �ϴ� ���
		System.out.println("h:" + h);
		
		su = 5.46;
		//���� ���ڸ� �Ҽ� ��° �ڸ����� �ݿø��ؼ� ���
		//5.46 �̸� 5.5, 5.44�̸� 5.4�� ���		
		su= su*10;
		h= (int)(su + 0.5);
		su = h / 10.0;
		System.out.println("h:" + h);
		
		int money = 45390;
		double m = money/100.0;
		System.out.printf("money : %g\n",m);
		money = (int)(m+0.5)*100;
		System.out.printf("money : %d\n",money);
	
		money = 45390;
		
		money = 45390 + 50;
		money = money/100;
		System.out.printf("money : %d",money);
	}
}
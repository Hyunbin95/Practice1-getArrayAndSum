package java0213;

public class NumBer {

	public static void main(String[] args) {
		
		short num1 = 110;
		byte num2 = 120;
		//��Ģ���� �� % ������ ������ �� �ּ� int
		//byte������ ���������� ���� ����� ���� int ����
		//����� byte�� �����ϰ��� �ϸ� ���� �� ��ȯ�� �ؾ� �մϴ�.
		//ǥ�� ������ ū �����͸� ���� ������ �����ͷ� �� ��ȯ�ϸ� �����Ͱ�
		//�߸� ���� �� �ֽ��ϴ�.
		short result = (byte)(num1 + num2);
		System.out.printf("result = %d\n",result); 

		//�������� �� �� �Ǽ��� ��� �����
		double a = (double)10/3;
		System.out.printf("d:%g\n",a);
		
		//���� �� ������ ������ ���鼭 10�� �ϱ�
		for(int i = 0; i<10; i=i+1) {
			try {
				//1�� ���
				Thread.sleep(1000);
				int r = i % 7;
				if(r ==0) {
					System.out.printf("��\n");
				}
				if(r ==1) {
					System.out.printf("ȭ\n");
				}
				if(r ==2) {
					System.out.printf("��\n");
				}
				if(r ==3) {
					System.out.printf("��\n");
						}
				if(r ==4) {
					System.out.printf("��\n");
				}
				if(r==5) {
					System.out.printf("��\n");
				}
				if(r==6) {
					System.out.printf("��\n");
				}
			}catch(Exception e) {}
		}
	}
}

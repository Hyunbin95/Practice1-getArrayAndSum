package java0213;

public class Time {
	
	public static void main(String[] args) {

	/*	
		int num1 = 1;
		int result  = num1 << 31; //32%32 : 0 33 % 32
		//result = result-1  ;
		System.out.printf("%d\n",result);
	*/
		
		int x = 10;
		boolean result = x>5 && ++x >5;
		System.out.printf("x:%d\n", x);//x : 11 
		result = x>20 && ++x > 5; 	//&&�� ���� ������ ����� false �̸� ���� ������ ���� �ʽ��ϴ�.
		System.out.printf("x:%d\n", x);//x : 11
		
		int year = 2400;
		//year�� 2000�̻� ���� Ȯ��
		result = 2000<=year;
		System.out.println(result);
		//year �� 4�� ������� Ȯ��
		result = year%4==0;
		System.out.println(result);
		//year�� 4�� ����̰� 100�� ����� �ƴ� ��� �Ǵ� 400�� ����� ��� Ȯ��
		result = year %4 ==0 && year %100 != 0;// || year %400==0;
		System.out.println(result);
		result = year %100 != 0 && year %4 ==0;// || year %400==0;
		System.out.println(result);
		//year�� 400�� ����̰ų� 4�� ����̰� 100�� ����� �ƴ� ���
//		result = year%400==0 || year%4 ==0 && year %100!=0;
//		System.out.println(result);
		
		//1-100������ �����Ͱ� �ֽ��ϴ�.
		//3�� ����̰� 4�� ������� Ȯ��
		//3�� ����� Ȯ���ϰ� 4�� ����� Ȯ���ϴ� ���� ������
		//�ƴϸ� 4�� ����� Ȯ���ϰ� 3�� ����� Ȯ���ϴ� ���� ������ �Ǵ��غ���

		//3�� ������� 4�ǹ���� �� ����. 3�� ����̸鼭 4�ǹ���̷��鼭 ���� ������ ����� ������ ã������
		//4�� ����� �ƴѰ��� ���� �־��� �� ��ǻ�ʹ� �� ���� ������ �� �� ���� �ʳ�?
		//4�� ����� �ƴѰ�� &&������ ���� ���� Ȯ������ �����ϱ� 
		//||�� ������ �ݴ�� �ϸ��  �ϳ��� true �� �ڿ����� Ȯ������ �����ϱ�
		for(int i=1; i<=100; i=i+1) {
			if(i%4==0 && i%3==0) {
				System.out.printf("%d\n",i);
			}
		}
			
	}
}


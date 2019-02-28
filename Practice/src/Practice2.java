import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
	//�⵵�� ���� �Է� �޾Ƽ� �Է��� ���� �޷� �����
		
	//�⵵�� �� �Է� �ޱ�
	Scanner sc = new Scanner(System.in);
	
	System.out.println("�⵵: ");
	int year = sc.nextInt();
	System.out.println("�� : ");
	int month = sc.nextInt();
	
	//�Է��� �⵵���� ������ ��¥ �� ���ϱ�
	int cnt = 0;
	for(int i=1; i<year; i++) {
		//�������� Ȯ��
		if(i%4==0 && i%100 !=0 || i%400==0) {
			//������ ���� 366�� ���ϱ�
			cnt = cnt+366;
		}
		else {
			//������ �ƴ� ���� 365�� ���ϱ�
			cnt = cnt+365;
		}
	}
	System.out.println(cnt%7);
	//�Է��� ������ ������ �� ���� �߰�
	//�� ���� ������ �迭�� �����صθ� �ݺ����� ����� �� �ֽ��ϴ�.
	//�迭�� ���� �� ó������ �����͸� �����ϸ� �ݺ��� ����ϴ°� ������
	//��찡 �ֽ��ϴ�.
	//ù��° �����ʹ� ������ �ι�° ���� �����͸� �����ϴ� ���� ��
	int [] nalsu = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	//�����̸� 2���� ������ 29�� �Ǿ�� �մϴ�.
	if(year%4==0 && year%100!=0 || year%400 ==0) {
		nalsu[2]=29;
	}
	
	//�Է��� ������ ������ �� �� ���ϱ�
	for(int i=0; i<month; i++) {
		cnt = cnt + nalsu[i];
	}

	//�迭�� ���� �߰�
	//���� 0���� �ʱ�ȭ
	int [] calendar = new int[42];
	int k = cnt % 7 +1;
	for(int i=0; i<nalsu[month]; i++) {
		calendar[k+i] = i+1;
	}
	
	//�޷� ���
	System.out.println("   ��   ��   ȭ   ��  ��   ��   ��");
	for(int i =0; i<calendar.length; i=i+1) {
		//0�� ���� ���� ���
		if(calendar[i] ==0) {
			System.out.print("   ");
		}
		//0�� �ƴ� ���� ���� ���
		else {
			System.out.printf("%3d",calendar[i]);
		}
		//7������ �� �ٲ�
		if(i%7 == 6) {
			System.out.println();
		}
	}
	
	
	sc.close();
	}

}

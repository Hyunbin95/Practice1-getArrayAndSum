import java.util.Scanner;

public class BreakAndContiune {

	public static void main(String[] args) {
		/*
		for(int i=1; i<=10; i=i+1) {
			//3�� ����� �����ϰ� ���
			if(i % 3==0) {
				continue;
			}
			System.out.printf("i:%d\n",i);	
		}
		 */
		//�ݺ��� �ȿ� �ݺ����� �ִ� ��ø �ݺ���
		//OUTER��� ���̺��� ���� �ݺ���
		/*
		OUTEA: for(int i=0; i<3; i=i+1) {
			System.out.printf("ù��° �ݺ���\n");
			for(int j=0; j<3; j=j+1) {
				System.out.printf("�ι�° �ݺ���\n");
				//break�� ���� ����� switch �� �ݺ����� ������ �ݴϴ�.
				//break �� continue �ڿ� ���̺��� ���̸� ���̺� �ش��ϴ�
				//����� ������ �ݴϴ�.
				break OUTEA; //OUTEA�� ���ΰ��ִ� �ݺ����� ������
			*/
		Scanner sc = new Scanner(System.in);
			int year;
			do {
			System.out.println("�⵵�� �Է��ϼ���.(1�Է½� ����)");
			year = sc.nextInt();
			if(year%4 == 0 && year %100 !=0 || year %400 ==0) {
				System.out.println(year + "���� �����Դϴ�.");
			}
			else if (year == 1){
				System.out.println("���α׷� ����");
			}else {
				System.out.println(year + "���� ������ �ƴմϴ�.");
			}
			}while(year != 1);
			
		sc.close();
		
			}
		}
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// �Ҽ� ���ϱ�
		// �Ҽ��� Ư¡ 1�� �ڱ� �ڽ����θ� ���������� ��
		// 2���� �ڽ��� ������ �Ǵ� ���ڱ��� ������ �������� ������ �˴ϴ�.

		Scanner sc = new Scanner(System.in);
		System.out.println("2�̻��� ������ �Է��ϼ��� :");
		/*
		 * int num1 = sc.nextInt(); int i=2; for( ; i<=num1 ; i=i+1 ) if(num1%i==0)
		 * break;
		 * 
		 * if(i==num1) System.out.println(num1 + "�� �Ҽ� �Դϴ�."); else
		 * System.out.println(num1 +"�� �Ҽ��� �ƴմϴ�.");
		 */

		// �Ҽ��� 2���� �ڽ��� ���ݱ����� ���ڷ� ������ �������� ������ �Ҽ�
		// ������ �������� �Ҽ��� �ƴ�
		int su = sc.nextInt();
		boolean flag = false;

		// �Ҽ����� Ȯ��
		for (int i = 2; i <= su / 2; i = i + 1) {
			if (su % i == 0) {
				flag = true;
				break;
			}
		}
		// Ȯ�� �� ����� ���
		if (flag == false) {
			System.out.printf("%d �� �Ҽ� �Դϴ�.\n", su);
		} else {
			System.out.printf("%d �� �Ҽ��� �ƴմϴ�.\n", su);
		}

		sc.close();

	}

}

package java0215;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// �迭�� �����ϰ� ���߿� �����͸� ����

		// �迭�� �����͸� ���� �Է¹޾ƺ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭�� ������ ���̵� �׷� ���� �Է��ϼ���");
		int x = sc.nextInt();

		String[] girlGroup = new String[x];
		int max = girlGroup.length;
		sc.nextLine();// ���ڿ��� �Է��Ҷ��� �տ� sc.next������ ����() ������ �Է����־�� �Ѵ�.
		for (int i = 0; i < max; i++) {
			System.out.println("�Է�>" + (i + 1));
			girlGroup[i] = sc.nextLine();
		}
		/*
		 * girlGroup[0] = "�ҳ�ô�"; girlGroup[1] = "���座��"; girlGroup[2] = "Ʈ���̽�";
		 * girlGroup[3] = "AOA"; girlGroup[4] = "����ũ";
		 */
		/*
		 * �迭�� ��� ��� System.out.printf("%s\n", girlGroup[0]); System.out.printf("%s\n",
		 * girlGroup[1]); System.out.printf("%s\n", girlGroup[2]);
		 * System.out.printf("%s\n", girlGroup[3]); System.out.printf("%s\n",
		 * girlGroup[4]);
		 * 
		 * //������ �����̳� ������ ������ ���� ������ �ݺ����� �̿��ؼ� �ۼ��ϸ� //�ڵ��� ���� ���� �ٰ� �ϳ��� �������� ó���� �� �ֱ� ������
		 * ���������� ���� //�迭�� ������ ������ ����� �����ϸ� �迭�� ������ ������ ����� �� ���� �����ؾ� �մϴ�.
		 */
		/*
		 * int i=0; while(i<5) { System.out.printf("%s\n", girlGroup[i]); i=i+1; }
		 */
		// �迭�� ������ ������ ����� ���� �������� �ʰ� .length�� �̿�
		// �ݺ��� �ȿ��� ������ �����͸� �����ϴ� ��쿡
		// �� �����Ͱ� head�� ������ �����Ͷ�� ����� ������ �Űܳ��� ����ϴ� ���� �����ϴ�.
		/*
		 * int i=0; while(i<max) { System.out.printf("%s\n", girlGroup[i]); i=i+1; }
		 */
		/*
		 * int i=0; int size = girlGroup.length; while(i<max) {
		 * System.out.printf("%s\n", girlGroup[i]); i=i+1;
		 */

		// ���� ���Ÿ� �̿��� �迭�� ������ ���
		for (String temp : girlGroup) {
			System.out.println(temp);
		}
		sc.close();
	}
}

package java0212;

import java.util.Scanner;

public class DataType1{
	
	public static void main(String[] args) {
		//���̿� Ű�� ������ �����ϴ� ������ ����� �����͸� ������ �� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� , Ű , ���� ������ �Է� : ");
		int age = sc.nextInt();
		double height = sc.nextDouble();
		String gender = sc.nextLine();
		
		new DataType2(age, height, gender);
		DataType2.age();
		DataType2.height();
		DataType2.gender();
		TestR.R();
		sc.close();
	}
}


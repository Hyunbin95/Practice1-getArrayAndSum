package java0212;

import java.util.Scanner;

public class DataType1{
	
	public static void main(String[] args) {
		//나이와 키와 성별을 저장하는 변수를 만들고 데이터를 저장한 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 , 키 , 성별 순으로 입력 : ");
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


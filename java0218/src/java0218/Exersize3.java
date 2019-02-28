package java0218;

import java.util.Scanner;

public class Exersize3 {

	public static void main(String[] args) {
		// 피보나치 수열
		// 1 1 2 3 5 8 13 21 34 55...
		// 11번째의 값을 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하면 입력한 값만큼의 피보나치 수열이 출력됩니다 :");
		int input = sc.nextInt();
		int num1 = 0;
		int num2 = 0;
		int result = 1;
		for (int i = 0; i < input; i++) {
			System.out.print(result + " ");
			num2 = num1;
			num1 = result;
			result = num1 + num2;
		}

		sc.close();
	}

}

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// 소수 구하기
		// 소수의 특징 1과 자기 자신으로만 나누어지는 수
		// 2부터 자신의 절반이 되는 숫자까지 나누어 떨어지지 않으면 됩니다.

		Scanner sc = new Scanner(System.in);
		System.out.println("2이상의 정수를 입력하세요 :");
		/*
		 * int num1 = sc.nextInt(); int i=2; for( ; i<=num1 ; i=i+1 ) if(num1%i==0)
		 * break;
		 * 
		 * if(i==num1) System.out.println(num1 + "은 소수 입니다."); else
		 * System.out.println(num1 +"은 소수가 아닙니다.");
		 */

		// 소수는 2부터 자신의 절반까지의 숫자로 나누어 떨어지지 않으면 소수
		// 나누어 떨어지면 소수가 아님
		int su = sc.nextInt();
		boolean flag = false;

		// 소수인지 확인
		for (int i = 2; i <= su / 2; i = i + 1) {
			if (su % i == 0) {
				flag = true;
				break;
			}
		}
		// 확인 된 결과를 출력
		if (flag == false) {
			System.out.printf("%d 는 소수 입니다.\n", su);
		} else {
			System.out.printf("%d 는 소수가 아닙니다.\n", su);
		}

		sc.close();

	}

}

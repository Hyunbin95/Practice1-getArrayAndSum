package java0219;

public class MethodClass {
	// return 이 없을때는 void
	public void addNoReturn(int a, int b) {
		int result = a + b;
		System.out.println("덧셈결과: " + result);
		// return : 메소드의 수행을 종료하고 호출한 곳으로 이동하는 명령어
		return;
		// System.out.println("실행안되는 문장");;
	}

	public int addReturn(int a, int b) {
		return a + b;
	}

	// 재귀를 이용하지 않고 1부터 n 까지의 합계
	public int sumNoRecursion(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;

	}

	// 재귀를 이용해서 1부터 n까지의 합계를 구해주는 메소드
	public int sumRecursion(int n) {
		if (n == 1) {
			return 1;
		}else {
			return n + sumRecursion(n - 1);
		}

	}

	// 피보나치 수열 - 1,1,2,3,5,8,13,21,34,55,89...
	// 처음 2개의 항은 1
	// 3번 째 항부터는 이전 2개 항의 합
	// 검색에 많이 이용되는 수열입니다.

	public int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
}
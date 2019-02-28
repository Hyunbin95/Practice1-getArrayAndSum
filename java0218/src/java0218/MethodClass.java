package java0218;

public class MethodClass {
	// Hello World 를 3번출력하는 메소드

	public void disp() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello World");
		}
	}

	// 정수 매개변수를 1개 갖는 메소드
	public void argDisp(int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println("Hello Argument Method");
		}
	}

	// 정수 1개와 문자열을 1개를 가지고 문자열을 정수만큼 출력하는 메소드
	// 위의 메소드와 이름은 같지만 매개변수의 개수가 다릅니다.
	// 이런 경우를 Method Overloading 이라고 합니다.
	public void argDisp(String msg, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s\n", msg);
		}
	}

	// 매개변수 개수에 상관없이 정수를 대입받아서 합계를 출력하는 메소드
	public void varargsSum(int... ar) {
		int sum = 0;
		// ... 이 붙은 매개변수는 배열로 취급
		// 배열의 데이터를 순회하면서 sum에 추가 : 합계구하기
		for (int data : ar) {
			sum = sum + data;
		}
		System.out.printf("합계:%d\n", sum);

	}

	// 매개변수의 자료형이 value 형인 함수
	public void inc(int n) {
		n = n + 1;
	}

	// 매개변수의 자료형이 reference 형인 함수
	public void inc(int[] ar) {
		ar[0] = ar[0] + 1;
	}

}

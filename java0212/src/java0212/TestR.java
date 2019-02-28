package java0212;

public class TestR {

	public static void R() {
		double d = 0.1;
		double sum = 0.0;
		//0.1을 1000번 더하면 100.0 이 나와야 하는데 이상한 결과가 출력
		//소수는 정확하게 표현할 수 없는 경우가 생기기 때문입니다.
		// 실수 연산을 여러 번 해야 할 때는 정수로 변경한 후 연산을 하고 실수로 변경
		for (int i=0; i<1000; i=i+1) {
			sum = sum + d;
		}
		System.out.println("합계 : " + sum);
		
		boolean pan = 20 - 18 == 2;
		System.out.println(pan);
		
		int n = 2147483647;
		//int 가 저장할 수 있는 숫자보다 더 큰 숫자를 저장하려고 해서
		//Overflow 발생 해서 음수 출력
		int result = n+1;
		System.out.println("결과 : " + result);
		n = -2147483648;
		//underflow 발생
		n = -2147483648;
		result = n -1;
		System.out.println("결과 : " + result);
		
		long n2 = 1111111111111111111L;
		float n3 = 0.987654321f;
		double n4 = 0.987654321;
		System.out.println("결과 : " + n3);
		System.out.println("결과 : " + n4);
	}
}

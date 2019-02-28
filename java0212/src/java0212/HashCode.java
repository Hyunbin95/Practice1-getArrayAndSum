package java0212;
public class HashCode {

	public static void main(String[] args) {
		//a와 b가 사용하고 있는 데이터의 위치 확인 - 2개의 값이 다르므로 다른 코드
		int a = 10;
		int b = 11;
		//a 와 동일한 값을 가리키므로 a와 같은 값이 나옵니다.
		int c = 10;
		//값은 같지만 자료형이 달라서 다른 값이 나옵니다.
		char d = 10;
		short e = 10;

		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		System.out.println(System.identityHashCode(e));
		
		System.out.printf("%b",a);
//		System.out.printf("%p \n",a);
		System.out.printf("~a: %d\n", ~a);
		a=-5;
		System.out.printf("a: %d\n", a);
		System.out.printf("~a: %d\n", ~a);
		System.out.printf("~a: %d\n", a);
	
		
		//연산 도중에 ++나 --를 사용하면 코드의 가독성(읽기 쉬운 정도)가 떨어집니다.
		//이런 형태의 구문은 사용하지 않는 것을 권장합니다.
		a = 0;
		int result = ++a + ++a; // ++a 로 a는 1 또다시 ++a로 1+1 2  -> 1+2=3이 출력
		System.out.printf("result:%d\n", result);
		a = 0;
		result = a++ + a++; // 앞에 a 는 0 뒤에 a 는 1이 됨 ㅡㅡ 
		System.out.printf("result:%d\n", result);
		
		int money = 45390;
		//10의 자리에서 반올림해서 45400이라고 출력
	}

}

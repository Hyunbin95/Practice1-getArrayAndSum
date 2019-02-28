package java0213;

public class Op1 {

	public static void main(String[] args) {
		// shift는 int 형 데이터를 비트 단위로 미는 연산자
		// 첫번째 비트는 제외하고 밀어냅니다.
		//32번 이상은 하지 않고 32이상인 경우는 % 32한 만큼만 밀어냅니다.
		System.out.printf("8<<2: %d\n", 8<<2);
		System.out.printf("8<<34: %d\n", 8<<34);
		System.out.printf("8>>2: %d\n", 8>>2);
		
		//비트 논리 연산: &(and), |(or), ^(xor - Exclusive OR)
		//int 형 데이터를 가지고 bit 단위로 연산해서 결과를 정수로 돌려주는 연산자
		
		//20: 00000000 00000000 00000000 000101000
		//17 : 00000000 00000000 00000000 000100001
		System.out.printf("20&17: %d\n",20&17); //and 둘다 1일때만 1 그 이외에는 0 ,삭제에 이용
		System.out.printf("20|17: %d\n",20|17); //or 둘 다 0일 때만 0 그 이외에는 1, 복사에 이용,색상 더하기
		System.out.printf("20^17: %d\n",20^17); //xor 같으면 0 다르면 1 비교에 이용
		

		Sample.swap();
		Sample.time();
		
		
	}

}

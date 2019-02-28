package java0213;

public class NumBer {

	public static void main(String[] args) {
		
		short num1 = 110;
		byte num2 = 120;
		//사칙연산 과 % 연산을 수행할 때 최소 int
		//byte끼리의 연산이지만 실제 수행될 때는 int 연산
		//결과를 byte에 대입하고자 하면 강제 형 변환을 해야 합니다.
		//표현 범위가 큰 데이터를 작은 범위의 데이터로 형 변환하면 데이터가
		//잘못 나올 수 있습니다.
		short result = (byte)(num1 + num2);
		System.out.printf("result = %d\n",result); 

		//나눗셈을 할 때 실수로 결과 만들기
		double a = (double)10/3;
		System.out.printf("d:%g\n",a);
		
		//켜짐 과 꺼짐을 번갈아 가면서 10번 하기
		for(int i = 0; i<10; i=i+1) {
			try {
				//1초 대기
				Thread.sleep(1000);
				int r = i % 7;
				if(r ==0) {
					System.out.printf("월\n");
				}
				if(r ==1) {
					System.out.printf("화\n");
				}
				if(r ==2) {
					System.out.printf("수\n");
				}
				if(r ==3) {
					System.out.printf("목\n");
						}
				if(r ==4) {
					System.out.printf("금\n");
				}
				if(r==5) {
					System.out.printf("토\n");
				}
				if(r==6) {
					System.out.printf("일\n");
				}
			}catch(Exception e) {}
		}
	}
}

package java0213;

public class Time {
	
	public static void main(String[] args) {

	/*	
		int num1 = 1;
		int result  = num1 << 31; //32%32 : 0 33 % 32
		//result = result-1  ;
		System.out.printf("%d\n",result);
	*/
		
		int x = 10;
		boolean result = x>5 && ++x >5;
		System.out.printf("x:%d\n", x);//x : 11 
		result = x>20 && ++x > 5; 	//&&는 앞쪽 연산의 결과라 false 이면 뒤의 연산을 하지 않습니다.
		System.out.printf("x:%d\n", x);//x : 11
		
		int year = 2400;
		//year가 2000이상 인지 확인
		result = 2000<=year;
		System.out.println(result);
		//year 가 4의 배수인지 확인
		result = year%4==0;
		System.out.println(result);
		//year가 4의 배수이고 100의 배수가 아닌 경우 또는 400의 배수인 경우 확인
		result = year %4 ==0 && year %100 != 0;// || year %400==0;
		System.out.println(result);
		result = year %100 != 0 && year %4 ==0;// || year %400==0;
		System.out.println(result);
		//year가 400의 배수이거나 4의 배수이고 100의 배수가 아닌 경우
//		result = year%400==0 || year%4 ==0 && year %100!=0;
//		System.out.println(result);
		
		//1-100까지의 데이터가 있습니다.
		//3의 배수이고 4의 배수인지 확인
		//3의 배수를 확인하고 4의 배수를 확인하는 것이 좋은지
		//아니면 4의 배수를 확인하고 3의 배수를 확인하는 것이 좋은지 판단해보자

		//3의 배수보다 4의배수가 더 적다. 3의 배수이면서 4의배수이려면서 적은 연산의 결과로 정답을 찾으려면
		//4의 배수가 아닌것을 먼저 넣었을 때 컴퓨터는 더 적은 연산을 할 수 있지 않나?
		//4의 배수가 아닌경우 &&연산은 뒤의 것을 확인하지 않으니까 
		//||의 연산은 반대로 하면됨  하나라도 true 면 뒤에것을 확인하지 않으니깐
		for(int i=1; i<=100; i=i+1) {
			if(i%4==0 && i%3==0) {
				System.out.printf("%d\n",i);
			}
		}
			
	}
}


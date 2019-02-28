import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
	//년도와 월을 입력 받아서 입력한 월의 달력 만들기
		
	//년도와 월 입력 받기
	Scanner sc = new Scanner(System.in);
	
	System.out.println("년도: ");
	int year = sc.nextInt();
	System.out.println("월 : ");
	int month = sc.nextInt();
	
	//입력한 년도까지 지나온 날짜 수 더하기
	int cnt = 0;
	for(int i=1; i<year; i++) {
		//윤년인지 확인
		if(i%4==0 && i%100 !=0 || i%400==0) {
			//윤년일 때는 366을 더하기
			cnt = cnt+366;
		}
		else {
			//윤년이 아닐 때는 365를 더하기
			cnt = cnt+365;
		}
	}
	System.out.println(cnt%7);
	//입력한 월까지 지나온 날 수를 추가
	//각 월의 날수를 배열에 저장해두면 반복문을 사용할 수 있습니다.
	//배열을 만들 때 처음부터 데이터를 저장하면 반복문 사용하는게 불편한
	//경우가 있습니다.
	//첫번째 데이터는 버리고 두번째 부터 데이터를 저장하는 것이 편리
	int [] nalsu = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	//윤년이면 2월의 날수가 29가 되어야 합니다.
	if(year%4==0 && year%100!=0 || year%400 ==0) {
		nalsu[2]=29;
	}
	
	//입력한 월까지 지나온 날 수 더하기
	for(int i=0; i<month; i++) {
		cnt = cnt + nalsu[i];
	}

	//배열에 일을 추가
	//전부 0으로 초기화
	int [] calendar = new int[42];
	int k = cnt % 7 +1;
	for(int i=0; i<nalsu[month]; i++) {
		calendar[k+i] = i+1;
	}
	
	//달력 출력
	System.out.println("   일   월   화   수  목   금   토");
	for(int i =0; i<calendar.length; i=i+1) {
		//0일 때는 공백 출력
		if(calendar[i] ==0) {
			System.out.print("   ");
		}
		//0이 아닐 때는 값을 출력
		else {
			System.out.printf("%3d",calendar[i]);
		}
		//7번마다 줄 바꿈
		if(i%7 == 6) {
			System.out.println();
		}
	}
	
	
	sc.close();
	}

}

import java.util.Scanner;

public class BreakAndContiune {

	public static void main(String[] args) {
		/*
		for(int i=1; i<=10; i=i+1) {
			//3의 배수는 제외하고 출력
			if(i % 3==0) {
				continue;
			}
			System.out.printf("i:%d\n",i);	
		}
		 */
		//반복문 안에 반복문이 있는 중첩 반복문
		//OUTER라는 레이블을 가진 반복문
		/*
		OUTEA: for(int i=0; i<3; i=i+1) {
			System.out.printf("첫번째 반복문\n");
			for(int j=0; j<3; j=j+1) {
				System.out.printf("두번째 반복문\n");
				//break는 가장 가까운 switch 나 반복문에 영향을 줍니다.
				//break 나 continue 뒤에 레이블을 붙이면 레이블에 해당하는
				//제어문에 영향을 줍니다.
				break OUTEA; //OUTEA가 감싸고있는 반복문을 나간다
			*/
		Scanner sc = new Scanner(System.in);
			int year;
			do {
			System.out.println("년도를 입력하세요.(1입력시 종료)");
			year = sc.nextInt();
			if(year%4 == 0 && year %100 !=0 || year %400 ==0) {
				System.out.println(year + "년은 윤년입니다.");
			}
			else if (year == 1){
				System.out.println("프로그램 종료");
			}else {
				System.out.println(year + "년은 윤년이 아닙니다.");
			}
			}while(year != 1);
			
		sc.close();
		
			}
		}
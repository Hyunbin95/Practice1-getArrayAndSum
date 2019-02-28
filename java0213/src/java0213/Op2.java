package java0213;

import java.util.Scanner;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 5;
		//n1 과 n2 중 큰 수 찾기
		int result = n1 > n2? n1 : n2;
		System.out.printf("result = %d\n", result);
	
		//성별은 F 또는 M으로 저장
		char gender = 'm';
		//gender 가 M이면 남자라고 출력 F 이면 여자라고 출력
		//삼항 연산자 이용해서 해결
		//소문자 m도 남자라고 나오도록 변경
		String result1 = gender=='M' || gender =='m' ? "남자" : "여자";
		System.out.printf("성별 : %s\n", result1);
		
		//정수 변수에 0~100까지의 숫자를 저장하고
		//60이상이면 합격 그렇지 않으면 불합격이라고 출력
		
		System.out.printf("정보처리 산업기사 필기시험 점수를 입력하세요 : \n");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		System.out.printf("결과 : %s\n",point>=60 ? "합격입니다 ^^" : "불합격입니다ㅠㅠ");
		
		//point가 80이상이면 우수 60이상이면 보통 그 이하는 저조라고 출력
		
		System.out.println("중간평가 점수를 입력하세요 : \n");
		int mPoint = sc.nextInt();
		System.out.println("결과 : " + (mPoint >=80 ? "성적 우수자" : mPoint >= 60 ?  "평균입니다" : "바보입니다") ); // ( )를 안하면 오류 발생
		String x = mPoint >= 80 ? "성적우수자" : mPoint >=60 ? "보통" : "바보"; // ( ) 를 하지않아도 오류발생 x 
		 
		 }

}

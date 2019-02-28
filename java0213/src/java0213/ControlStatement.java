package java0213;

import java.util.Scanner;

public class ControlStatement{
	
	public static void main(String[] args) {
		//하나의 정수(int)를 입력받아서 저장하는 구문을 작성
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 :");
		int inPut = sc.nextInt();
		//inPut이 60점 이상이면 합격이라고 출력 - if를 이용해서 작성
		while(inPut<0 || 100<inPut) {
			System.out.println("올바른 입력이 아닙니다. 점수를 입력하세요 : ");
			inPut = sc.nextInt();			
		}
/*
		if(60<=inPut) {
			System.out.println("축하합니다 ! 합격입니다 ^^");
		}else {
			System.out.println("불합격");
		}
		*/
		//90-100 이면 수, 80-90미만이면 우 70-80미만이면 미 60-70미만이면 양 0-60미만이면 가
		switch(inPut/10) {
		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
			break;
		}
		
		sc.close();
	}
}
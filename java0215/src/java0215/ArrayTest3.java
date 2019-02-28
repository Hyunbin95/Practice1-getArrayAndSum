package java0215;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		//모든 행의 크기가 동일한 2차원 배열
		//사람 이름 20개 5개 그룹을 저장할 수 있는 배열을 생성
		//자료형 [][] 배열이름 = new 자료형[행개수][열개수];
		String [][] names = new String[5][20];
		 
		 // 1반 30명 29
		// 2반 30명 38 //38명인 반도 저장하려면?
		// 3반 30명 35 
		//4반 30명 28
		//String [][] student = new String [4][30] // [4][38] 로 통일 해줘도된다.
		
		//하지만 메모리 낭비가 생기게 되고 최대한 메모리를 줄이기 위해서 할 수 있는 방법이 있다.
		
		//행별로 열의 크기가 다른 2차원 배열
		//학생들의 점수(정수)를 첫번째 그룹은 28개 두번째 그룹은 33개
		//3번째 그룹은 31개를 저장할 수 있도록 배열을 생성하기
		
		int [][] scores = new int[3][];
		scores[0] = new int[28];//이런 식으로 개별적으로 설정을 할 수 있다.
		scores[1] = new int[33];
		scores[2] = new int[31];
		/*
		System.out.printf("%d\n", scores.length);
		System.out.printf("%d\n", scores[0].length);
		//System.out.printf("%d\n", scores[0][0].length);
		
		System.out.printf("%d\n", scores);
		System.out.printf("%d\n", scores[0]);
		System.out.printf("%d\n", scores[0][0]);
		*/
		//초기 데이터를 가지고 2차원 배열 생성
		String [][] actorName = { {"하정우", "송강호", "이병헌", "최민식"}, {"김혜수", "이영애", "김고은", "김수미"}, {"류준열", "주지훈", "마동석", "유아인"}};
		int max= actorName.length;
		int max2= actorName[0].length;
		//위의 데이터 전체를 출력
		/*
		for(int i=0; i<max; i=i+1) {
			for(int j=0; j<max2; j=j+1) {
				System.out.printf("%10s", actorName[i][j]);
			}
			System.out.println();
		}
		*/
		//빠른 열거를 이용해서 출력
		/*
		for(String []temp : actorName) {
			for(String imsi : temp) {
				System.out.printf("%10s",imsi);
			}
			System.out.println();
		}
		*/
		
		
	}
}

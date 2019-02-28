package java0226;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VO 메소드안에 매개변수가 아이디, 비밀번호, 이름, 나이,번호순으로 대입 가능
		
		VO [] data = new VO[3];
		
		VO vo = new VO("lee","1212","이현빈",29,1);
		data[0] = vo;
		
		vo = new VO("kim","1313","이몽룡",27,2);
		data[1] = vo;
		
		vo = new VO("park","1414","천송이",28,3);
		data[2] = vo;
		
		//배열의 데이터 확인
		for(VO temp : data) {
		System.out.println(temp);		
		}
		
		//배열의 데이터 정렬 - data 의 구성요소 자료형인 VO 클래스가
		//Comparable 인터페이스를 implements 하지 않았으면 예외 발생
		Arrays.sort(data);
		System.out.printf("=========정렬 후=========\n");
		for(VO temp : data) {
			System.out.println(temp);
		}
		System.out.println("========================");
		
		//VO 타입을 비교할 수 있는 Comparator 인터페이스의
		//Anonymous Class -> Instance
		Comparator <VO> numAscComp = new Comparator <VO>(){

			//크기 비교할 때 사용하는 메소드 오름차순
			@Override
			public int compare(VO o1, VO o2) { 
				return o1.getNum() - o2.getNum();
			}
			
		};
		
		Comparator <VO> numDescComp = new Comparator <VO>(){

			//크기 비교할 때 사용하는 메소드 내림차순
			@Override
			public int compare(VO o1, VO o2) { 
				return o2.getNum() - o1.getNum();
			}
			
		};
		
		//name의 오름차순 정렬을 할 수 있는 comparator
		Comparator <VO> nameAscComp = new Comparator<VO>() {

			@Override
			public int compare(VO o1, VO o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		};
		
		//name의 내림차순 정렬을 할 수 있는 comparator
		Comparator <VO> nameDescComp = new Comparator<VO>() {

			@Override
			public int compare(VO o1, VO o2) {
				return o2.getName().compareTo(o1.getName());
			}
			
		};
		//1번부터 4번까지 입력을 받기 위한 코드를 작성
		Scanner sc = new Scanner(System.in);
		System.out.println("정렬할 조건을 선택(1-4) : ");
		int input = sc.nextInt();
		final int 번호오름차순 = 1;
		final int 번호내림차순 = 2;
		final int 이름오름차순 = 3;
		final int 이름내림차순  = 4;

		Comparator <VO> comparator = null;
		switch(input) {
		case 번호오름차순:
			System.out.println("번호 오름차순으로 출력");
			comparator = numAscComp;
			break;
		case 번호내림차순:
			System.out.println("번호 내림차순으로 출력");
			comparator = numDescComp;
			break;
		case 이름오름차순:
			System.out.println("이름 오름차순으로 출력");
			comparator = nameAscComp;
			break;
		case 이름내림차순:
			System.out.println("이름 내림차순으로 출력");
			comparator = nameDescComp;
			default:
				System.out.println("1에서4까지의 정수를 입력하세요.");
		}
		
		Arrays.sort(data, comparator);
		for(VO temp : data) {
			System.out.println(temp);
		}
		
		sc.close();
	}
}

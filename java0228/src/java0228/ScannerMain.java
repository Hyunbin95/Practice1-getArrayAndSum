package java0228;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		//키보드로부터 입력받는 스캐너 만들기
		Scanner sc = new Scanner(System.in);
		//문자열 입력받기
		System.out.println("문자열 입력 : ");
		String line = sc.nextLine();
		System.out.printf("입력한 문자열 : %s\n",line);
		
		
		//정수 1개를 입력받기
		System.out.printf("정수 입력:");
		int n = sc.nextInt();
		System.out.println("입력값 : "+n);
		

		//문자열 입력받기
		System.out.println("문자열 입력 : ");
		//이전 입력에서 넘어온 Enter를 없애기 위해서 호출
		sc.nextLine();
		line = sc.nextLine();
		System.out.printf("입력한 문자열 : %s\n",line);

				
		int su = 0;
		for(int i=0; i<line.length(); i++) {
			char ch = line.charAt(i);
			if('0'<=ch && ch<='9') {
				su = su * 10 + (ch-48); //48은 0
			}else {
				continue;
			}
		}
		System.out.printf("변환된 숫자:%d\n", su);
		
		sc.close();
	}
}

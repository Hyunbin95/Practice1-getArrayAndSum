package java0225;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요.");
		String password = sc.nextLine();
		
		int leng = password.length();
		int cnt1=0,cnt2=0,cnt3=0,cnt4=0;
		
		for(int i=0; i<leng; i++) {
			char ch = password.charAt(i);
			if('a'<=ch && ch<='z') {
				cnt1++;//소문자 개수
			}else if('A'<=ch && ch<='Z') {
				cnt2++;//대문자 개수
			}else if('0'<=ch && ch<='9') {
				cnt3++;//숫자 개수
			}else {
				cnt4++;//특수 문자 개수
			}
			
		}
		if(0<cnt1 && 0<cnt2 && 0<cnt3 && 0<cnt4) {
			System.out.println("사용가능한 비밀번호 입니다.");
		}else {
			System.out.println("사용할 수 없는 비밀번호 입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}

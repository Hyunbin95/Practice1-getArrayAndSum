package java0225;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���.");
		String password = sc.nextLine();
		
		int leng = password.length();
		int cnt1=0,cnt2=0,cnt3=0,cnt4=0;
		
		for(int i=0; i<leng; i++) {
			char ch = password.charAt(i);
			if('a'<=ch && ch<='z') {
				cnt1++;//�ҹ��� ����
			}else if('A'<=ch && ch<='Z') {
				cnt2++;//�빮�� ����
			}else if('0'<=ch && ch<='9') {
				cnt3++;//���� ����
			}else {
				cnt4++;//Ư�� ���� ����
			}
			
		}
		if(0<cnt1 && 0<cnt2 && 0<cnt3 && 0<cnt4) {
			System.out.println("��밡���� ��й�ȣ �Դϴ�.");
		}else {
			System.out.println("����� �� ���� ��й�ȣ �Դϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}

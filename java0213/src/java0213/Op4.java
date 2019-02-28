package java0213;

import java.util.Scanner;

public class Op4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.printf("거스름 돈을 입력하세요:\n");
		
		int money = sc.nextInt();
		int man = money/10000;
		int five = (money%10000)/5000;
		int thousand = (money%5000)/1000;
		System.out.printf("만원 짜리 %d 장 \n오천원 짜리 %d 장\n천원 짜리 %d 장\n" , man,five,thousand);
		
	}
}

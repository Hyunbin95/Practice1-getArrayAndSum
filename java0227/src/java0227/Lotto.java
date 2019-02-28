package java0227;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		//정수를 저장할 Set을 생성
		Set<Integer> lotto = new TreeSet<Integer>();
		Scanner sc = new Scanner(System.in);
	
		while(lotto.size() !=6){
			System.out.printf("정수 입력 : ");
			int su = sc.nextInt();
			//1부터 45까지가 아니라면
			if(su < 1 || su >45) {
				//다시 입력
				System.out.println("1-45 사이의 숫자만 입력하세요.");
				continue;
			}
			//중복 체크
			if(lotto.add(su)==false) {
				System.out.println("중복된 데이터입니다 다시 입력하세요.");
			}
			lotto.add(su);
		}
		//lotto.sort(comp);
		for(Integer temp : lotto) {
			System.out.printf("%d\t", temp);
		}
		sc.close();
		
	}
}

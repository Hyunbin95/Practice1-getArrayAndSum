package java0226;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		//정수를 저장할 리스트를 생성
		Comparator<Integer> comp = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		};
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
	
		for(int i=0; i<6; i=i+1) {
			int flag = 0;
			System.out.printf("정수 입력 - %d 번째:", i+1);
			int su = sc.nextInt();
			//1부터 45까지가 아니라면
			if(su < 1 || su >45) {
				System.out.println("1-45 사이의 숫자만 입력하세요.");
				i = i-1;
				continue;
			}
			//중복 체크해서 이전에 입력된 값이면 다시 입력
			//이전에 입력된 모든 데이터와 비교해서 동일한 데이터가 있으면 중복
			int j;
			//반복문은 j가 i 가 되면 중단
			for(j=0; j<i; j++) {
				//데이터가 중복되면 반복문을 종료
				if(su == lotto.get(j)) {
					break;
				}
			}
			//반복문이 끝까지 수행되지 않았다면 데이터가 중복
			//중복 확인
			if(i != j) {
				System.out.println("이전과 동일한 데이터는 입력할 수 없습니다. 다시 입력해주세요.");
				i=i-1;
				continue;
			}
			
			lotto.add(su);
		}
		lotto.sort(comp);
		for(Integer temp : lotto) {
			System.out.printf("%d\t", temp);
		}
		sc.close();
	}

}

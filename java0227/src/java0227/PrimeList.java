package java0227;

import java.util.ArrayList;

public class PrimeList {

	public static void main(String[] args) {
		//2부터 100까지 소수를 찾아서 ArrayList에 저장하고 내림차순으로 출력
		//소수는 2부터 자신의 절반이 되는 숫자까지 나누어 떨어지지 않으면 소수
		ArrayList<Integer> al = new ArrayList<Integer>();

		for(int i=2; i<=100; i++) {
			int flag = 1;
			
			for(int j=2 ; j<=i/2; j++ ) {
				
				if(i%j == 0){
					flag = 0;
					break;
				}

				}
			if(flag == 1) {
				al.add(i);

			}
			
			}
		System.out.printf("%s\n",al);
		
		}

	}



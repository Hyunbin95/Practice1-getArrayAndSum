package java0227;

import java.util.Random;
import java.util.StringTokenizer;

public class RandomMain {

	public static void main(String[] args) {
		/*
		//인스턴스를 생성할 때 seed 번호를 대입하면 일정한 패턴으로 숫자가 생성
		//seed 번호를 대입하지 않으면 정말 랜덤
		Random r = new Random();
		//nextInt는 정수 범위 내에서 랜덤한 숫자를 리턴
		//System.out.println(r.nextInt());

		int [] ar = {1,2,3,4,5,6};
		
		//nextInt(정수)는 정수로 나눈 나머지에서 랜덤하게 숫자를 리턴
		int len = ar.length;
		int su = r.nextInt(len);
		System.out.println(ar[su]);
		
		//빨강, 파랑, 노랑, 초록 네가지 중의 하나가 랜덤하게 나오도록 작성
		String [] colors = {"빨강", "파랑", "노랑", "초록"};
		while(true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(colors[r.nextInt(colors.length)]);
		}
		*/
		
		StringTokenizer st = new StringTokenizer(
				"복무 신조! 우리의 결의!");
		//hasMoreTokens 가 false 를 리턴할 때 까지 반복
		//데이터베이스에서 데이터를 가져와서 읽는 방법과 동일하기 때문에 중요
		while(st.hasMoreTokens()) {
			String e = st.nextToken();
			System.out.println(e);
		
		
	
		}
	}

}

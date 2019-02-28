package objecttest;

import java.io.IOException;

public class LangMain {

	public static void main(String[] args) {
		//100번째 피보나치 수열의 값을 찾아오는데 걸리는 시간을 측정 
		
		int n1 = 1;
		int n2 = 1;
		int result = 1;
		long start = System.currentTimeMillis(); // 시간초 재주는 함수 System.currentTimeMillis();
		for(int i=3; i<=9000000; i++) {
			result = n1 + n2;
			n1 = n2;
			n2 = result;
		}
		long end = System.currentTimeMillis();
		System.out.println("걸린시간 : "+(end-start));
		System.out.println(result);
		
		
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("calc");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
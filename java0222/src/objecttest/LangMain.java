package objecttest;

import java.io.IOException;

public class LangMain {

	public static void main(String[] args) {
		//100��° �Ǻ���ġ ������ ���� ã�ƿ��µ� �ɸ��� �ð��� ���� 
		
		int n1 = 1;
		int n2 = 1;
		int result = 1;
		long start = System.currentTimeMillis(); // �ð��� ���ִ� �Լ� System.currentTimeMillis();
		for(int i=3; i<=9000000; i++) {
			result = n1 + n2;
			n1 = n2;
			n2 = result;
		}
		long end = System.currentTimeMillis();
		System.out.println("�ɸ��ð� : "+(end-start));
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
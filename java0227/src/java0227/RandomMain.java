package java0227;

import java.util.Random;
import java.util.StringTokenizer;

public class RandomMain {

	public static void main(String[] args) {
		/*
		//�ν��Ͻ��� ������ �� seed ��ȣ�� �����ϸ� ������ �������� ���ڰ� ����
		//seed ��ȣ�� �������� ������ ���� ����
		Random r = new Random();
		//nextInt�� ���� ���� ������ ������ ���ڸ� ����
		//System.out.println(r.nextInt());

		int [] ar = {1,2,3,4,5,6};
		
		//nextInt(����)�� ������ ���� ���������� �����ϰ� ���ڸ� ����
		int len = ar.length;
		int su = r.nextInt(len);
		System.out.println(ar[su]);
		
		//����, �Ķ�, ���, �ʷ� �װ��� ���� �ϳ��� �����ϰ� �������� �ۼ�
		String [] colors = {"����", "�Ķ�", "���", "�ʷ�"};
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
				"���� ����! �츮�� ����!");
		//hasMoreTokens �� false �� ������ �� ���� �ݺ�
		//�����ͺ��̽����� �����͸� �����ͼ� �д� ����� �����ϱ� ������ �߿�
		while(st.hasMoreTokens()) {
			String e = st.nextToken();
			System.out.println(e);
		
		
	
		}
	}

}

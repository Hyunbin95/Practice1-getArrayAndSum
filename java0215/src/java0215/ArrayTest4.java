package java0215;

public class ArrayTest4 {

	public static void main(String[] args) {

		//int[] ar = { 10, 50, 88, 64, 87, 96, 98, 15, 54 };
		/*
		
		// 60�� �̻��� �������� �հ�, ����, ���(�Ҽ� 2�ڸ� ���� ���)
		int sum = 0; // �հ�
		int cnt = 0; // ����
		for (int x : ar) {
			if (x >= 60) {
				sum = sum + x;
				cnt++;
			}
		}
		System.out.printf("�հ� : %d \n���� :%d\n", sum, cnt);
		if(cnt > 0){
			double avg = (double) sum / cnt;
			System.out.printf("���:%.2f\n", avg);
			}else{
			System.out.printf("���ǿ� �´� �����Ͱ� �����ϴ�.\n");
			}
		*/
	
		
		//�迭�� �ִ밪�� ���ϴ¹��
		/*
		int firstData=ar[0];
		for(int temp : ar) {
			if(firstData<=temp) {
				firstData=temp;
			}
		}
		System.out.println("�ִ밪 : "+firstData);
		//�迭�� �ּҰ� ���ϴ� ���
		for(int temp : ar) {
			if(firstData>=temp) {
				firstData=temp;
			}
		}
		System.out.println("�ּҰ� : "+firstData);
		*/
		//2�� �迭 ��ġ�� - merge
		int [] ar1 = {40, 70, 30, 65, 93, 48, 88};
		int [] ar2 = {51, 73};
		//2���� �����͸� ������ �迭�� ����
		int [] merge = new int [ar1.length + ar2.length];
		//ù��° �迭�� ������ �ű��
		for(int i=0; i<ar1.length ; i=i+1) {
			merge[i] = ar1[i];
		}
		//�ι�° �迭�� ������ �ű��
		for(int i=0; i<ar2.length ; i=i+1) {
			merge[ar1.length+i] = ar2[i];
		}
		//������� Ȯ���ϱ� ���� ���
		for(int data : merge) {
			System.out.printf("%d\t", data);
		}
		
	}
}

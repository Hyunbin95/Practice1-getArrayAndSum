
public class Wanjeonsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =0;
		for(int i=1; i<=1000; i++) {
			//����� ���� ������ ����
			int sum=0;
			//����� ���ϱ����ؼ� 1���� �ڽ��� ���ݱ���
			for(int j=1; j<=i/2; j++) {
				//����� ����� �������� ���� ��
				if(i % j == 0) {
					//����� sum�� �߰�
					sum = sum + j;
				}
			}
			
			//�ڽ��� ������ ����� ���� �ڽŰ� ���ٸ�
			if(i == sum) {
				System.out.printf("������:%d\n", i);
				count = count + 1;
			}
		}
		System.out.printf("������ ���� :%d��\n", count);
	}

}

package java0225;

public class SortPractice {

	public static void main(String[] args) {

		String []ar = {"���ؿ�","�嵿��","����","�̿���","�̱���"};
		//�迭�� ���̸� len�� ����
		int len = ar.length;
		//�ִ� n-1 ȸ�� ����
		for(int i=0; i<len-1; i=i+1) {
			//��ġ �̵��� Ȯ���ϱ� ���� ����
			int flag=0;
			//������ �����Ϳ� ��
			for(int j=0; j<len-1-i; j++) {
				//���� �����Ͱ� �� ũ�� ��ġ ����
				if(ar[j].compareTo(ar[j+1])>0) { //�տ��Ͱ� ���ؼ� �տ����� ũ�� 1 ������ 0 ������ -1 ����?
					String temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					flag=1;
				}
				
			}
			for(String imsi : ar) {
				System.out.print(imsi + " ");
			}
			System.out.println();
			//��ġ �̵��� ������ ����
			if(flag==0) {
				break;
			}

			

		}
	}
}
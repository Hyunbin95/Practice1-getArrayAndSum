package java0215;

public class ArrayTest {

	public static void main(String[] args) {
		// �迭�� ������ �� ���߿� �޸� �Ҵ��ϱ�
		int ar1[] ;
		//�迭�� �̸��� ���� ���(������ ������ ���� �� ���)
		//.�� �̿��ؼ� �ٸ� ����� ȣ���ϸ� NullPointerException�� �߻��մϴ�.
		//NullPointerException�� ������ ������ �����͸� �������� ���� ���¿��� �̿�
		//System.out.println("������ ����: "+ ar1.length);
		
		//int ar1[]; ���� ��������
		ar1 = new int[2];
		//��ó�� �迭�� ����� �Ǹ� �� ��Ҵ� ���� 0 �Ǵ� 0.0, false, null�� ä�����ϴ�.
		
		//�迭�� �����ϸ鼭 ũ�⸦ ����
		int  ar2[] = new int [4];
		//int ar2[] =new int[4]; //���� ��������
		
		
		//�ʱ� �����͸� ������ �ִ� ��� �迭�� �ʱⵥ���͸� �����ؼ� �ٷ� ����
		//String [] nation = {"���ѹα�", "��������", "�߱�", "����"}; �Ʒ��� ��������
		String [] nation = new String[] {"���ѹα�", "��������", "�߱�", "����"};
		
		//�迭�̸�.length�� �ϰԵǸ� �迭�� ������ ������ �����մϴ�.
		System.out.println(nation.length);
		
		//�迭�� ��Ҹ� ������ ���� �迭�̸�[�ε���]
		//�ε����� 0���� length -1���� �Դϴ�.
		//2��° ��� ���
		System.out.println(nation[1]);
		
		//�迭�� 5��° ��Ҹ� ���
		//�迭���� �����Ͱ� 4���� �����մϴ�.
		//���� �ε����� �����ϴ� ���� �˴ϴ�.
		//�̷� ��쿡�� ArrayIndexOutOfBoundsException�� �߻��մϴ�.
		//System.out.println("�迭�� 4��° ���: "+ nation[4]);
		
		//�迭�� �����͸� �����ϰ��� �ϸ� �迭 ��ҿ� �����͸� �����ϸ� �˴ϴ�.
		nation[2]="���þ�";
		
		//�迭�� �����͸� ���� - �迭�̸��� null�� �����ϸ� �˴ϴ�.
		ar2 = null;
		
		int [] ar = {30, 70, 20, 40};
		
		for(int i=0; i<4; i++){
			System.out.println("arr["+i+"]" + ar[i]);
		}
		
	}

}

package objecttest;

public class Main {

	public static void main(String[] args) {
		// Data Ŭ������ �ν��Ͻ� ����: �Ű������� �ִ� �����ڸ� ȣ��
		Data data = new Data(1, "������ �̿�ȣ���� ������ ���Ż�","���̽� �� ��� �������� ���������...");
		
		//toString �޼ҵ�� �ν��Ͻ��� ������ ���ڿ��� �������ִ� �޼ҵ�
		System.out.println(data.toString());
		//����ϴ� �޼ҵ忡 �ν��Ͻ� �̸��� �����ϸ� toString�� ȣ��
		System.out.println(data);
	}
}

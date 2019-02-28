package newpackage;

public class Main {
	
	public static void main(String[] args) {
		//��ȣ�� 50493004�̰� �̸��� �������� Data �ν��Ͻ��� ����
		Data data1 = new Data(1,"���̸�");
		
		//��ȣ�� 2�̰� �̸��� ������ Data �ν��Ͻ��� ����
		Data data2 = new Data(2, "����");
	
		//data3�� 1�� ���̸��� ����
		Data data3 = new Data(1,"���̸�");
		
		//data1, data2, data3 �� ���� new�� �����߱� ������
		//���ο� �޸𸮰����� �Ҵ�޾ұ� ������ ����Ű�� �ִ� ������ ��� �ٸ��ϴ�.
		//==�� �����ϰ� �ִ� �����͸� ��
		System.out.println("data 1 == data2 : " + (data1==data2));
		System.out.println("data 1 == data3 : " + (data1==data3));
		
		Data data4 = data1;
		System.out.println("data 1 == data4 : " + (data1==data4));
		
		System.out.println("data 1 equals data2 : " + data1.equals(data2));
		//data1�� data3�� ������ ����������� num�� ���� ���Ƽ� true
		System.out.println("data 1 equals data3 : " + data1.equals(data3));
		
		//������ ����
		Data data5 = data1.clone();
		
		//������ ������ ���� ��� ������ ���� �����͸� �����ϸ�
		//�ٸ��ʿ� ������ �ݴϴ�.
		data4.setName("����");
		System.out.println(data1.getName());
		//������ �ؼ� �� ���� ���� �����ʹ� ���������� ���� �ٸ� ��ҿ�
		//�����͸� ������ �ִ� ���̾ ��� ������ ������ �ٸ� �����Ϳ�
		//������ ���� �ʽ��ϴ�.
		data5.setPh(12);
		System.out.println(data1.getPh());
		
		//���ڿ��� ���ϼ��� Ȯ���� �� ==�� ����ϸ� �ȵǰ� equals�� �̿��ؾ�
		//�մϴ�
		String id = "�ȳ�";
		String copy = new String("�ȳ�");
		System.out.println(id.contentEquals(copy));
		System.out.println(id == "�ȳ�");
	}
}

package java2020;

//���� Ŭ������ ����� Ŭ����
public class Based {
	//�����ڸ� ������ �ʾƵ� �Ʒ� �����ڰ� �ִ� ������ ����
	//�����ڸ� ����� �� �����ڴ� �ڵ� �Ҹ�˴ϴ�.
	
	public Based() {
		System.out.println("�Ű������� ���� ������");
	}
	
	public Based(int a) {
		System.out.println("�Ű������� �ִ� ������");
	}
	
	public void superMethod() {
		System.out.println("���� Ŭ�������� �����ϴ� �޼ҵ�");
	}
	
	public void overrideMethod() {
		System.out.println("���� Ŭ������ �ִ� �������̵� �޼ҵ�");
	}
	
}

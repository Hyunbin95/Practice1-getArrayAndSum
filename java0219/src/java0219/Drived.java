package java0219;

//Based Ŭ�����κ��� ��ӹ��� Derived Ŭ����
public class Drived extends Based {

	public void subMethod() {
		System.out.println("���� Ŭ�������� �����ϴ� �޼ҵ�");
	}
	//���� Ŭ������ �����ϴ� void commonMethod()
	//�� ������ ����� �޼ҵ带 ���� ����
	//���� Ŭ������ ������ ������ �޼ҵ带 ���� Ŭ��������
	//�ٽ� ����� ���� Method Overriding(������)��� �մϴ�.
	public void commonMethod(){
	    System.out.println("���� Ŭ�������� �ٽ� ������ �޼ҵ�");
	 }


}

package interfacetest;

//KoreaFood �������̽��� ������ Ŭ����
public class Menu implements KoreaFood, ChinesFood {

	@Override
	public void bibimbap() {
		System.out.println("��� ä�Ҹ� ���� ����");
	}
	
	@Override
	public void kimchijjigae() {
		System.out.println("��ġ�� ������ �ְ� ���� �䵵��");
	}

	@Override
	public void jjambbong() {
		System.out.println("�����ػ깰�� �ſ���� ��ǰ�� ����");

	}

}

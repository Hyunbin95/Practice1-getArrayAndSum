package interfacetest;

public class Main {

	public static void main(String[] args) {
		//�������̽��� �߻�Ŭ����ó�� �ν��Ͻ� ������ ���մϴ�.
		//KoreaFood menu = new Koreafood();
		
		//������ ������ ���� �������̽��� implements �� Ŭ������
		//�ν��Ͻ��� ������ ������ �� �ֽ��ϴ�.
		Menu menu = new Menu();
		//�������̵� �� �޼ҵ�� ������ ������ ���� �ڷ����� �ƴϰ�
		//�ν��Ͻ��� ������ �� �ν��Ͻ��� �ڷ����� ������ ȣ���մϴ�.
		menu.bibimbap();
		menu.kimchijjigae();
		menu.jjambbong();
	}

}

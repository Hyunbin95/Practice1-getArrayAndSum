package annoymous;

public class Main {

	public static void main(String[] args) {
		// Asia Ŭ������ �ν��Ͻ��� ����
		Asia asia = new Asia();
		// �޼ҵ带 ȣ��
		asia.amugena();
		asia.method();

		// �Ϲ������� ����� �޾Ƽ� �޼ҵ带 �������ؼ� ����ؾ� �ϴ� ���
		// 1.Ŭ������ ��ӹ޾Ƽ� �޼ҵ带 ������
		// 2.�ν��Ͻ��� �����ؼ� �޼ҵ带 ȣ��

		// ��ӹ޴� Ŭ������ ������ �ʰ� �ʿ��� ������ ���� ��������
		// �͸� ��ü�� �̿��ϴ� ���
		new Korea() {
			@Override
			public void amugena() {
				System.out.println("Annoymous class�� �̿��� Ŭ���� ���");
			}
		}.amugena();
		// ��ó�� ������ �������� �ʰ� �ٷ� �޼ҵ带 ȣ���ϸ�
		// �޼ҵ带 1�� �ۿ� ȣ������ ���մϴ�.
		// ������ ������ �����ϰ� ������ �̿��ؼ� �޼ҵ带 ȣ��

		Korea korea = new Asia() {

			@Override
			public void amugena() {
				System.out.println("Annoymous class�� �̿��� Ŭ���� ���");
			}

		};
		korea.amugena();

		// �������̽��� ������ annoymous class�� ���� �ذ�
		/*
		 * new Ŭ�����̸��̳� �������̽��̸�() { �޼ҵ� ������ }.�޼ҵ��̸�();
		 */
		new Vietnam() {
			@Override
			public void method() {
				System.out.println("��Ʈ�� �ұ��� ��ź��̳���?");
			}

		}.method();

	}
}

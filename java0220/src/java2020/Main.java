package java2020;

public class Main {

	public static void main(String[] args) {
		//���� Based�� Ŭ���� �̸��̰�
		//���� Based()�� �����ڸ� ȣ���ϴ� �����Դϴ�.
		//Based Ŭ������ �����ڰ� ���ų� �Ű������� ���� �����ڰ� ������
		//�� ������ ������ ���� �ʽ��ϴ�.
		//�����ڸ� ������µ� �Ű������� ���� �����ڸ� ������ ������ ����
		//Based b = new Based();
		//Based c = new Based(1);
		
		Derived d = new Derived();
		
		//���� Ŭ���� Ÿ���� �ν��Ͻ� ������ ����ȯ ���� �ٷ� ���� ����
		Based b = new Derived();

		//���� Ŭ���� Ÿ���� �ν��Ͻ� ������ ������ ����
		//���� �� ��ȯ�� �����ؼ� �����ؾ� �մϴ�.
		//d = (Derived)new Based(); // ���ܹ߻�
		
		//d = (Derived)b; //���� �߻����� ���� : ���� �ڷ����� Derived
		b = new Based();
		b.overrideMethod(); // Based Ŭ������ overrideMethod�� ȣ��˴ϴ�.
		b = new Derived();
		b.overrideMethod(); // Derived Ŭ������ overrideMethod�� ȣ��˴ϴ�.
	}
}

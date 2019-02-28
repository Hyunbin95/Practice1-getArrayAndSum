package polymorphism;

public class Play {

	public static void main(String[] args) {
		
		Zerg zerg = new Zerg();
		zerg.attack();
		
		Protoss protoss = new Protoss();
		protoss.attack();
		
		Terran terran = new Terran();
		terran.attack();

		//Starcraft�� �߻�ȭ�ϸ� new Starcraft() ; ������ ������ ���ϴ�.
		//Starcraft user = new Starcraft();
		Starcraft user;
		user = new Zerg();
		user.attack();
		
		//Startcraft Ŭ������ ���� ����� ���ؼ� ���� Ŭ������ �ƴϰ�
		//��Ӱ��踦 ����� ���ؼ� ������ Ŭ�����Դϴ�.
		//�� Ŭ������ �ν��Ͻ��� ������ �ʿ䰡 �����ϴ�.
		//�ν��Ͻ��� �������� ���ϵ��� �� ���� class �տ� abstract�� �߰��ؼ�
		//�߻� Ŭ������ ����� �ָ� �˴ϴ�.
		
		//user = new Starcraft();
		user = new Terran();
		user.attack();
	}

}

package polymorphism;

public class Terran extends Starcraft {
	
	@Override
	public void attack() {
		System.out.println("�׶��� ����");
	}
	@Override
	public void gather() {
		System.out.println("SCV���� �̳׶�ä�� ���");
	}
}

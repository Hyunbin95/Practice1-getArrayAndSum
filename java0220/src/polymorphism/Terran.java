package polymorphism;

public class Terran extends Starcraft {
	
	@Override
	public void attack() {
		System.out.println("테란의 공격");
	}
	@Override
	public void gather() {
		System.out.println("SCV에게 미네랄채취 명령");
	}
}

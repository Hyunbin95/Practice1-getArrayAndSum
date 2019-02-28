package polymorphism;

public class Zerg extends Starcraft {
	
	@Override
	public void attack() {
		System.out.println("저그의 공격");
	}
	@Override
	public void gather() {
		System.out.println("드론에게 미네랄채취 명령");
	}
}

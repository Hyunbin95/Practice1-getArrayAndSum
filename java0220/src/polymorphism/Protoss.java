package polymorphism;

public class Protoss extends Starcraft{
	
	@Override
	public void attack() {
		System.out.println("프로토스의 공격");
	}
	@Override
	public void gather() {
		System.out.println("프로브에게 미네랄채취 명령");
	}
}

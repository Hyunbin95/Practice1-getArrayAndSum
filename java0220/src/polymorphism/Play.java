package polymorphism;

public class Play {

	public static void main(String[] args) {
		
		Zerg zerg = new Zerg();
		zerg.attack();
		
		Protoss protoss = new Protoss();
		protoss.attack();
		
		Terran terran = new Terran();
		terran.attack();

		//Starcraft를 추상화하면 new Starcraft() ; 구문은 오류가 납니다.
		//Starcraft user = new Starcraft();
		Starcraft user;
		user = new Zerg();
		user.attack();
		
		//Startcraft 클래스는 실제 사용을 위해서 만든 클래스가 아니고
		//상속관계를 만들기 위해서 생성한 클래스입니다.
		//이 클래스는 인스턴스를 생성할 필요가 없습니다.
		//인스턴스를 생성하지 못하도록 할 때는 class 앞에 abstract를 추가해서
		//추상 클래스로 만들어 주면 됩니다.
		
		//user = new Starcraft();
		user = new Terran();
		user.attack();
	}

}

package interfacetest;

//KoreaFood 인터페이스를 구현한 클래스
public class Menu implements KoreaFood, ChinesFood {

	@Override
	public void bibimbap() {
		System.out.println("밥과 채소를 볶은 음식");
	}
	
	@Override
	public void kimchijjigae() {
		System.out.println("김치와 삼겹살을 넣고 끓인 밥도둑");
	}

	@Override
	public void jjambbong() {
		System.out.println("각종해산물과 매운국물이 일품인 쫨뽕");

	}

}

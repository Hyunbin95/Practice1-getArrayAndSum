package interfacetest;

public class Main {

	public static void main(String[] args) {
		//인터페이스도 추상클래스처럼 인스턴스 생성을 못합니다.
		//KoreaFood menu = new Koreafood();
		
		//참조형 변수를 만들어서 인터페이스를 implements 한 클래스의
		//인스턴스의 참조는 저장할 수 있습니다.
		Menu menu = new Menu();
		//오버라이딩 된 메소드는 변수를 선언할 때의 자료형이 아니고
		//인스턴스를 대입할 때 인스턴스의 자료형을 가지고 호출합니다.
		menu.bibimbap();
		menu.kimchijjigae();
		menu.jjambbong();
	}

}

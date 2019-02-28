package annoymous;

public class Main {

	public static void main(String[] args) {
		// Asia 클래스의 인스턴스를 생성
		Asia asia = new Asia();
		// 메소드를 호출
		asia.amugena();
		asia.method();

		// 일반적으로 상속을 받아서 메소드를 재정의해서 사용해야 하는 경우
		// 1.클래스를 상속받아서 메소드를 재정의
		// 2.인스턴스를 생성해서 메소드를 호출

		// 상속받는 클래스를 만들지 않고 필요한 순간에 만들어서 없어지는
		// 익명 객체를 이용하는 방법
		new Korea() {
			@Override
			public void amugena() {
				System.out.println("Annoymous class를 이용한 클래스 상속");
			}
		}.amugena();
		// 위처럼 변수에 저장하지 않고 바로 메소드를 호출하면
		// 메소드를 1번 밖에 호출하지 못합니다.
		// 변수에 내용을 저장하고 변수를 이용해서 메소드를 호출

		Korea korea = new Asia() {

			@Override
			public void amugena() {
				System.out.println("Annoymous class를 이용한 클래스 상속");
			}

		};
		korea.amugena();

		// 인터페이스를 구현한 annoymous class를 만들어서 해결
		/*
		 * new 클래스이름이나 인터페이스이름() { 메소드 재정의 }.메소드이름();
		 */
		new Vietnam() {
			@Override
			public void method() {
				System.out.println("베트남 쌀국수 드셔보셨나요?");
			}

		}.method();

	}
}

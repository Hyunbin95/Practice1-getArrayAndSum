package java2020;

public class Main {

	public static void main(String[] args) {
		//앞의 Based는 클래스 이름이고
		//뒤의 Based()는 생성자를 호출하는 구문입니다.
		//Based 클래스에 생성자가 없거나 매개변수가 없는 생성자가 있으면
		//이 구문은 에러가 나지 않습니다.
		//생성자를 만들었는데 매개변수가 없는 생성자를 만들지 않으면 에러
		//Based b = new Based();
		//Based c = new Based(1);
		
		Derived d = new Derived();
		
		//하위 클래스 타입의 인스턴스 참조는 형변환 없이 바로 대입 가능
		Based b = new Derived();

		//상위 클래스 타입의 인스턴스 참조를 대입할 때는
		//강제 형 변환을 수행해서 대입해야 합니다.
		//d = (Derived)new Based(); // 예외발생
		
		//d = (Derived)b; //예외 발생하지 않음 : 원래 자료형이 Derived
		b = new Based();
		b.overrideMethod(); // Based 클래스의 overrideMethod가 호출됩니다.
		b = new Derived();
		b.overrideMethod(); // Derived 클래스의 overrideMethod가 호출됩니다.
	}
}

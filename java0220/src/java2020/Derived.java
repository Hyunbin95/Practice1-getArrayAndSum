package java2020;

public class Derived extends Based {
	//상속을 받는 클래스에 묵시적으로 존재하는 내용
	/*
	private Based super;
	
	public Derived() {
		super = new Based(); //이 구문을 super()로 표현합니다.
	}
	*/
	
	//생성자를 직접 만들면 첫번째 줄에 super()가 묵시적으로 삽입됩니다.
	//super()를 직접 호출하는 문장을 추가하면 없어집니다.
	//상위 클래스의 생성자 내용을 먼저 수행하고 하위 클래스의 생성자 내용을
	//수행합니다.
	//상위 클래스에 매개변수가 없는 생성자(Default Constructor)가 없으면
	//생성자를 만들어서 super()를 이용해서 하위 클래스의 생성자를 직접 호출해야 합니다.
	public Derived() {
		System.out.printf("하위 클래스의 생성자\n");
	}
	
	public void subMethod() {
		System.out.println("하위 클래스에만 존재하는 메소드");
	}
	//오버라이딩 된 메소드
	//오버라이딩 된 메소드의 상단에 오버라이딩 된 메소드라는 의미의
	//@Override라는 Annotation을 추가할 수 있습니다.
	@Override
	public void overrideMethod() {
		//상위 클래스의 메소드 호출
		super.overrideMethod();//상위 클래스에 만들어져 있는 메소드 호출
		//오버라이딩의 근본적인 목적이 기능확장이므로 상위 클래스의 메소드를 
		//호출해서 제공되는 기능을 수행하고 자신의 기능을 추가하는 것이
		//오버라이딩 본연의 목적에 맞습니다.
		System.out.println("하위 클래스에 있는 오버라이드 메소드");
	}

}

package java0219;

//Based 클래스로부터 상속받은 Derived 클래스
public class Drived extends Based {

	public void subMethod() {
		System.out.println("하위 클래스에만 존재하는 메소드");
	}
	//상위 클래스에 존재하는 void commonMethod()
	//와 동일한 모양의 메소드를 새로 만듬
	//상위 클래스와 동일한 원형의 메소드를 하위 클래스에서
	//다시 만드는 것을 Method Overriding(재정의)라고 합니다.
	public void commonMethod(){
	    System.out.println("하위 클래스에서 다시 정의한 메소드");
	 }


}

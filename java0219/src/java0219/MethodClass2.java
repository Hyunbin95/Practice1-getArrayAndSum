package java0219;

public class MethodClass2 {

	//static 메소드 - 클래스 이름으로 호출할 수 있는 메소드
	//인스턴스 변수를 사용할 수 없습니다.
	//this가 없기 때문입니다.
	private int age=25;
	private boolean gender;
	
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void staticMethod() {
		//인스턴스 변수를 호출하면 에러
		//age = 10;
		System.out.printf("static method\n");
	}
	//변수 앞에 this가 있으면 메소드 외부에서부터 찾고 this가 없으면
	//메소드 안에서부터 찾습니다.
	public void thisTest() {
		int age = 23;
		System.out.println(age);
		System.out.println(this.age);
	}
}

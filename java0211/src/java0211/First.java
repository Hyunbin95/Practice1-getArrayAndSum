package java0211;

//클래스 선언
public class First {
	//메인 메소드 선언
	public static void main(String[] args) {
		//콘솔에 출력하고 줄 변경을 하는 메소드를 호출
		String b = "이현빈";
		
		new Second();
		Second.selfIntro(b);
		Second.age(25);
		System.out.println(args);
	}

}

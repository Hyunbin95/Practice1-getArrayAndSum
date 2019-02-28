package objecttest;

public class Main {

	public static void main(String[] args) {
		// Data 클래스의 인스턴스 생성: 매개변수가 있는 생성자를 호출
		Data data = new Data(1, "류지혜 이영호와의 숨겨진 과거사","레이싱 모델 출신 류지혜는 지난방송중...");
		
		//toString 메소드는 인스턴스의 내용을 문자열로 리턴해주는 메소드
		System.out.println(data.toString());
		//출력하는 메소드에 인스턴스 이름을 대입하면 toString을 호출
		System.out.println(data);
	}
}

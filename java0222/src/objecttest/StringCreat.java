package objecttest;

public class StringCreat {

	public static void main(String[] args) {
		//String 클래스는 변하지 않는 문자열을 저장하는 클래스
		//작업을 할 때 원본을 복사해서 작업을 수행하고 결과를 리턴합니다.
		//+를 이용해서 다른 문자열이나 숫자를 붙여서 리턴합니다.
		
		String str = "금요일";
		//해시코드 출력
		System.out.println(str.hashCode());
		str = str + "오후";
		System.out.println(str.hashCode());
		
		//StringBuilder 클래스는 변하는 문자열 저장에 사용하는 클래스
		//여분의 공간을 미리 확보해두었다가 자기 자신한테 작업
		StringBuilder sb = new StringBuilder("금요일");
		System.out.println(sb.hashCode());
		sb.append("오후");
		System.out.println(sb.hashCode());

	}
	
}

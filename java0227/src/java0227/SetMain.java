package java0227;

import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		//변수를 선언할 때 사용한 클래스나 인터페이스를 구현한 경우에는
		//변수를 아래처럼 상위 클래스나 인터페이스 타입으로 설정할 수 있습니다.
		Set<String> set = new TreeSet<String>();
		set.add("복학왕");
		set.add("유미의 세포들");
		set.add("랜덤채팅의 그녀");
		set.add("연애의정령");
		set.add("프리드로우");
		set.add("외모지상주의");
		set.add("복학왕");
		
		//모든 데이터를 접근
		for(String weptoon : set) {
			System.out.printf("%s\n", weptoon);
		}


	}

}

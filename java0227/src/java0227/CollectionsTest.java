package java0227;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		//Colletions 클래스의 static 메소드를 이용하면
		//List, Set, Map에 작업을 수행할 수 있습니다.
		//reverse, shuffle, unmodifiableList 등의 메소드가 있습니다.
		List<String> list = new ArrayList<String>();
		list.add("한요한");
		list.add("Young B");
		list.add("Noel");
		list.add("jackey y");
		list.add("swings");
		
		Collections.reverse(list);
		System.out.println(list);
		
		//데이터를 섞어주는 함수 호출
		Collections.shuffle(list);
		System.out.println(list);
		
		//읽기 전용 의 리스트 만들기 - 데이터를 추가하려고 하면 예외 발생
		List<String> readOnlyList = Collections.unmodifiableList(list);
		//readOnlyList.add("kid milly");
	}
}

package java0227;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//Information 클래스의 인스턴스 만들기
		//클래스의 변수가 1개인 경우 첫글자만 소문자로 변경해서
		//사용하는 경우가 있습니다.

		Information info = new Information(1,"이현빈","01050493004");
		
		//구성 요소를 하나씩 출력
		
		
		System.out.printf("번호:%d\n",info.getNum());
		System.out.printf("이름:%s\n",info.getName());
		System.out.printf("전화번호:%s\n",info.getMobile());
		
		//동일한 데이터를 Map을 이용해서 저장
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("num",1);
		map.put("name","이현빈");
		map.put("mobile","01050493004");
		
		//key의 이름을 직접 입력하지 않고 출력
		//map의 key가 변경되더라도 출력하는 부분을 수정할 필요가 없습니다.
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.printf("%s:%s\n", key,map.get(key));
		}
		

	}

}

package java0227;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//Information Ŭ������ �ν��Ͻ� �����
		//Ŭ������ ������ 1���� ��� ù���ڸ� �ҹ��ڷ� �����ؼ�
		//����ϴ� ��찡 �ֽ��ϴ�.

		Information info = new Information(1,"������","01050493004");
		
		//���� ��Ҹ� �ϳ��� ���
		
		
		System.out.printf("��ȣ:%d\n",info.getNum());
		System.out.printf("�̸�:%s\n",info.getName());
		System.out.printf("��ȭ��ȣ:%s\n",info.getMobile());
		
		//������ �����͸� Map�� �̿��ؼ� ����
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("num",1);
		map.put("name","������");
		map.put("mobile","01050493004");
		
		//key�� �̸��� ���� �Է����� �ʰ� ���
		//map�� key�� ����Ǵ��� ����ϴ� �κ��� ������ �ʿ䰡 �����ϴ�.
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.printf("%s:%s\n", key,map.get(key));
		}
		

	}

}

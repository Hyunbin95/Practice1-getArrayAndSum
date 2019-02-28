package java0227;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapUse {

	public static void main(String[] args) {
		//��ȣ(int), �̸�(String), ����(int)�� ��� ����
		
		Map<String, Object> map = new HashMap<String, Object>();
		//������ ����
		map.put("num", 1);
		map.put("name", "������");
		map.put("age",25);
		
		//�����͸� ������ ����ϱ�
		System.out.printf("%s\n", map.get("name"));
		System.out.printf("%s\n", map.get("num"));
		//���� Ű�� �̿��ؼ� �����͸� �������� null
		System.out.printf("%s\n", map.get("address"));
		
		//������ �߰� - ���� key �̿�
		map.put("job","���ػ�");
		//������ ���� - �����ϴ� key�� ������ �߰��ϸ� ����
		map.put("num",2);
		//������ ����
		map.remove("age");
		System.out.println(map.toString());
		
		//���� �����͸� �ϳ��� ���� ���
		//���� ��� Ű�� ���� ��������
		Set<String> keySet = map.keySet();
		//���� ���Ÿ� �̿��ؼ� keySet�� ��� �����͸� ����
		for(String key : keySet) {
			System.out.printf("%s:%s\n",key, map.get(key));
		}
	}

}
